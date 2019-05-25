package com.pangfeng.sprintbootfirst;

import org.joda.time.LocalDate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@SpringBootApplication
@Service
public class SprintBootFirstApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SprintBootFirstApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(SprintBootFirstApplication.class);
	}

	@RequestMapping("/")
	@ResponseBody
	String home() {
		LocalDate now = LocalDate.now();
		return "hello world!" + now;
	}

	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/rest")
	@ResponseBody
	public Map<String, Object> rest() {
		Map<String, Object> data = new HashMap<>();
		data.put("1", "A");
		data.put("2", 2);
		return data;
	}
}
