package cn.whfroever.disruptor;

/**
 * 消费者业务逻辑
 */
public class DataEventConsumer {
    public DataEventConsumer(DataEvent event) {
        // 业务逻辑
        System.out.println("event : " + event.getValue());
    }
}
