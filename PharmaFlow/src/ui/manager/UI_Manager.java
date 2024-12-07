/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.manager;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import ui.distributor.DistributorManagerJPanel;
import ui.login.LoginPageJPanel;
import ui.manufacturer.ManufacturerAdminJPanel;
import ui.pharmacy.PharmacyAdministratorPanel;

/**
 *
 * @author KAILASH
 */
public class UI_Manager {
    private final static MainJFrame frame = new MainJFrame();
    private static LoginPageJPanel loginPageJPanel;
    private static  ManufacturerAdminJPanel map;
    private static PharmacyAdministratorPanel pam;
    private static DistributorManagerJPanel dmp;
    
    private static void removeAndAddPanel(JPanel panel) {
        frame.getContentPane().removeAll();
        frame.add(panel);
        frame.repaint();
        frame.revalidate();
    }
    
    public static void init(){
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        loginPageJPanel = new LoginPageJPanel();
        removeAndAddPanel(loginPageJPanel);
    }
    
    public static void AddManuAdminPanel(String username, int manId) 
        {
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        map = new ManufacturerAdminJPanel(username, manId);
        removeAndAddPanel(map);
    }
    
    public static void AddpharmacyAdminPanel(String username, int pharmacyId) {
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        pam = new PharmacyAdministratorPanel(username, pharmacyId);
        removeAndAddPanel(pam);
    }
    
    public static void AddDistributorManagerPanel(String username, int distributorId){
      frame.setLayout(new FlowLayout());
      frame.setVisible(true);
      dmp = new DistributorManagerJPanel(username, distributorId);
      removeAndAddPanel(dmp);  
    }
    
//    public static void AddCompanyRegPanel(String companyType){
//        frame.setLayout(new FlowLayout());
//        frame.setVisible(true);
//        companyRegPanel = new CompanyRegisterationPanel(companyType);
//        removeAndAddPanel(companyRegPanel);  
//      }
}
