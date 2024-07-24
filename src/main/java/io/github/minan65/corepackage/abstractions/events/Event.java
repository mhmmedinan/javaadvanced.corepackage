package io.github.minan65.corepackage.abstractions.events;

import java.time.OffsetDateTime;
import java.util.UUID;


public abstract class Event {
    private final UUID eventId;
    private long eventVersion;
    private final OffsetDateTime occurredOn;

    public Event(){
        this.eventId=UUID.randomUUID();
        this.eventVersion=-1;
        this.occurredOn=OffsetDateTime.now();
    }

    public UUID getEventId() {
        return eventId;
    }

    public long getEventVersion() {
        return eventVersion;
    }

    protected void setEventVersion(long eventVersion) {
        this.eventVersion = eventVersion;
    }

    public OffsetDateTime getOccurredOn() {
        return occurredOn;
    }

    public String getEventType() {
        return getClass().getName();
    }

    public abstract String getTopicName();


}
