package com.example.domain.timeGoal.dto;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostTimeGoalsReq {
    private String domainName;
    private Long time;


    @Builder
    public PostTimeGoalsReq(String domainName, Long time){
        this.domainName = domainName;
        this.time = time;
    }

    public PostTimeGoalsReq toEntity(){
        return PostTimeGoalsReq.builder()
                .domainName(domainName)
                .time(time)
                .build();
    }
}
