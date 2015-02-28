/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Template
 * and open the template in the editor.
 */
package contactslist;

/**
 *
 * @author DmintriP
 */
public abstract class Contacts {
   /**
    * @param fName contacts first name 
    * @param lName contacts last name
    * @param phoneNum contacts phone number
    * @param address contacts address 
    * @param eMAil contacts e mail address
    */ 
    private String fName;
    private String lName;
    private String phoneNum;
    private String address;
    private String eMail;

    public Contacts(String fName, String lName, String phoneNum, String address, String eMail) {
        this.fName = fName;
        this.lName = lName;
        this.phoneNum = phoneNum;
        this.address = address;
        this.eMail = eMail;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "Contacts{" + "first name=" + fName + " \n" + ", last name=" + lName + ", phone number=" + phoneNum + ", address=" + address + ", e-mail=" + eMail + '}';
    }
    
    
    
}
