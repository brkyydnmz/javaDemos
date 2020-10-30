import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        createFile();
        getFileInfo();
        readFile();
        writeFile();
        readFile();  //write tan sonrai yeni hali görmek için

    }//altta yaptıklarımızı burada çağıralım ki bize sonuç versin.

    public static void createFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            if (file.createNewFile()){             //createNewFile students.txt yi oluşturur.
                System.out.println("Dosya oluşturuldu.");
            }else{
                System.out.println("Dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("C:\\javademos\\files\\students.txt");
        if(file.exists()){  //exists boolen döndürür true yada false şeklinde
            System.out.println("Dosya adı : " + file.getName());  //dosyanın adını verir.
            System.out.println("Dosya yolu : " + file.getAbsolutePath());  //dosyanın yolunun verir.
            System.out.println("Dosya yazılabilir mi : " + file.canWrite()); //dosya yazılabilir durumda mı canWrite dosya okunabilir durumda mı canRead şeklindedir.
            System.out.println("Dosya okunabilir mi : " + file.canRead());
            System.out.println("Dosya boyutu (byte) : " + file.length());  //dosyanın boyutunu byte şeklinde verir.
        }
    }

    public static void readFile(){
        File file = new File("C:\\javademos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){      //hasNextLine satır satır okuma işlemidir.
                String line = reader.nextLine();     //nextLine yeni bir satır var mı diye bakıyor eğer varsa okunacak bir şey var demektir.nextLine da o datayı okuyor ve bir sonraki aşamaya geçiyor.Yani false olana kadar devam ediyor.
                System.out.println("Dosya içindekiler : " + line);
            }
            reader.close();  //bellekteki dosyayı kapatmamız gerekiyor bu yüzden close yazdık.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\javademos\\files\\students.txt",true)); //append özelliği ekledik yani true yani dosyayı ekleme formatında açar.Herşeyi silip sadece yeni eklediklerimizi yazmak yerine.
            writer.newLine();  //bu yeni satır oluştur ve ondan sonra yazılacak olanı yazdır anlamındadır.Bunu yazmazsak son satıra ekler.
            writer.write("Ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
