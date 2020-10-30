public class Main {

    public static void main(String[] args) {
	    int number = 1;
	    int remainder = number % 2; //remainder kalan demek number % 2 de 2 ye bölümden kalan değer demektir
        //System.out.println(remainder);
        boolean isPrime = true; //isPrime asal mı demek

        if(number == 1){
            System.out.println("Sayı Asal Değildir.");
            return; //bu yazılınca devamı gelmez number 1 için
        }

        if(number<1){
            System.out.println("Geçersiz sayı");
        }

        for(int i=2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }

        if(isPrime){
            System.out.println("Sayı Asaldır.");
        }else{
            System.out.println("Sayı Asal Değildir.");
        }

    }
}
