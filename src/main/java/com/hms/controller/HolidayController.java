package com.hms.controller;

import com.hms.model.HolidayEntity;
import com.hms.service.HolidayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Slf4j
@RestController
@Api("Holiday Controller API")
public class HolidayController {

    private final HolidayService holidayService;

    @Autowired
    public HolidayController(HolidayService holidayService) {
        this.holidayService = holidayService;
    }

    @GetMapping(value = "is-holiday/{date}")
    @ApiOperation("")
    public @ResponseBody String isHoliday(@PathVariable String date) {
        log.info("Receive is-holiday request: {}", date);

        return "null";
    }

    @GetMapping(value = "is-week-end/{date}")
    @ApiOperation("Check is the date is week-end or not")
    public @ResponseBody Boolean isWeekEnd(@PathVariable Date date) {
        log.info("Receive is-week-end request: {}", date);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        return calendar.get(Calendar.DAY_OF_WEEK) < 5;
    }

    @GetMapping(value = "holidays/{tenant}")
    @ApiOperation("Return all holidays per tenant")
    public @ResponseBody List<HolidayEntity> getAllList(@PathVariable String tenant) {
        log.info("Return all holidays per tenant: {}", tenant);

        return null;
    }

}
