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
public class Letter extends Person{
    private final int regLetterPrice = 100;
    private int letterPrice; 

    public Letter(String sName, String rName, String sAddress, String rAddress, String sNumber, String rNumber) {
        super(sName, rName, sAddress, rAddress, sNumber, rNumber);
    }
    
    public void normalLetter(int letterPrice){
        System.out.println("Normal Letter\nCost: "+letterPrice+" Tk");
    }
    
    public void regLetter(int letterPrice){
        this.letterPrice = letterPrice;
        letterPrice = letterPrice+regLetterPrice;
        System.out.println("Registered Letter\nCost: "+letterPrice+" Tk");
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
