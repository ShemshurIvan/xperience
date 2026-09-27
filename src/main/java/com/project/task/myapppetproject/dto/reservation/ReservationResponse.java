package com.project.task.myapppetproject.dto.reservation;

import com.project.task.myapppetproject.entity.ReservationStatus;

import java.math.BigDecimal;

public record ReservationResponse(Long id,
                                  Integer numberPeople,
                                  BigDecimal pricePaid,
                                  Long productId,
                                  Long guestId,
                                  ReservationStatus status,
                                  Long timeSlotId) {
}
