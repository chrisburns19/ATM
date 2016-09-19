package ATM;

/**
 * Created by christopherburns on 9/19/16.
 */
public class Customer {
    private String firstName;
    private String lastName;
    private int customerID;
    private String pin;


    public Customer (){
        firstName = "";
        lastName = "";
        customerID = (int)(Math.random()*9000)+1000;
        pin = "";

    }

    Customer customer = new Customer();
    

}
