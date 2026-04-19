    interface Payment
    {
        void payment();// in interface we only declare the method and it is defined in the class
    }

    class CreditCard implements Payment{
        public void payment()
        {
            System.out.println("Paid via card");
        }
    }

    class UPI implements Payment{
        public void payment()
        {
            System.out.println("Paid via UPI");
        }
    }

public class Interfaces_Class {
        public static void main(String args[])
    {
        CreditCard c= new CreditCard();
        c.payment();
        UPI u= new UPI();
        u.payment();
    }
}
