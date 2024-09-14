package com.fastcampus.calenderapplication;

import com.fastcampus.calenderapplication.event.AbstractEvent;
import com.fastcampus.calenderapplication.event.Event;
import com.fastcampus.calenderapplication.event.eventType.EventType;
import com.fastcampus.calenderapplication.event.eventType.Meeting;
import com.fastcampus.calenderapplication.event.eventType.Todo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@SpringBootApplication
public class CalenderApplication {

    public static void main(String[] args) {
        List<AbstractEvent> list = new ArrayList<>();
        HashSet<String> participants = new HashSet<>();
        participants.add("glenHong");

        Meeting meeting1 = new Meeting(1, "Meeting 1", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), participants, "MeetingRoomA", "Study");
        list.add(meeting1);

        Todo todo1 = new Todo(1, "Todo 1", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "약국 다녀오기");
        list.add(todo1);

        list.stream()
                .filter(each -> each.support(EventType.MEETING))
                .forEach(Event::print);
    }
}
