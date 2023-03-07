package com.example.Book_my_show_Application.Services;

import com.example.Book_my_show_Application.Entities.UserEntity;
import com.example.Book_my_show_Application.EntryDtos.UserEntryDto;
import com.example.Book_my_show_Application.Repository.UserRepository;
import com.example.Book_my_show_Application.convertors.UserConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto)throws Exception,NullPointerException{

        UserEntity userEntity = UserConvertor.convertDtoToEntity(userEntryDto);

        userRepository.save(userEntity);

        return "User Added successfully";

    }
}
