import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args)  {
        BufferedReader reader = null;
        int total = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\javademos\\readingFileDemo\\src\\sayilar.txt"));
            String line = null;
            while((line = reader.readLine())!=null){         //reader.readLine bir satır oku okuyabiliyorsa true değeri dönecektir demek.
                total += Integer.valueOf(line); //Integer.valueOf() diyerek herhangi bir değeri integer a çevirebiliriz.
            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{
                reader.close();  //dosya okumayı kapatır.
            }catch(Exception exception){

            }
        }


        //BufferedReader;dosyaları bellekte hızlıca okumak için kullanılır bu class.
        // üstte tek\ kullanmama nedenimiz \n gibi komutlar olduğu içindir.
    }
}
