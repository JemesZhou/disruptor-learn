package cn.whfroever.disruptor;

public class DataEvent {
    private long value;

    public void set(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DataEvent{" +
                "value=" + value +
                '}';
    }
}
