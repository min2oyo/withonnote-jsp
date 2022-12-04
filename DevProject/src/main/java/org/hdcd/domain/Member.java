package org.hdcd.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@SuppressWarnings("unused")
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "userName")
public class Member {

	private String userId;
	private String password;
	private String userName;

}
