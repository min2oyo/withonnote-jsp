package org.hdcd;

import org.hdcd.domain.Board;
import org.hdcd.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LombokTests {

	@Test
	public void testNoArgsConstructor() {

		Board board = new Board();

		System.out.println("testNoArgsConstructor" + board);

	}

	@Test
	public void testRequiredArgsConstructor() {

		Board board = new Board("테스트 제목");

		System.out.println("testRequiredArgsConstructor: " + board);

	}

	@Test
	public void testGetter() {

		Board board = new Board();

		System.out.println("testGetter: " + board.getTitle());

	}

	@Test
	public void testSetter() {

		Board board = new Board();
		board.setTitle("게시판제목");

		System.out.println("testSetter: " + board.getTitle());

	}

	@Test
	public void testToString() {

		Board board = new Board();

		System.out.println("testToString: " + board);

	}

	@Test
	public void testToStringExclude() {

		Member member = new Member();

		System.out.println("testToStringExclude: " + member);

	}

}
