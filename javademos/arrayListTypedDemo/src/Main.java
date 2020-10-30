import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> sehirler=new ArrayList<String >();           // <> içine ne yazarsak o veri tipinde kullanırız sadece
        sehirler.add("Ankara");
        //sehirler.add(1); bu EKLENEMEZ String değildir
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        sehirler.add("Aydın");
        //sehirler.remove("İstanbul");   bu şekilde de silme işlemi yapabiliriz 0. 1. index demek yerine

        Collections.sort(sehirler);  //sort sırala demektir döngüye girmedenönce sehirleri sıraladık.

        for (String sehir: sehirler){   //for döngüsü ile arraylist i gezdik
            System.out.println(sehir);
        }


    }
}
