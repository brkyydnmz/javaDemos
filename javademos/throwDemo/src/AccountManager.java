public class AccountManager {
    private double balance;

    public void deposit(double amount){

        balance = getBalance() + amount;
    }

    public void  withdraw(double amount) throws BalanceInsufficentException {
        if(balance>= amount){
            balance = getBalance() - amount;
        }else{
            //System.out.println("Hesaptan para çekilemedi.BAKİYE YETERSİZ.");   //throw new yerine bu da olur else içinde
            throw new BalanceInsufficentException("Bakiye yetersiz!!");  //throw eklediğimizde throws şeklinde yukarıda ekleme yapmamız gerekiyor main.java da da ekleme yapmalıyız.try ve catch ile yapmak daha mantıklı ama 2 si de olur main.java ya getirilirken.
            //kendi throw new imizi oluşturduk BalanceInsufficentException diye.
        }

    }


    public double getBalance() {
        return balance;
    }
}
