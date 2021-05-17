package com.hms.controller;

import com.hms.service.HolidayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

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
    @ApiOperation("")
    public @ResponseBody String isWeekEnd(@PathVariable String date) {
        log.info("Receive is-week-end request: {}", date);

        return "null";
    }

}
