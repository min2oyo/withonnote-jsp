package org.hdcd;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hdcd.domain.Board;
import org.hdcd.domain.Member;
import org.hdcd.domain.Student;
import org.hdcd.domain.UserItem;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LombokTests {

	@Test
	public void testNoArgsConstructor() {

		Board board = new Board();

		System.out.println();
		System.out.println("testNoArgsConstructor" + board);

	}

	@Test
	public void testRequiredArgsConstructor() {

		Board board = new Board("테스트 제목");

		System.out.println();
		System.out.println("testRequiredArgsConstructor: " + board);

	}

	@Test
	public void testGetter() {

		Board board = new Board();

		System.out.println();
		System.out.println("testGetter: " + board.getTitle());

	}

	@Test
	public void testSetter() {

		Board board = new Board();
		board.setTitle("게시판제목");

		System.out.println();
		System.out.println("testSetter: " + board.getTitle());

	}

	@Test
	public void testToString() {

		Board board = new Board();

		System.out.println();
		System.out.println("testToString: " + board);

	}

	@Test
	public void testBoard() {

		Board board1 = new Board();
		board1.setBoardNo(1);
		board1.setTitle("title1");

		Board board2 = new Board();
		board1.setBoardNo(2);
		board1.setTitle("title2");

		Board board3 = new Board();
		board1.setBoardNo(2);
		board1.setTitle("title3");

		Set<Board> boardSet = new HashSet<Board>();

		boardSet.add(board1);
		boardSet.add(board2);
		boardSet.add(board3);

		System.out.println();
		System.out.println("testBoard:");
		System.out.println("저장된 데이터 수: " + boardSet.size());

		Iterator<Board> it = boardSet.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

	@Test
	public void testUserItem() {

		UserItem userItem1 = new UserItem();
		userItem1.setUserNo(1);
		userItem1.setItemId(100);
		userItem1.setDescription("userItem1");

		UserItem userItem2 = new UserItem();
		userItem2.setUserNo(1);
		userItem2.setItemId(200);
		userItem2.setDescription("userItem2");

		UserItem userItem3 = new UserItem();
		userItem3.setUserNo(1);
		userItem3.setItemId(200);
		userItem3.setDescription("userItem3");

		Set<UserItem> userItemSet = new HashSet<UserItem>();

		userItemSet.add(userItem1);
		userItemSet.add(userItem2);
		userItemSet.add(userItem3);

		System.out.println();
		System.out.println("testUserItem:");
		System.out.println("저장된 데이터 수: " + userItemSet.size());

		Iterator<UserItem> it = userItemSet.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

	@Test
	public void testStudent() {

		Student student1 = new Student();
		student1.setStudentNo(1);
		student1.setName("Alex");

		Student student2 = new Student();
		student2.setStudentNo(2);
		student2.setName("Alex");

		Set<Student> studentSet = new HashSet<Student>();

		studentSet.add(student1);
		studentSet.add(student2);

		System.out.println();
		System.out.println("testStudent: ");
		System.out.println("저장된 데이터 수: " + studentSet.size());

		Iterator<Student> it = studentSet.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

	@Test
	public void testRequiredArgsConstructor2() {

		Member member = new Member("userId1", "password1");

		System.out.println();
		System.out.println("testRequiredArgsConstructor2: " + member);

	}

	@Test
	public void testAllArgsConstructor() {

		System.out.println();
		Board board = new Board(1, "title1", "content1", "writer1", LocalDateTime.now());

		System.out.println(board);

	}

	@Test
	public void testAllArgsConstructor2() {

		System.out.println();
		Member member = new Member("userId1", "password1", "userName1");

		System.out.println(member);

	}

	@Test
	public void testBoardBuilder() {

		Board board = Board.builder()
				.boardNo(1)
				.title("title1")
				.content("content1")
				.writer("writer1")
				.regDate(LocalDateTime.now())
				.build();

		System.out.println();
		System.out.println("testBoardBuilder: " + board);

	}

	@Test
	public void testMemberBuilder() {

		Member member = Member.builder()
				.userId("userId1")
				.password("password1")
				.build();

		System.out.println();
		System.out.println("testMemberBuilder: " + member);

	}

}
