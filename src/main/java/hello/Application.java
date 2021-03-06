package hello;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() throws UnknownHostException {
        return "Hello World from Docker Container: "+InetAddress.getLocalHost().getHostName();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
