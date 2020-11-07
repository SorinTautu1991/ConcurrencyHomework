package com.tse;

import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        FestivalGate gate = new FestivalGate();
        Random random = new Random();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(gate);

        festivalStatisticsThread.start();
        int participantsForFestival = random.nextInt(500) + 100;
        for (int i = 0; i < participantsForFestival; i++) {
            TicketType ticketType = Arrays.asList(TicketType.values()).get(random.nextInt(TicketType.values().length));
            FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);

            try {
                festivalAttendee.sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }

            festivalAttendee.start();
        }
    }
}


