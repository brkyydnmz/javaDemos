import matematik.*;

import java.util.Scanner;

//util (utility yani araç demek),Scanner paketini çıkarttık importla
//bu paketi pek kullanmayız

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Adınız:");

	    String isim = scanner.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma= new Logaritma();

    }
}


//scanner.nextLine kullanıcının girdiği değeri okumak demek.Bir değer ister bizden.
//import matematik.*; dersek * işareti paketteki herşeyi kullan demektir.

