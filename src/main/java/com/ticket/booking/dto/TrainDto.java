package com.ticket.booking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrainDto {
    private long id;
    private long trainNumber;
    private String source;
    private String destination;
    private boolean availability;
    private LocalDate date;
    private LocalTime departureTime;
    private LocalTime arrivalTime;
}