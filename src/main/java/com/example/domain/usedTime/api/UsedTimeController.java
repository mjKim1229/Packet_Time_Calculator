package com.example.domain.usedTime.api;


import com.example.domain.usedTime.service.UsedTimeService;
import com.example.global.JPacketCapture;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/UsedTime")
public class UsedTimeController {

    private final UsedTimeService usedTimeService;
    private final JPacketCapture jPacketCapture;
    @GetMapping("/capture/{userId}")
    public void capturePacket(@PathVariable(name = "userId") Long userIdx) throws IOException {
        jPacketCapture.startCaptureByInterface(userIdx);
    }

}