/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package post_office;
import Class.Letter;
import Class.Parcel;
import java.util.Scanner;

/**
 *
 * @author <Md. Nafiz Imam Zilani>
 */
public class Post_office {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        //Sender data collection
        System.out.println("Sender Data:");
        System.out.println("Name: ");
        String sName = s1.nextLine();
        System.out.println("Address : ");
        String sAddress = s1.nextLine();
        System.out.println("Phone: ");
        String sPhone = s1.nextLine();
        
        //Reciver data collection
        System.out.println("Reciver Data:");
        System.out.println("Name: ");
        String rName = s1.nextLine();
        System.out.println("Address : ");
        String rAddress = s1.nextLine();
        System.out.println("Phone: ");
        String rPhone = s1.nextLine();
        
        System.out.println("Select the way: ");
        System.out.println("1. Normal Letter");
        System.out.println("2. Registered Letter");
        System.out.println("3. Simple Parcel");
        System.out.println("4. Special Parcel");
        
        System.out.println("Select by no:");
        int i = s1.nextInt();
        
        
        if (i == 1) {
            Letter l1 = new Letter(sName, rName, sAddress, rAddress, sPhone, rPhone);
            System.out.println("Enter Price: ");
            int price = s1.nextInt();
            l1.showData();
            l1.normalLetter(price);
        }
        else if (i == 2) {
            Letter l1 = new Letter(sName, rName, sAddress, rAddress, sPhone, rPhone);
            System.out.println("Enter Price: ");
            int price = s1.nextInt();
            l1.showData();
            l1.regLetter(price);
        } 
        else if (i == 3) {
            Parcel r1 = new Parcel(sName, rName, sAddress, rAddress, sPhone, rPhone);
            System.out.println("Enter Price: ");
            int price = s1.nextInt();
            r1.showData();
            r1.normalParcel(price);
        } 
        else if (i == 4) {
            Parcel r1 = new Parcel(sName, rName, sAddress, rAddress, sPhone, rPhone);
            System.out.println("Enter Price: ");
            int price = s1.nextInt();
            r1.showData();
            r1.regParcel(price);
        } 
        else {
            System.err.println("Wrong");
        }
    }
    
}
