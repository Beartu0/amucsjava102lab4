public class bank {
    private  int customerid;
    private  String firstname;
    private  String lastname;
    private  String email;
    private  String accountype;
    private  int phonenumber;
    private  int accountnumber;
    private  double balance;
    

    private bank (){
        this.customerid=0;
        this.firstname="lorem ipsum dolor";
        this.lastname="lorem ipsum dolor";
        this.email="lorem ipsum dolor";
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
    
    public String tostring() {
        return ("customerid"+this.customerid+"firstname"+this.firstname+"lastname"+this.lastname+"email"+this.email+"phone number"+this.phonenumber+"accountnumber"+this.accountnumber+"account type"+this.accountype+"balance"+this.balance);
    }

    
    public boolean equal (bank other){return (this.customerid==other.customerid&&this.firstname.equals(other.firstname)&&this.lastname.equals(other.lastname)&&this.accountnumber==other.accountnumber&&this.email.equals(other.email));}
    public void deposit (double addition){
        if (addition>0){
            this.balance=this.balance+addition;
            System.out.println("deposit succesful. your new balance"+this.balance);
        }
        else 
            System.out.println("insufficent deposit amount");
    }
    public void withdraw(double withdraw){
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
    public int getphonenumber() { return phonenumber; }
    public String getaccountype() { return accountype; }
    public double getbalance() { return balance; }

    public void setcustomerId(int customerId) { this.customerid = customerId; }
    public void setfirstName(String firstName) {this.firstname = firstName; }
    public void setlastName(String lastName) { this.lastname = lastName; }
    public void setemail(String email) { this.email = email; }
    public void setphoneNumber(int phoneNumber) { this.phonenumber = phoneNumber; }
    public void setaccountType(String accountType) { this.accountype = accountType; }
    public void setbalance(double balance) { this.balance = balance; }


    

}
 