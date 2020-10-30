import java.security.cert.LDAPCertStoreParameters;

public class Main {

    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length());
        System.out.println("5.eleman : " + mesaj.charAt(4));     //charAt 5.elemanda ne yazdığını buldurdu
        System.out.println(mesaj.concat(" Yaşasın!"));      //concat birleştirir değişkene atamadığımız için mesaj a dahil olmadı
        System.out.println(mesaj);
        System.out.println(mesaj.startsWith("B"));  //B ile başlıyor mu başlıyorsa true başlamıyorsa false döndürür
        System.out.println(mesaj.endsWith("."));    //. ile bitiyor mu bu da

        System.out.println("****************");
        char[] karakterler = new char[5];
        mesaj.getChars(0, 4, karakterler, 0);     //getChars 0 dan 4 e kadar elemanları karakterlere 0 dan başlayarak ata demektir
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf("a")); //belirttiğim karakterin(string de olabilir) mesajın içinde kaçıncı eleman olduğunu bulmaya yarar.İlk bulduğunu verip işi bitirir.
        System.out.println(mesaj.lastIndexOf("a"));  //aramaya sağdan başlar ama sırası soldan başlanmış gibidir yine

        System.out.println("****************");
        String yeniMesaj = mesaj.replace(" ", "-");
        System.out.println(yeniMesaj); //replace değiştirme yapar.Değişken tanımlayarak yeniden kullanabilrsin 1 yukarıda yaptığımız şekilde
        System.out.println(mesaj);
        System.out.println(yeniMesaj);

        System.out.println("****************");
        System.out.println(mesaj.substring(2));
        System.out.println(mesaj.substring(2, 4));  //mesajın kaçıncı indeksten parçalayacağını belirler.İstersek belirli aralığı da keser

        System.out.println("****************");
        for (String kelime : mesaj.split(" ")) { //split belirlenen karaktere göre ayırma yapar
            System.out.println(kelime);
        }
        System.out.println("****************");
        System.out.println(mesaj.toLowerCase());   //mesajı tamamen küçük harfe çevirir
        System.out.println(mesaj.toUpperCase());   //mesajı tamamen büyük yapar
        System.out.println(mesaj.trim());   //mesajın başında ve sonunda boşluk varsa kaldırır.

    }

}
