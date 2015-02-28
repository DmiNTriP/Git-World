/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactslist;

/**
 *
 * @author DmintriP
 */
public class Business extends Contacts {
    private String department;
    private String jobTitle;

    public Business( String fName, String lName, String phoneNum, String address, String eMail,String department, String jobTitle) {
        super(fName, lName, phoneNum, address, eMail);
        this.department = department;
        this.jobTitle = jobTitle;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Business{" + "department=" + department + ", jobTitle=" + jobTitle + '}';
    }
    
    
    
}
