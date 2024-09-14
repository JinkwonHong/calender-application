package com.fastcampus.calenderapplication.event.eventType;

import com.fastcampus.calenderapplication.event.AbstractEvent;

import java.time.ZonedDateTime;

public class NoDisturbance extends AbstractEvent {
    public NoDisturbance(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt) {
        super(id, title, startAt, endAt);
    }

    @Override
    public void print() {
    }
}
