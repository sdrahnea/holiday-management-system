package com.hms.repository;

import com.hms.model.HolidayEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface HolidayRepository extends CrudRepository<HolidayEntity, Long> {

}
