package net.pirates.DTOs;

import net.pirates.Domain.BusinessTime;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BusinessSubDTO {
    private String day;
    private String open;
    private String close;
    private String status;

    public BusinessSubDTO(BusinessTime businessTime) {
        this.day = businessTime.getDay();
        this.open = businessTime.getOpen();
        this.close = businessTime.getClose();
        LocalDateTime now = LocalDateTime.now();
        String[] reformCurrentTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss")).split("-");

        if(isHoliday(businessTime,reformCurrentTime)) {
            this.status = "HOLIDAY";
        }
        if(isOpen(businessTime,reformCurrentTime)) {
            this.status = "OPEN";
        }
        this.status = "CLOSE";


    }

    private boolean isOpen(BusinessTime businessTime, String[] reformCurrentTime) {
        return true;
    }

    private boolean isHoliday(BusinessTime businessTime, String[] reformCurrentTime) {
        return false;
    }


}
