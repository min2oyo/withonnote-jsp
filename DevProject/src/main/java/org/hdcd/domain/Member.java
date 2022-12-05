package org.hdcd.domain;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@SuppressWarnings("unused")
@RequiredArgsConstructor
@ToString(exclude = "userName")
public class Member {

	private final String userId;
	private final String password;
	private String userName;

}
