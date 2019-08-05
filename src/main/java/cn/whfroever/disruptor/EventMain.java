package cn.whfroever.disruptor;

import com.lmax.disruptor.EventHandler;

import java.util.ArrayList;
import java.util.List;

public class EventMain {

    public static void main(String[] args) throws Exception {

        List<EventHandler<DataEvent>> eventHandlerList = new ArrayList<>();
        eventHandlerList.add(new DataEventHandler());
        eventHandlerList.add(new DataEventHandler2());
        DisruptorManager.init(eventHandlerList);
        for (long l = 0; true; l++) {
            DisruptorManager.putDataToQueue(l);
//            Thread.sleep(1000);
        }
    }

}
