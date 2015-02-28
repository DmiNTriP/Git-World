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

    public Personal( String fName, String lName, String phoneNum, String address, String eMail,String birthDate) {
        super(fName, lName, phoneNum, address, eMail);
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
           String bDate= "";
        //System.out.println("Please enter your birthdate in this format MM/DD/YYYY");
        bDate = in.next();
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        // DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String birth = formatter.format(bDate);
        birth = bDate;
        bDate = this.birthDate;
        return bDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

//    public String birthDayFormat(String bDay) {
//        
//        String bDate= "";
//        //System.out.println("Please enter your birthdate in this format MM/DD/YYYY");
//        bDate = in.next();
//        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//        // DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
//        String birth = formatter.format(bDate);
//        birth = bDate;
//        bDate = bDay;
//        return bDate;
//    }
//    public String newBirthDate(){
//        String dob="";
//        birthDayFormat(dob);
//        dob = getBirthDate();
//        return dob;
//    }
//   

    @Override
    public String toString() {
        return super.toString() + "Personal{" + "birthDate=" + birthDate + '}';
    }

   
    }




