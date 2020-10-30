import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList <Customer> customers = new ArrayList<Customer>();

        Customer berkay = new Customer(1,"Berkay","Dönmez");
        customers.add(berkay);
        customers.add(new Customer(2,"Derin","Dönmez")); //müşteri oluşturduk
        customers.add(new Customer(3,"Salih","Dönmez"));
        customers.add(new Customer(4,"Doğa","Dönmez"));


        //customers.remove(new Customer(1,"Berkay","Dönmez")); Bu silme işlemi olmaz HATA VERİR , LİSTEDEN HERHANGİ BİR ELEMAN SİLİNMEZ!!!

        //customers.remove(berkay);  B u işlem siler sebebi de yukarıda erişim için Customer a ekleme yaptık customers a da o ismi yazdık Sebebi: ileride silebilmek için. new lenmemiş hale ekleme yapmak daha mantıklıdır


        for(Customer customer:customers){
            System.out.println(customer.firstName);
        }

    }
}
