public class bank {
    private static int customerid;
    private static String firstname;
    private static String lastname;
    private static String email;
    private static String accountype;
    private static int phonenumber;
    private static int accountnumber;
    private static double balance;
    

    private bank (){
        this.customerid=0;
        this.firstname="name";
        this.lastname="lastname";
        this.email="email";
        this.phonenumber=00;
        this.accountnumber=00;
        this.balance=00;
    }
    private bank (int customerid, String firstname,String lastname,String email, int phonenumber, int accountnumber,double balance){
        this.customerid=customerid;
        this.firstname=firstname;
        this.lastname=lastname;
        this.email=email;
        this.phonenumber=phonenumber;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    private bank(bank other){
        this.customerid=other.customerid;
        this.firstname=other.firstname;
        this.lastname=other.lastname;
        this.email=other.email;
        this.phonenumber=other.phonenumber;
        this.accountnumber=other.accountnumber;
        this.balance=other.balance;
    }
    private String tostring() {
        return ("customerid"+this.customerid+"firstname"+this.firstname+"lastname"+this.lastname+"email"+this.email+"phone number"+this.phonenumber+"accountnumber"+this.accountnumber+"account type"+this.accountype+"balance"+this.balance);
    }


    private boolean equals (bank other){return (this.customerid==other.customerid);}
    private void deposit (double addition){
        if (addition>0){
            this.balance=this.balance+addition;
            System.out.println("deposit succesful. your new balance"+this.balance);
        }
        else 
            System.out.println("insufficent deposit amount");
    }
    private void withdraw(double withdraw){
        if (withdraw>0 && withdraw>=this.balance){
            this.balance=this.balance-withdraw;
            System.out.println("withdraw succesful. your new balance"+this.balance);
        }
        else 
            System.out.println("insufficent withdraw amount");
    }

    public int getcustomerid() { return customerid; }
    public String getfirstname() { return firstname; }
    public String getlastname() { return lastname; }
    public String getemail() { return email; }
    public String getphonenumber() { return phonenumber; }
    public String getaccountype() { return accountype; }
    public double getbalance() { return balance; }

    public void setcustomerId(int customerId) { this.customerId = customerId; }
    public void setfirstName(String firstName) { this.firstName = firstName; }
    public void setlastName(String lastName) { this.lastName = lastName; }
    public void setemail(String email) { this.email = email; }
    public void setphoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setaccountType(String accountType) { this.accountType = accountType; }
    public void setbalance(double balance) { this.balance = balance; }


    

}
 