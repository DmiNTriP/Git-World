/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactslist;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DmintriP
 */
public class Personal extends Contacts {

    Scanner in = new Scanner(System.in);
    private String birthDate;

    public Personal(String birthDate, String fName, String lName, String phoneNum, String address, String eMail) {
        super(fName, lName, phoneNum, address, eMail);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String birthDayFormat(String bDay) {
       
    }
    public String newBirthDate(){
        String dob="";
        birthDayFormat(dob);
        dob = getBirthDate();
        return dob;
    }
   

    @Override
    public String toString() {
        return "Personal{" + "birthDate=" + newBirthDate() + '}';
    }

}


