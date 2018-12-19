package com.sda.gda17.organizer.organizer.repository;

import com.sda.gda17.organizer.organizer.model.CheckListItem;
import com.sda.gda17.organizer.organizer.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckListItemRepository extends JpaRepository<CheckListItem,Long> {
}
