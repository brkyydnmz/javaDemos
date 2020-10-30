public class BaseKrediManager {
    public final double hesapla(double tutar){  //final ile başka managerda değişiklik yapamazsın(override edilmez)
        return tutar * 1.18;
    }
}
