package io.specialrooter.swagger.ui.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "io.specialrooter.swagger.ui.plugin",
                "io.specialrooter.swagger.ui.web",
                "io.specialrooter.swagger.ui.service"
        }
)
public class SwaggerSpecialRooterUIConfiguration {






}
