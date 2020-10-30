public class ProductValidator {

    static {
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    static {
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    static {
        System.out.println("Static Yapıcı blok çalıştı.");
    }
    public ProductValidator(){
        System.out.println("Yapıcı blok ProductManager'da newleyince çalıştı.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public void bisey(){

    }
//    public static class BaskaBirClass{
//        public static void Sil(){
//
//        }
//    }

}
//product.name.isEmpty başındaki ! değilse anlamındadır. && ve anlamındadır.
//bisey() i çağırmak için ProductValidator u new lememiz lazım
//static olan yerde static olan çalışır birden fazla static blok oluşturabiliriz hepsi çalışır.
//en üstteki public class a static ekleyim hepsi static olsun dersen olmaz javada yoktur c# da vardır
//ama ana class static olamıyor ama bu class ın içerisinde başka bir class oluşturalım dediğimizde public class BaskaBirClass a static ekleyebiliriz(inner class denir buna) commandlediğimiz akan 26-30.satır
//innerclass yapmak yerine ayrı ayrı class yapmak yazılımın SOLID prensibine uyduğu için iç içe DatabaseHelper daki gibi yapmak pek tercih edilmez hatta hiç.

