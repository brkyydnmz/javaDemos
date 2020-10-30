public class Main {

    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalın sesli harf");
                break; //break eğer yukarıdaki 4 caseden biri oluyorsa devam ettirmez
            default:    // default durumu da bunların dışındaki durumlar demektir
                System.out.println("İnce sesli harf");


        }


    }
}
