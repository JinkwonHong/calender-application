package com.fastcampus.calenderapplication.event;

import com.fastcampus.calenderapplication.event.eventType.EventType;

import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<AbstractEvent> events = new ArrayList<>();

    public void add(AbstractEvent event) {
        if (hasScheduleConflictWith(event)) {
            return;
        }
        this.events.add(event);
    }

    public void printAll() {
        events.forEach(Event::print);
    }

    public void printBy(EventType eventType) {
        events.stream()
                .filter(event -> event.support(EventType.MEETING))
                .forEach(Event::print);
    }

    private boolean hasScheduleConflictWith(AbstractEvent event) {
        return events.stream()
                .anyMatch(each ->
                        (event.getStartAt().isBefore(each.getEndAt()) && event.getStartAt().isAfter(each.getStartAt()))
                                || (event.getEndAt().isAfter(each.getStartAt()) && event.getEndAt().isBefore(each.getEndAt())));
    }
}
