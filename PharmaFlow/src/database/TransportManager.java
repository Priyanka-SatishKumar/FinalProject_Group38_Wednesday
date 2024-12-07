/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.pharmacy.PharmacyPurchaseOrder;

/**
 *
 * @author priyankasatish
 */
public class TransportManager {
    public static java.sql.Connection con = Connection.getConnection();
    public static boolean confirmShipmentStatus(int orderId) throws Exception {
        boolean isShipped = false;
        try {
            String queryToUpdateStatus = """
                UPDATE pharmacy_order
                SET order_status=\"DELIVERED\"
                WHERE order_id=%s""";
            queryToUpdateStatus = String.format(queryToUpdateStatus, orderId);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(queryToUpdateStatus);
            
            PharmacyPurchaseOrder order = Common_Functions.getOrderFromOrderId(orderId);
            PharmacyManager.updateStockAndQuantity(order);
            return !isShipped;
        } catch (SQLException e) {
            throw e;
        }
    }
    public static ResultSet fetchAllShipments(int transporterId) throws Exception {
        try {
            String queryToFetchShipments = """
                SELECT s.shipment_id, p.order_date, p.pharmacy_id, c1.company_name AS pharmacy_name, c2.company_name AS distributor_name, s.shipment_status
                FROM shipment s
                JOIN pharmacy_order p ON p.order_id=s.order_id
                JOIN company c1 ON p.pharmacy_id=c1.company_id
                JOIN company c2 ON s.distributor_id=c1.company_id
                WHERE c1.transporter_id=%s""";
            queryToFetchShipments = String.format(queryToFetchShipments, transporterId);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(queryToFetchShipments);
            return rs;
        } catch (SQLException e) {
            throw e;
        }
    }

    
}
