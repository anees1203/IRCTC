package com.ticket.booking.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TicketDto {
    private long ticketId;
    private long userId;
    private long trainId;
    private LocalDate departureDate;
    private int seatsBooked;
}