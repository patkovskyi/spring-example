package com.ptkvsk.springexample;

import com.ptkvsk.config.ThymeleafConfig;
import com.ptkvsk.controllers.HelloController;
import com.ptkvsk.servlets.MyServletV1;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = { HelloController.class, ThymeleafConfig.class })
public class SpringExampleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringExampleApplication.class);
	}
}

//public class SpringExampleApplication {
//
//	public static void main(String[] args) throws LifecycleException {
//		Tomcat tomcat = new Tomcat();
//		tomcat.setPort(8080);
//		tomcat.getConnector();
//
//		Context ctx = tomcat.addContext("", null);
//		Wrapper servlet = Tomcat.addServlet(ctx, "myServlet", new MyServletV1());
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/*");
//
//		tomcat.start();
//	}
//
//}
