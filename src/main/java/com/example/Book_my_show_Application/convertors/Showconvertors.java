package com.example.Book_my_show_Application.convertors;

import com.example.Book_my_show_Application.Entities.ShowEntity;
import com.example.Book_my_show_Application.EntryDtos.ShowEntryDto;

public class Showconvertors {
    public static ShowEntity convertEntryToEntity(ShowEntryDto showEntryDto){

        ShowEntity showEntity = ShowEntity.builder()
                .showDate(showEntryDto.getLocalDate())
                .showTime(showEntryDto.getLocalTime())
                .showType(showEntryDto.getShowType())
                .build();

        return showEntity;
    }
}
