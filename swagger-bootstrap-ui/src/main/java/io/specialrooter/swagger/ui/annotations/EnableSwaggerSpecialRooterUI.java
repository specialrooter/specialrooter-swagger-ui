package io.specialrooter.swagger.ui.annotations;

import io.specialrooter.swagger.ui.configuration.MarkdownFileConfiguration;
import io.specialrooter.swagger.ui.configuration.SecurityConfiguration;
import io.specialrooter.swagger.ui.configuration.SwaggerSpecialRooterUIConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/***
 * Enable SwaggerBootstrapUi enhanced annotation and use @EnableSwagger2 annotation together.
 *
 * inlude:
 * <ul>
 *     <li>Interface sorting </li>
 *     <li>Interface document download  (word)</li>
 * </ul>
 *
 * @since 1.8.5
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({SwaggerSpecialRooterUIConfiguration.class, SecurityConfiguration.class, MarkdownFileConfiguration.class})
public @interface EnableSwaggerSpecialRooterUI {

}
