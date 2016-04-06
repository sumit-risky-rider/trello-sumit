package com.aplynk.sumit.triggers;

import com.google.gson.JsonObject;
import io.elastic.api.Component;
import io.elastic.api.EventEmitter;
import io.elastic.api.ExecutionParameters;
import io.elastic.api.Message;

/**
 * Created by r!sky r!der on 06-04-2016.
 */
public class GetCompletedTask extends Component {


    /**
     * Creates a component instance with the given {@link EventEmitter}.
     *
     * @param eventEmitter emitter to emit events
     */
    public GetCompletedTask(EventEmitter eventEmitter) {
        super(eventEmitter);
    }

    @Override
    public void execute(ExecutionParameters parameters) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("output","howdy India");

        Message msg = new Message.Builder().body(jsonObject).build();

        getEventEmitter().emitData(msg);
    }
}
