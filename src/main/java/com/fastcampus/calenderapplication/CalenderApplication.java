package com.fastcampus.calenderapplication;

import com.fastcampus.calenderapplication.event.Schedule;
import com.fastcampus.calenderapplication.event.eventType.Meeting;
import com.fastcampus.calenderapplication.event.eventType.Todo;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;
import java.util.HashSet;

@SpringBootApplication
public class CalenderApplication {

    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        HashSet<String> participants = new HashSet<>();
        participants.add("glenHong");

        Meeting meeting1 = new Meeting(1, "Meeting 1", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), participants, "MeetingRoomA", "Study");
        schedule.add(meeting1);

        Todo todo1 = new Todo(1, "Todo 1", ZonedDateTime.now(), ZonedDateTime.now().plusHours(1), "약국 다녀오기");
        schedule.add(todo1);

        schedule.printAll();
    }
}
