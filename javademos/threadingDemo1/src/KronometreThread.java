public class KronometreThread implements Runnable {  //thread şeklinde çalışmak için implements Runnable kullanırız.

    private Thread thread;
    private String threadName;

    public KronometreThread(String threadName){
        this.threadName = threadName;
        System.out.println("Oluşturuluyor : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor : " + threadName);

        try
        {
            for (int i = 1;i<=10;i++){
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);  //bu bir saniye bekle anlamındadır.Saniye Saniye ilerleyen kronometre oldu.

            }
        }catch (InterruptedException exception){    //thread bir şekilde bozulursa diye catch istiyor bizden java
            System.out.println("Kesildi : " + threadName);
        }

        System.out.println("Thread bitti : "+ threadName);

    }
    public void start(){
        System.out.println("Thread nesnesi oluşuyor");
        if(thread==null){
            thread = new Thread(this,threadName);
            thread.start();
        }

    }
//Override olan yer sadece değişir başka projelerde diğerleri threadlerle çalışmak için standarttır.
}
