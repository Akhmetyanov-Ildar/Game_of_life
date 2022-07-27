package trainingCode;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GameField g = new GameField();

        while (true) {
            g.simulateNextStep();
            g.print();
            Thread.sleep(1500);
        }


    }
}
