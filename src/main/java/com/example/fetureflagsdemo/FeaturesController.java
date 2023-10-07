package com.example.fetureflagsdemo;

import com.azure.spring.cloud.feature.management.FeatureManager;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/features")
public class FeaturesController {
    private final FeatureManager featureManager;


    public FeaturesController(FeatureManager featureManager) {
        this.featureManager = featureManager;
    }

    @GetMapping
    public Boolean features() {
        return featureManager.isEnabled("demo-search");

    }

}
