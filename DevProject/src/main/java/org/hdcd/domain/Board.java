package org.hdcd.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "boardNo")
@Builder
public class Board {

	private int boardNo;
	@NonNull
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;

}
