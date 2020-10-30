public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
}
//GameCalculator ü kim kullanıyorsa gameOver ı olduğu gibi kullanmak zorunda,hesaplada ise kim inheritance ediyorsa hesaplayı içermek zorunda fakat kendi hesaplasını yazmak zorunda
//hesapla diye bir imza zorunlu burda ama kullanıcı türüne göre farklı olmalısı gerektiği için abstract kullandık
//hesapla başka yerde override(üzerine yazma) oldu yani
//abstract olması için abstract imzamız da olmalı en yukardaki yani
//bir abstract classta abstract olma zorunluğu yoktur
//