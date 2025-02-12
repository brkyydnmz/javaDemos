public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        String yenimesaj = sehirVer();
        System.out.println(yenimesaj);
        int sayi = topla(5, 7);
        System.out.println("Toplam: " + sayi);
        int toplam = topla2(2,3,4,5,6,10);
        System.out.println(toplam);

    }

    // void emreder yap et void olmak zorunda değildir
    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static void sil() {
        System.out.println("Silindi");
    }

    public static void guncelle() {
        System.out.println("Güncellendi");
    }

    //return döndür demek bize işlemi yapıp döndürür altta sayi1 ile sayi2 toplayıp bize verir
    // int demek altta:bu fonksiyon integer türünde bir değer döndürür demek
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    //birden fazla int göndericem ben demek istiyorsak parantez içine 3 nokta konur(...)
    public static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }
}
