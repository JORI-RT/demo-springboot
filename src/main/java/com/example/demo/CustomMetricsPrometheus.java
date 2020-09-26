package com.example.demo;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomMetricsPrometheus {

    @Autowired
    private MeterRegistry meterRegistry;

    public CustomMetricsPrometheus(MeterRegistry meterRegistry) {
        meterRegistry.gauge("hoge.fuga", 222);
        this.meterRegistry = meterRegistry;
    }

}
