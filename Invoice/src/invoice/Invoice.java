/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author DmintriP
 * Describe an invoice for purchased products
 */
import java.util.ArrayList;
public class Invoice {

    /**
     * Adds a charge for a product Invoice 
     * @param aProduct the product the customer ordered
     * @param quantity the quantity of the product 
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
    
    
//    
     
    
    private Address billingAddress;
    private ArrayList<LineItem> items;
    
   /**
      Construct an Invoice
      @param anAddress the billing address
     */
    
    public Invoice (Address anAddress)
    {
        items = new ArrayList<LineItem>();
        billingAddress = anAddress;
        
    }
    /**
     * Adds a charge for a product to this invoice.
     * @param aProduct the product the customer ordered
     * @param quantity  the quantity of the product 
     */
     
            
    public void add(Product aProduct, int quantity)
    {
        LineItem anItem= new LineItem(aProduct,quantity);
        items.add(anItem);
        
    }
    /**
     * Formats the invoice 
     @return the formatted invoice
     * 
     */
 
    public String format()
    {
    String r ="                                 I N V O I C E\n\n"  +billingAddress.format()+
    String.format("\n\n%-30s%8s%5s%8s\n","Description","Price","Qty","Total");
    for(LineItem item : items){
        r= r + item.format() + "\n";
    }
    r = r + String.format("\nAMOUNT DUE: $%8.2f", getAmountDue());
    return r;
    }
    /**
     * Computes the total amount due.
     * @return the amount due
     */
     public double getAmountDue()
     {
         double amountDue = 0;
         for (LineItem Item : items)
         {
             amountDue += item.getTotalPrice();
         }
         return amountDue;
     }
    
    /**
     * Describe a quantity of an article to purchase.
     */
     
    public class LineItem 
    {
         private int quantity;
        private Product theProduct; 
   /**
    * Construct an item from the product and quantity
    * @param aProduct the product
    * @param aQuantity the item quantity
    */
        
      public LineItem(Product aProduct, int aQuantity)
      {
          theProduct = aProduct;
          quantity =aQuantity;
      }
      /**
       * Computes the total cost of the line item
       * @return  the total price
       */
 
public double getTotalPrice()
{
    return theProduct.getTotalPrice() * quantity;
}
/**
 * format this item 
 * @return a formatted string of this line item
*/

Public String Format()
{
  return String.format("%-30s%8.2f%5 d%8.2f", theProduct.getDescription(), theProduct.getPrice(),quantity,getTotalPrice());
}
    }
/**
 * Describe a product with a description price
 */
Public Class Product
        {
            private String description;
            private double price;
        /**
         * Constructs a product from a description and a price
         * @param aDrescription the product description
         * @param aPrice the product price 
         */
            
        public Product(String aDescription, double aPrice)
        {
            description = aDescription;
            price  = aPrice;
        }
        
        
        /**
         * Gets the product description
         * @return the description
        */
        public String getDescription()
        {
            return description;
        }
        /**
         * Gets the product price
         * @return the unit price 
         */
        public double getPrice()
        {
            return price;
        }
       }

        /**
         * Describe a mailing address
         */

public class Address
{
   private String name;
   private String street;
   private String city;
   private String state;
   private String zip;
 /**
     * Construct a mailing address
     * @param aName the recipient name
     * @param aStreet the street
     * @param aCity the city
     * @param aState the state
     * @param aZip the zipcode
    */
   public Address(String aName, String aStreet, String aCity, String aState, String aZip)
   {
       name = aName;
       street = aStreet;
       city = aCity;
       state =aState;
       zip = aZip;
   }
   /**
    * formats the address
    * @return the address as a string with 3 lines 
    */
   

public String format()
{
    return name + "\n "+ street +"\n" + city + "," + state + " " + zip;
    
}
}


    
    
    
    