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


    private String model;
    private double temperature;

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for temperature
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

}