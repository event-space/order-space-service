package com.eventspace.spring.spaceservice.repository;

import com.eventspace.spring.spaceservice.model.entity.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {
    List<Slot> findSlotsBySpaceId(Long id);
}
