public class Main {

    public static void main(String[] args) {
        //ARRAYS(DİZİLER)

        String ogrenci1 = "Engin";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Salih";
        String ogrenci4 = "Ahmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("--------------------");

        //alttaki [] işsareti bir dizi olduğunu göstermek için kullanılır
        //new Strinng[3] 3 elemanlı olduğunu belirtir

        String[] ogrenciler = new String[4];
        ogrenciler[0]="Engin";
        ogrenciler[1]="Derin";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ahmet";

        //length eleman sayısıdır
        //length sayısı neden küçük dedik cünkü 3 tane elemanımız var 0 dan başladık o yüzden 0,1,2 olucak 3 olursa fazlalık olur
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]); //ogrencilerin i inci elemanı dedik çünkü for döngüsü çalışsın
        }

        System.out.println("--------------------");

        //alttaki for ogrenciler dizisindeki her bir elemanı gez demektir
        //ogrenci yerine random bi isim de verebilirsin de daha sonra okurken zorluk olabilir
        // en çok kullanılan alttakidir.
        
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}
