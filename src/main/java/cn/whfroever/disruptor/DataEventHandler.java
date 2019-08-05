package cn.whfroever.disruptor;

import com.lmax.disruptor.EventHandler;

public class DataEventHandler implements EventHandler<DataEvent> {
    @Override
    public void onEvent(DataEvent dataEvent, long l, boolean b) throws Exception {
//        System.out.println("Event: " + dataEvent.getValue());
        new DataEventConsumer(dataEvent);
    }
}
