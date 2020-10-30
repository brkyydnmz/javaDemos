public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
	    customerManager.add();
    }
}

//new OracleCustomerDal() gönderince CustomerManager.java da ki public CustomerManager içindeki paranteze eşitleniyor.