package self.java.lombok;

import lombok.Synchronized;

public class Counter {
    private final Object lock = new Object();
    private Long counter = 0L;

    @Synchronized(value = "lock")
    public void increment(){
        this.counter = this.counter + 1;
    }

    @Synchronized(value = "lock")
    public Long getCounter(){
        return this.counter;
    }
}
