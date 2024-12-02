/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constant_package;

/**
 *
 * @author deepthiramesh
 */
public abstract class Database_Details {
    private static final String JDBC_URL = "jdbc:mysql://localhost/";
    private static final String DATABASE = "xx";
    private static final String USER = "root";
    private static final String PASSWORD = "password"; 
    
    public static String getConnectionUrl() {
        return JDBC_URL + DATABASE;
    }
    
    public static String getUser() {
        return USER;
    }
    
    public static String getPassword() {
        return PASSWORD;
    }
}