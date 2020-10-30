//bizim çalışanımız bu
public class Worker implements IWorkable,IEatable,IPayable{
    @Override
    public void work() {
        System.out.println("Kendi Çalışanım Çalıştı.");
    }

    @Override
    public void eat() {
        System.out.println("Kendi Çalışanım Yemek Yedi.");
    }

    @Override
    public void pay() {
        System.out.println("Kendi Çalışanımın Maaşı Ödendi.");
    }
}
