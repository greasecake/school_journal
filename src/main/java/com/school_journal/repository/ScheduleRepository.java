package com.school_journal.repository;

import com.school_journal.entity.ScheduleEntity;
import com.school_journal.repository.common.CommonRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScheduleRepository extends CommonRepository<ScheduleEntity> {
}
