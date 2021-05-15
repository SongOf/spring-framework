package com.songof;

import com.songof.entity.User;
import com.songof.service.UserService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author SongOf
 * @ClassName Main
 * @Description
 * @Date 2021/5/12 21:05
 * @Version 1.0
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-text.xml");

		UserService userService = (UserService) context.getBean("userService");

		User user = userService.getUserById(1);
		System.out.println(user);

	}
}
