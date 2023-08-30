package self.java.lombok;

import org.junit.jupiter.api.Test;

public class CounterTest {

    private Counter counter = new Counter();

    @Test
    void testCounter() throws InterruptedException {
        for (int i = 0; i < 100; i++){
            new Thread(() -> {
                for (int x = 0; x < 100; x++){
                    counter.increment();
                }
            }).start();
        }

        Thread.sleep(5_000L);
        System.out.println(counter.getCounter());
    }
}
