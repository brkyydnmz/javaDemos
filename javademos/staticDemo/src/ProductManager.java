public class ProductManager {

    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Ürün Bilgileri Eklendi");
        }else{
            System.out.println("Ürün Bilgileri Geçersizdir.");
        }

            ProductValidator productValidator = new ProductValidator();
            productValidator.bisey();
    }
}
//ProductValidator validator = new ProductValidator(); de yazabilirsin 4.satıra ama onun yerine
//üst satırdaki gibi newle yapsaydık 5.satır şöyle olurdu: if(validator.isValid(product))
//new lemek yerine ProductValidator.java da public static boolean yaptık(static ekkledik)
//static olursa mesela bir kere oluşur bir ürün ve bütün kullanıcılar o şekilde kullanır yani
//static kullanımı yaygın değildir.
//productManager ı static yaparsak burda bir kullanıcı bir ürün oluşturunca birdaha düğer tüm kullanıcılarda da bu ürün oluşur yanlış olur.
//ProductManager içine int bisey=5; yazsa bir kullanıcı diğer kullanıcılarda da 5 olur yani. 2.satırda yani
//static olayı şudur:Bir metodu static yapınca class ismiyle direk çağırılır.

