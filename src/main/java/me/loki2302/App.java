package me.loki2302;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@EnableAdminServer
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @RestController
    public static class HelloController {
        @Value("${something}")
        public String something;

        @Autowired
        private DummyRepository dummyRepository;

        @RequestMapping(value = "/", method = RequestMethod.GET)
        public String index() {
            Dummy dummy = new Dummy();
            dummy.timeString = new Date().toString();
            dummyRepository.save(dummy);

            long dummyCount = dummyRepository.count();

            return "hello there " + new Date() + " " + something + " " + dummyCount;
        }
    }
}
