package com.project.task.myapppetproject.dto.reservation;

import com.project.task.myapppetproject.entity.ReservationStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record ReservationResponse(Long id,
                                  Integer numberPeople,
                                  LocalDateTime reservationDate,
                                  BigDecimal pricePaid,
                                  Long productId,
                                  Long guestId,
                                  ReservationStatus status) {
}
