package com.example.Book_my_show_Application.convertors;

import com.example.Book_my_show_Application.Entities.UserEntity;
import com.example.Book_my_show_Application.EntryDtos.UserEntryDto;

public class UserConvertor {
    public static UserEntity convertDtoToEntity(UserEntryDto userEntryDto){

        UserEntity userEntity =  UserEntity.builder().age(userEntryDto.getAge()).address(userEntryDto.getAddress())
                .email(userEntryDto.getEmail()).name(userEntryDto.getName()).mobNo(userEntryDto.getMobNo())
                .build();

        return userEntity;

    }
}
