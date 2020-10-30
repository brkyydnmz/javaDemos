public class CustomerManager {

    BaseDatabaseManager databaseManager;  //burdaki base sınıf bizim stratejimiz görevini görüyor kullanırken hangi database i verirsek onun getDatası çalışıcak

    public void getCustomers(){
        databaseManager.getData();
    }
}
