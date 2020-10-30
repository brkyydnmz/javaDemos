public class Main {

    public static void main(String[] args) {
        System.out.println("İŞÇİ SINIFI 1:");
	Worker worker = new Worker();
	worker.eat();
	worker.pay();
	worker.work();
        System.out.println("İŞÇİ SINIFI 2:");
	Robot robot = new Robot();
	robot.work();
        System.out.println("İŞÇİ SINIFI 3:");
	OutsourceWorker outsourceWorker = new OutsourceWorker();
	outsourceWorker.work();

    }
}
