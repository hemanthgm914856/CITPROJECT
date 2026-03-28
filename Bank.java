public class Bank{
    public static void main(String[] args) {
        float bal=1000.00f;
        float amt=500.00f;
        System.out.println("Balance is: "+bal);
        deposit(amt);
        
    }
    static void deposit(float amt){
        float bal=1000.00f;
        System.out.println("Amount to be deposited is: "+amt);
        bal=bal+amt;
            System.out.println("Balance after deposit is: "+bal);
        }
        
    }
