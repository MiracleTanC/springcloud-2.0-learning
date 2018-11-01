package warmer.star.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//服务注册
@EnableDiscoveryClient//服务发现
public class SearchProviderApplication8003 {
	public static void main(String[] args) {
		SpringApplication.run(SearchProviderApplication8003.class, args);
	}
}
