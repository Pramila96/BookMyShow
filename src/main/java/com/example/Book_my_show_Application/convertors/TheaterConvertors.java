package com.example.Book_my_show_Application.convertors;

import com.example.Book_my_show_Application.Entities.TheaterEntity;
import com.example.Book_my_show_Application.EntryDtos.TheaterEntryDto;

public class TheaterConvertors {
    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){

        return TheaterEntity.builder().location(theaterEntryDto.getLocation())
                .name(theaterEntryDto.getName()).build();

    }
}
