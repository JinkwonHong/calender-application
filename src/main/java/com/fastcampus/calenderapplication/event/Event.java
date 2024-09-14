package com.fastcampus.calenderapplication.event;

import com.fastcampus.calenderapplication.event.eventType.EventType;

public interface Event {
    void print();

    boolean support(EventType eventType);
}
