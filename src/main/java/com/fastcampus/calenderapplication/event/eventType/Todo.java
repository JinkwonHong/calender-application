package com.fastcampus.calenderapplication.event.eventType;

import com.fastcampus.calenderapplication.event.AbstractEvent;

import java.time.ZonedDateTime;

public class Todo extends AbstractEvent {
    private String description;

    public Todo(int id, String title, ZonedDateTime startAt, ZonedDateTime endAt, String description) {
        super(id, title, startAt, endAt);
        this.description = description;
    }

    @Override
    public void print() {
        System.out.printf("(할일) %s: %s%n", getTitle(), description);
    }

    @Override
    public boolean support(EventType eventType) {
        return eventType == EventType.TO_DO;
    }
}
