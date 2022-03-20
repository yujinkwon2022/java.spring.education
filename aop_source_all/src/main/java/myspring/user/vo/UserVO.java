package myspring.user.vo;

import org.springframework.stereotype.Component;

@Component
public class UserVO {

	private String userId;
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "UserVO [userId=" + userId + "]";
	}	
	
}
