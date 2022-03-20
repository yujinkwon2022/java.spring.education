package myspring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserVO user;
	
	@Override
	public UserVO getUser(String id) {
		user.setUserId(id);
		return user;
	}
}
