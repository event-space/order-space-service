package com.eventspace.spring.spaceservice.service;

import com.eventspace.spring.spaceservice.model.entity.Booking;
import com.eventspace.spring.spaceservice.model.entity.Slot;

import java.time.LocalDateTime;
import java.util.List;

public interface SlotService {

    Slot createSlot(Long spaceId, LocalDateTime startTime, LocalDateTime endTime);

    List<Slot> getSlotsBySpaceId(Long spaceId);

    Slot updateSlotBookingStatus(Long slotId, boolean isBooked);

    void deleteSlot(Long slotId);

    Booking bookSlot(Long slotId, String userEmail);

    List<Booking> getBookingsBySpaceId(Long spaceId);

    List<Booking> getBookingsByUserEmail(String userEmail);

    Booking getBookingsById(Long id);

    Booking updateBookingStatus(Long bookingId, String status);
}
