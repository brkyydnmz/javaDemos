public class Main {

    public static void main(String[] args) {

        // char tek tırnakla yazılır tek harfle kullanılır int gibi bir tiptir
        //herhangi bir değere göre nasıl bir aksiyon alacağımızı belirlemek için switch kullanılır.
        //switch blokları if lere göre çok az kullanırız.
        //default da yukarısındaki notlar dışında bir not girilirse.
        // case B ve C nin çıktısı aynı olması için alt alta yazıp ortak break yaptık.


        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel : Geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi : Geçtiniz");
                break;
            case 'D':
                System.out.println("Fena Değil : Geçtiniz");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız");
                break;
            default:
                System.out.println("Geçersiz not girdiniz");
        }

    }
}
