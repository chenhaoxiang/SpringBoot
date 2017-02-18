package cn.hncu;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBoot22Application {
	@Value("${springBoot2_2.author}")
	private String author;
	@Value("${springBoot2_2.name}")
	private String name;

	@RequestMapping("/")
	String index(){
		return "name:"+name+" and author:"+author;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot22Application.class, args);
	}
}
