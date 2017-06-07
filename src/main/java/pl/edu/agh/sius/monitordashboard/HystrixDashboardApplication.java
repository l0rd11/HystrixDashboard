package pl.edu.agh.sius.monitordashboard;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@EnableHystrixDashboard
@EnableDiscoveryClient
public class HystrixDashboardApplication{
	
	@RequestMapping("/")
	public String home() {
		return "forward:/hystrix";
	}

    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboardApplication.class).run(args);
    }

}
