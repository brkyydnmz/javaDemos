public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManager();    //oracle yerine sql yazarsan sql getirir
        customerManager.getCustomers();
    }
}

//yeni database eklerken de sadece extends yaparız BaseDataManager ı
