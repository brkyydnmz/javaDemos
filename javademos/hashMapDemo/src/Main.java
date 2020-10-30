import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String, String>();   //ing-tr sözlük gibi düşünebilirsin.Biz str-str çalıştık int-str,str-int,int-int vs.halde yazabilirsin.str-herhangi bir class bile olabilir!!!
        sozluk.put("book","kitap");  //add değil de put yazılır burada
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        sozluk.put("pencil","kalem");
        sozluk.put("orange","turuncu");
        System.out.println("Eleman Sayısı = "+sozluk.size());  //kaç eleman olduğunu verir

        for(String item : sozluk.keySet()) {    //keySet bize book table vs. verir.Sırayla gelmez,bizim yazdığımız sıra yani.Get ise bize karşılıklarını getirir.
        System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }




        //sozluk.remove("table");  //silme işlemi
        //sozluk.clear();  //sozlukte hiçbir eleman kalmaz

        System.out.println("Table sözcüğünün karşılığı = "+sozluk.get("table"));  //table ı getir dedik









    }
}
