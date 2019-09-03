package net.codejava.MyWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class MyWebAppApplication {
@RequestMapping("/")
    String home()
    {
	return "<html><body><h1>---Welcome to my SpringBoot world!---</h1></body></html> ";
	
    }
@RequestMapping("/new")
String newForm()
{
return "<h1>.....Welcome to my Page.....</h1> ";

}

@RequestMapping("/hi")
String newCreate()
{
return "<h1>$$$Visit My Site$$$</h1> ";

}
	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}

}
