public class Main {
        //class çağırma alttaki gibi olur biz burda bu class ı kullanırken customerManager demek istedik herhangibir isim olabilir.
        // new ile yeni bir ad verdirdik gibi düşünebiliriz new yazmadan olmaz
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(); //bu saoluk new kısmı çöpe gider siz silmeseniz de java kendi çöpe atar arkaplanda
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //customerManager 1 deki new gereksiz kaldı bu sayede 2.new çalıştı
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        int sayi1= 10;
        int sayi2=20;
        sayi2=sayi1; //sayi2 nin değeri eşittir sayi1 in değeri demektir.Böylece sayi2 20 yerine 10 oluyor
        sayi1=30; //sayi1 in değeri 30 dur
        System.out.println("Sayı 2: "+ sayi2);

        int [] sayilar1 = new int[] {1,2,3};
        int [] sayilar2 = new int[] {4,5,6};
        sayilar2=sayilar1; //sayilar2 de 1,2,3 oldu
        sayilar1[0]=10;//sayilar1 in de sayilar2 nin de 0.elemanı 10 oldu
        System.out.println(sayilar2[0]);
    }


}


