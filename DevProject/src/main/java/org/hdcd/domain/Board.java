package org.hdcd.domain;

import java.time.LocalDateTime;

// 클래스는 직렬화되어야 한다.
public class Board implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private LocalDateTime regDate;

	// 클래스는 기본 생성자를 가지고 있어야 한다.
	public Board() {

		super();

	}

	public Board(int boardNo, String title) {

		super();
		this.boardNo = boardNo;
		this.title = title;

	}

	// 클래스의 속성들은 get, set 혹은 표준 명명법을 따르는 메서드들을 사용해 접근할 수 있어야 한다.
	public int getBoardNo() {

		return boardNo;

	}

	public void setBoardNo(int boardNo) {

		this.boardNo = boardNo;

	}

	public String getTitle() {

		return title;

	}

	public void setTitle(String title) {

		this.title = title;

	}

	public String getContent() {

		return content;

	}

	public void setContent(String content) {

		this.content = content;

	}

	public String getWriter() {

		return writer;

	}

	public void setWriter(String writer) {

		this.writer = writer;

	}

	public LocalDateTime getRegDate() {

		return regDate;

	}

	public void setRegDate(LocalDateTime regDate) {

		this.regDate = regDate;

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		result = prime * result + boardNo;
		return result;

	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		Board other = (Board) obj;
		if (boardNo != other.boardNo) return false;
		return true;

	}

	@Override
	public String toString() {

		return "Board(boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer + ", regDate=" + regDate + ")";

	}

}
