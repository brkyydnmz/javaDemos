public class Main {

    public static void main(String[] args) {

        // ÇOK BOYUTLU DİZİ ÖRNEĞİ
        // tek satırdan oluşan array için string için bir tane [] koyarız
        // hem satır hem sütundan oluşmasını istiyorsak [][] kullanırız
        // örnekte [3][3] 3 bölgeden ve 3 şehirden oluşan bir dizi tanımlamasıdır
        //i de 3 kere j çalışıp i 1 olucak j yine 0 dan başlayıp i 2 olup j lerde dolaşıp bitecek

        String[][] sehirler = new String[3][3];

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Balıkesir";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Konya";
        sehirler[1][2] = "Kayseri";
        sehirler[2][0] = "Diyarbakır";
        sehirler[2][1] = "Şanlıurfa";
        sehirler[2][2] = "Gaziantep";

        for(int i = 0; i<=2;i++){
            System.out.println("-------------");
            for(int j = 0;j<=2;j++){
                System.out.println(sehirler[i][j]);
            }
        }

    }
}
