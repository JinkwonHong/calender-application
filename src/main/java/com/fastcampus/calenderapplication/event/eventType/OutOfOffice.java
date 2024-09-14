package com.fastcampus.calenderapplication.event.eventType;

import com.fastcampus.calenderapplication.event.AbstractEvent;

import java.time.ZonedDateTime;

public class OutOfOffice extends AbstractEvent {
    public OutOfOffice(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(id, title, startAt, endAt);
    }

    @Override
    public void print() {
        System.out.printf("(외출) %s", getTitle());
    }

    @Override
    public boolean support(EventType eventType) {
        return eventType == EventType.OUT_OF_OFFICE;
    }
}
