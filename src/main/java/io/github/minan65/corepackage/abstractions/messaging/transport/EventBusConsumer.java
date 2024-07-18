package io.github.minan65.corepackage.abstractions.messaging.transport;

import io.github.minan65.corepackage.abstractions.events.IntegrationEvent;


public interface EventBusConsumer<TEvent extends IntegrationEvent>
{
     void consume(TEvent event);

}
