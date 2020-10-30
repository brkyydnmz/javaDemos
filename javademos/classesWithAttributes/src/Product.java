public class Product {

    public Product(int id, String name,String description,double price,int stockAmount,String renk){ // yapıcı metod(constructors)
        System.out.println("Yapıcı blok çalıştı");  //Product içindekiler eğer içindeki değerleri girmeliyiz çalışması için
        this.id = id;
        this.renk =renk;
        this.name = name;
        this.price = price;
        this.description = description;
        this.stockAmount = stockAmount;
    }
    // this ile yukarıda yazmazsak hata verir nedeni alttakileri private ettiğimiz için
    //Product class ının 1 tane parametreli yukarıda 1 tane de aşşağıdaki gibi parametresiz halini yaptık buna overloading denir

    public Product(int i){

    }
    //attribute | field
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String renk;
    private String kod;

    //private sadece tanımlandığı blokta geçerlidir demek bununki Product içinde geçerli
    // getter setter private bi değişkenin başka blokta da görmeye yahut deşiştirmeler yapmaya yarar
    // !getter ve setter oluşturmak için basit bir yol vardır IDE de mesela _id üstüne gelip sağ tık yapıp refactor den encapsulate fields diyebiliriz yazmak yerine
    // private yazmadan da IDE onu otomatik yapar getter yada setter yaparsan

    //getter
    public int getId() {   //get private yaptığımız bloğu başka blokta SADECE okumaya yarar
        return id;
    }

    //setter
    public void setId(int id) {    //set return döndürmez ama verdiğimiz değerle var olanı değiştirebilir
        this.id = id;   //this.id benim bloğumun içindeki id dir.Aynı anlama _id de gelir

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;  //substring de 0 dan 1 e kadar kısmı verir
    }

}
