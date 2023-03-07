package com.example.Book_my_show_Application.EntryDtos;

import lombok.Data;

@Data
public class TheaterEntryDto {
    private String name;
    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;
}
