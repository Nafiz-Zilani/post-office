/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author <Md. Nafiz Imam Zilani>
 */
public class Parcel extends Person{
    private final int regParcePrice = 150;
    private int percelPrice; 

    public Parcel(String sName, String rName, String sAddress, String rAddress, String sNumber, String rNumber) {
        super(sName, rName, sAddress, rAddress, sNumber, rNumber);
    }
    
    public void normalParcel(int percelPrice){
        System.out.println("Normal Parcel\nCost: "+percelPrice+" Tk");
    }
    
    public void regParcel(int percelPrice){
        this.percelPrice = percelPrice;
        percelPrice = percelPrice+regParcePrice;
        System.out.println("Registered Parcel\nCost: "+percelPrice+" Tk");
    }

    @Override
    public void showData() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Sender Info: \nName: "+sName+"\nAddress: "+sAddress+"\nPhone No.: "+sNumber);
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Reciver Info: \nName: "+rName+"\nAddress: "+rAddress+"\nPhone No.: "+rNumber);
        System.out.println("------------------------------------------------------------------------");
    }
}
