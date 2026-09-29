package com.project.task.myapppetproject.repository;

import com.project.task.myapppetproject.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
