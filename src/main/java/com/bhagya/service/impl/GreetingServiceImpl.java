package com.bhagya.service.impl;

import com.bhagya.service.GreetingService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
public class GreetingServiceImpl implements GreetingService {

    @Override
    public String greet() {
        LocalDateTime localDateTime = LocalDateTime.now();
        if (localDateTime.getHour()>0 && localDateTime.getHour()<=12){
            return "Good Morning";
        }else if (localDateTime.getHour()>12 && localDateTime.getHour()<=14){
            return "Good Afternoon";
        }if (localDateTime.getHour()>14 && localDateTime.getHour()<23.59){
            return "Good Evening";
        }
        return null;
    }
}
