package scratch.webcomponents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * This is the main class that Spring boot uses to start the stand alone application.
 */
@SpringBootApplication
public class ServletApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ServletApplication.class, args);
    }
}
