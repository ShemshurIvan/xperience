package com.project.task.myapppetproject.dto.reservation;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record ReservationRequest(@NotNull Long productId,
                                 @NotNull Long guestId,
                                 @NotNull @Min(1) Integer numberPeople,
                                 @Future @NotNull LocalDateTime reservationDate) {
}
