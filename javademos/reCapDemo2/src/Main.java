public class Main {

    public static void main(String[] args) {

        //new double[] yazup yeni array oluşturma yerine süslü parantez içine array(dizi) içindeki elemanları süslü içine yazabilirsin
        //for içinde yazdığımız total(toplam) mantığı:
        //0=0+1.2 sonra üstüne 1.3 ü böyle sırayla gidecek

        double[] myList = {1.2, 6.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }

        System.out.println("Toplam = " + total);
        System.out.println("En Büyük = " + max);
    }
}
