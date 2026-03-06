/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ice_1_task;

import javax.swing.JOptionPane;

/**
 *
 * @author majik
 */
public class ICE_1_Task {
public static void main(String[] args) {
        // TODO code application logic here
        String name = JOptionPane.showInputDialog("Enter your name:");
        String studentNumber = JOptionPane.showInputDialog("Enter your student number:");
        JOptionPane.showMessageDialog(null,"user name:" + name + "\nStudent Number:" + studentNumber);
        String item = JOptionPane.showInputDialog("Enter item (Burger/Pizza):");


        
        double price = 0;

        if (item.equalsIgnoreCase("Burger")) {
            price = 45.50;
        
    }
        else if (item.equalsIgnoreCase("Pizza")) {
            price = 60.00;
    
}else {
            JOptionPane.showMessageDialog(null, "Invalid item selected!");
            return;
        }
        // Ask for quantity
        int quantity = Integer.parseInt(
                JOptionPane.showInputDialog("Enter quantity:")
        );

        // Check if quantity is valid
        if (quantity <= 0) {
            JOptionPane.showMessageDialog(null, "Quantity must be greater than 0!");
            return;
        }

        // Calculations
        double subtotal = price * quantity;
        double vat = subtotal * 0.15;
        double total = subtotal + vat;

        // Display receipt
        JOptionPane.showMessageDialog(null,
                "===== RECEIPT =====" +
                "\nName: " + name +
                "\nStudent Number: " + studentNumber +
                "\nItem: " + item +
                "\nPrice: R" + price +
                "\nQuantity: " + quantity +
                "\nSubtotal: R" + subtotal +
                "\nVAT (15%): R" + vat +
                "\nTotal: R" + total
        );
    }
}
        

  
