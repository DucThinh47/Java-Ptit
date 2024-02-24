/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OnTap;

/**
 *
 * @author Duc Thinh
 */
import java.util.*;

class Payment {
    
    // pay through credit card
    void makePayment(String cardNumber, String cvv, String expiryDate) {
        System.out.println("Payment Through Credit Card is Successful");
    }
    
    // pay through Paypal
    void makePayment(String id) {
        System.out.println("Payment Through PayPal is Successful");
    }
}
 
class Main {
    public static void main(String[] args) {
        
        Payment pay = new Payment();
        
        // make payment through credit card
        pay.makePayment("5415 3252 3523 6315", "131", "12/025");
        
        // make payment through PayPal
        pay.makePayment("97629639067");
    }
}