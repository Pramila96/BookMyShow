package com.example.Book_my_show_Application.convertors;

import com.example.Book_my_show_Application.Entities.MovieEntity;
import com.example.Book_my_show_Application.EntryDtos.MovieEntryDto;

public class MovieConvertors {
    public static MovieEntity convertEntryDtoToEntity(MovieEntryDto movieEntryDto){

        MovieEntity movieEntity = MovieEntity.builder()
                .movieName(movieEntryDto.getMovieName()).duration(movieEntryDto.getDuration())
                .genre(movieEntryDto.getGenre()).language(movieEntryDto.getLanguage()).ratings(movieEntryDto.getRatings()).build();

        return movieEntity;
    }
}
