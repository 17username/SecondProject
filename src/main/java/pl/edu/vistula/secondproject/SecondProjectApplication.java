package pl.edu.vistula.secondproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "SecondProject API",
                version = "1.0",
                description = "Product API"
        )
)
@SpringBootApplication
public class SecondProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondProjectApplication.class, args);
    }
}