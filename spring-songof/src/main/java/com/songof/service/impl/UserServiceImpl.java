package com.songof.service.impl;

import com.songof.entity.User;
import com.songof.service.UserService;

/**
 * @author SongOf
 * @ClassName UserServiceImpl
 * @Description
 * @Date 2021/5/12 21:06
 * @Version 1.0
 */
public class UserServiceImpl implements UserService {
	@Override
	public User getUserById(int id) {
		User user = new User();
		user.setAge(18);
		user.setName("songof");
		return user;
	}
}
