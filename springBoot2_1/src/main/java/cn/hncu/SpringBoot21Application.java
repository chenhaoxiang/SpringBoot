package cn.hncu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource({"classpath:some-context.xml","classpath:another-context.xml"})
public class SpringBoot21Application {
	public static void main(String[] args) {
//		SpringApplication application = new SpringApplication(SpringBoot21Application.class);
//		application.setBannerMode(Banner.Mode.OFF);
//		application.run(args);

//		new SpringApplicationBuilder(SpringBoot21Application.class)
//				.bannerMode(Banner.Mode.OFF)
//				.run(args);
		new SpringApplication(SpringBoot21Application.class).run(args);
	}
}
