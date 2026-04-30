package com.server.config.controller;

//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;


//@EnableDiscoveryClient
@RestController
@RequestMapping("/maths")
public class Add {


	
	@RequestMapping("/add/{a}/{b}")
	// @HystrixCommand(fallbackMethod = "client2NotConnected",
	 //	commandProperties = {
	//	       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
	//	       @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
	//	    })
	public int getSum(@PathVariable("a") int a,@PathVariable("b") int b) {
		System.out.println("...........Add server-111............");
		
		int sum = a + b ;  //restTemplate.getForObject("http://CLIENT2/maths/sum/"+a+"/"+b, Integer.class);
		return sum;
	}
	
	@RequestMapping("/sub/{a}/{b}")
	// @HystrixCommand(fallbackMethod = "client2NotConnected",
	 //	commandProperties = {
	//	       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
	//	       @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
	//	    })
	public int getSub(@PathVariable("a") int a,@PathVariable("b") int b) {
		System.out.println("...........Add server-111............");
		
		int sum = a - b ;  //restTemplate.getForObject("http://CLIENT2/maths/sum/"+a+"/"+b, Integer.class);
		return sum;
	}
	
	@RequestMapping("/pro/{a}/{b}")
	// @HystrixCommand(fallbackMethod = "client2NotConnected",
	 //	commandProperties = {
	//	       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
	//	       @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
	//	    })
	public int getPro(@PathVariable("a") int a,@PathVariable("b") int b) {
		System.out.println("...........Add server-111............");
		
		int sum = a * b ;  //restTemplate.getForObject("http://CLIENT2/maths/sum/"+a+"/"+b, Integer.class);
		return sum;
	}
	
	@RequestMapping("/div/{a}/{b}")
	// @HystrixCommand(fallbackMethod = "client2NotConnected",
	 //	commandProperties = {
	//	       @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000"),
	//	       @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value="60")
	//	    })
	public int getDiv(@PathVariable("a") int a,@PathVariable("b") int b) {
		System.out.println("...........Add server-111............");
		
		int sum = a / b ;  //restTemplate.getForObject("http://CLIENT2/maths/sum/"+a+"/"+b, Integer.class);
		return sum;
	}
	 
	
	 public int client2NotConnected(int a,int b) {
		 
		 System.out.println("................in testNotConnected");
		 return a+b+10;
	 }
}
