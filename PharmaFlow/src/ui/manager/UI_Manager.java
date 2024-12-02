/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.manager;

import java.awt.FlowLayout;
import javax.swing.JPanel;
import ui.login.LoginPageJPanel;
import ui.manufacturer.ManufacturerAdminJPanel;

/**
 *
 * @author KAILASH
 */
public class UI_Manager {
    private final static MainJFrame frame = new MainJFrame();
    private static LoginPageJPanel loginPageJPanel;
    
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
        manuAdministratorPanel = new ManufacturerAdminJPanel(username, manId);
        removeAndAddPanel(manuAdministratorPanel);
    }
}
