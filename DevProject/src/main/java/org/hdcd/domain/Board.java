package org.hdcd.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "boardNo")
@ToString
public class Board {

	private int boardNo;
	@NonNull
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;

}
