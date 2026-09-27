package com.project.task.myapppetproject.dto.timeslot;

import com.project.task.myapppetproject.entity.StatusSlot;

import java.time.LocalDateTime;

public record TimeSlotResponse(Long id,
                               LocalDateTime startTime,
                               LocalDateTime endTime,
                               Integer maxPeopleInSlot,
                               Long productId,
                               StatusSlot status,
                               Integer placesLeft
) {
}
