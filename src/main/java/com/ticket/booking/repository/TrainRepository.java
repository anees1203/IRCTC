package com.ticket.booking.repository;
import com.ticket.booking.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TrainRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByTrainId(Long trainId);
}
