package com.example.domain.timeGoal.api;

import com.example.domain.timeGoal.dto.PostTimeGoals;
import com.example.domain.timeGoal.service.TimeGoalService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/TimeGoal")
public class TimeGoalController {

    private final TimeGoalService usedTimeService;
    @PostMapping("/goals/{userId}")
    public String createGoalsByDomainName(
            @RequestBody PostTimeGoals postTimeGoals,
            @PathVariable(name="userId")Long userIdx){
        usedTimeService.createGoalsByDomainName(postTimeGoals, userIdx);
        return "making goal success";
    }
}