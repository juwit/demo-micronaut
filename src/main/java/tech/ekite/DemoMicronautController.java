package tech.ekite;

import io.micronaut.http.annotation.*;

@Controller("/demoMicronaut")
public class DemoMicronautController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}