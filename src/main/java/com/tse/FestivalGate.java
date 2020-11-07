package com.tse;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class FestivalGate {
    private Queue<TicketType> queue = new LinkedList<>();
    private Map<TicketType, Integer> info = new HashMap<>();
    private int nrOfPersons;

    public FestivalGate() {
        setInfo();
    }

    private void setInfo() {
        for(TicketType ticketType: TicketType.values()){
            info.put(ticketType, 0);
        }
    }

    public Map<TicketType, Integer> getInfo() {
        return info;
    }

    public void addTicket(TicketType ticket){
        queue.add(ticket);
        int nrOfTickets = info.get(ticket);
        info.put(ticket, nrOfTickets + 1);
        nrOfPersons +=1;
    }

    public int getNrOfPersons() {
        return nrOfPersons;
    }
}
