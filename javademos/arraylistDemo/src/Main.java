import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        int[] sayilar = new int[]{1,2,3};
//        //sayilar[3]=4; //yazarsak 4.elemanı 4 dedik burda ama 4.eleman olmadığı için hata verir
//        sayilar = new int[4]; //int[4] 4 elemanlı demektir
//        System.out.println(sayilar[0]); // bir üst satırda newlediğimiz için sayıların 0.elemanı 0 oldu yani default değer oldu en üste 1 bakarak 1 beklerken
//        Arraylist i bu halde kullanmak gerksizdir ve çok az kullanılır.type-safe şekilde(int se int vs.) kullanmak tercih edilir
        ArrayList sayilar =new ArrayList();

        //arraylist e istediğini ekleyebilirsin string olur int olur vs.

        sayilar.add(1); //arraylist e eleman ekler bu
        sayilar.add(10);
        sayilar.add("Ankara");
        System.out.println(sayilar.size()); //eleman sayısı
        System.out.println(sayilar.get(2)); //3.indexi okudr bu bize 3.indexi getirir 0,1,2 diye devem ettiğinden 3.index oluyor
        sayilar.set(0,100); //0.indexi 1 den 100 e çevirdik
        sayilar.set(0,1);
        System.out.println(sayilar.get(0));
        //sayilar.remove(0); //0.indexi silersek 1.indeximiz 0.index olur ve 0.index 10 olur
        //sayilar.clear(); //tüm elemanları siler

        for (Object i:sayilar){   //arraylist elemanlarına ulaşırken int vs. olmaz obje olarak ulaşmamız gerek (Object)
            System.out.println(i);
        }



    }
}
