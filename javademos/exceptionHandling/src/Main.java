public class Main {

    public static void main(String[] args) {

        try{
            int[] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Hata sebebi = " + exception);
        }catch(StringIndexOutOfBoundsException exception){    //BU HATAYI CATCH ETMEZ TRY HATAMIZIN SEBEBİ STRING DEĞİL!!!
            System.out.println("Hata sebebi = " + exception);
        }catch (Exception exception){  //yukarıdaki catchlerden farklı bir hata alırsa bunu yazdırır.Hata türünü öğrenmek zor olabilir bu şekilde.
            System.out.println("Loglandı : " + exception);
        }
        finally {
            System.out.println("Ben her türlü çalışırım.");
        }


        //try çalıştırmayı dener
        //catch kodlarda hata varsa catch bloğuna gider try ın içindeki kodların hatası catch e yazılır bizdeki hata exception du o yüzden Exception yazdık.
        //birden fazla catch bloğu olabilir.
        //exception yazdık catchteki system.out.println a yazdığımız yere hatamızı yadırdı bize.
        //finally en son çalışır! finally her türlü çalışır.
        //try içine 2.index yazarsak catch çalışmaz ancak finally her türlü çalışır.
        //catch içine (StringIndexOutOfBoundsException exception) yazarsak üstteki tryladığımız hatayı catch yapmak için sağlamadığı için finally e giderdi sadece.Sebebi hata çeşidinin farklı olmasındandır.

    }
}
