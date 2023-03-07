package com.example.Book_my_show_Application.Entities;

import com.example.Book_my_show_Application.Enums.SeatType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="theater_seats")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TheaterSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private SeatType seatType;
    private String seatNo;
    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;
}
