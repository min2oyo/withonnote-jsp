package org.hdcd.domain;

import lombok.ToString;

@SuppressWarnings("unused")
@ToString(exclude = "userName")
public class Member {

	private String userId;
	private String password;
	private String userName;

}
