public class Main {

    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(),new ConsoleLogger()};

        //polymorphism çok sınıflılıktır üstteki baselogger[] olan kısım bir polymorpshismdir
        // süslü parantez içindekiler aslında BaseLogger hepsinin annesi BaseLogger gibi düşünebilirsin
        //tak çalıştır gibi istediğini ekleyip çıkarabilirsin

        for(BaseLogger logger:loggers){
            logger.log("Log mesajı");
        }
        System.out.println("**************");

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());  //new DatabaseLogger yerine istediğin logger ı koyup değiştirebilirsin
        customerManager.add();
    }
}
