package com.wp.ww.workflow.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.wp.ww.base.BaseProviderLauncher;
/**
 * 
 * @author swiftwen
 * @date 2020年4月20日 下午2:52:49
 */
@ComponentScan({"com.wp.ww.workflow.provider"})
@SpringBootApplication
public class WorkFlowProviderLauncher extends BaseProviderLauncher{
  public static void main(String[] args) {
	  System.out.println("Hello, JavaPoet!");
		SpringApplication.run(WorkFlowProviderLauncher.class, args);
  }
}
