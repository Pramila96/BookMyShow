package com.example.Book_my_show_Application.convertors;

import com.example.Book_my_show_Application.Entities.TicketEntity;
import com.example.Book_my_show_Application.EntryDtos.TicketEntryDto;

public class TicketConvertors {
    public static TicketEntity convertEntryToEntity(TicketEntryDto ticketEntryDto){

        TicketEntity ticketEntity = new TicketEntity();
        return ticketEntity;

    }
}
