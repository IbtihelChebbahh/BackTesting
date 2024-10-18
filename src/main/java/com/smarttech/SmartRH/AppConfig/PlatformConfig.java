package com.smarttech.SmartRH.AppConfig;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Configuration
public class PlatformConfig {

    private boolean aiFeature = false;
    private boolean smsFeature = false;
    private String smsUsername = "";
    private String smsPassword = "";




}