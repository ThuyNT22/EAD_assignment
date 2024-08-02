package org.example.salesmanagement_T2208e.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "common")
public class CommonProperties {
    private String exampleProperty;

    public String getExampleProperty() {
        return exampleProperty;
    }

    public void setExampleProperty(String exampleProperty) {
        this.exampleProperty = exampleProperty;
    }
}
