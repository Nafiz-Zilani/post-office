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
public abstract class  Person {
    protected String sName;
    protected String rName;
    protected String sAddress;
    protected String rAddress;
    protected String sNumber;
    protected String rNumber;

    public Person(String sName, String rName, String sAddress, String rAddress, String sNumber, String rNumber) {
        this.sName = sName;
        this.rName = rName;
        this.sAddress = sAddress;
        this.rAddress = rAddress;
        this.sNumber = sNumber;
        this.rNumber = rNumber;
    }

    
    public void showData(){
        //Null
    }
}
