package org.hdcd.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = "userName")
@Builder
public class Member {

	private final String userId;
	private final String password;
	private String userName;

}
