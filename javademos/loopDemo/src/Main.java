public class Main {

    public static void main(String[] args) {

        //DÖNGÜLER
        //-- de bir azaltma
        // ++ bir arttır demek
        //i+=2 i yi 2 2 arttır demek

        //for:
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }//i 10 olana kadar 2 2 artar döngü 11 olmaz 1,3,5...
        System.out.println("For Döngüsü Bitti");


        //while:
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }// i yi arttırmazsak i sonsuz kere 1 der sonsuz devam eder bu yüzden while dögüsü sayaçı içinde artış belirtilir

        System.out.println("While Döngüsü Bitti");

        //Do-While
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);  // j 10 dan küçük oldukça do içindeki kodu çalıştırır çok çok az kullanılır
        //while dögüsüyle farkı şart sağlanmazsa bile çalışır aslında biz yukarıda 100 yazdık ya önce 100 ü yazdırır sonra şartı uygular eğer şart sağlanırsa

        System.out.println("Do-While Döngüsü Bitti");

    }

}
