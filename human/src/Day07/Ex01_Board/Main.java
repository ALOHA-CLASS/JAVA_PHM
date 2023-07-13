package Day07.Ex01_Board;

import java.util.Date;
import java.util.Scanner;

/**
 * 게시판 프로그램
 * - 메뉴판
 * - 게시글 목록
 * - 게시글 읽기
 * - 게시글 쓰기
 * - 게시글 수정
 * - 게시글 삭제
 */
public class Main {

	static int max = 10;		// 게시글 최대 10개 제한
	static Board[] boardList = new Board[max];
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * 메뉴판 
	 */
	public static void menu() {
		System.out.println("########## 게시판 ##########");
		System.out.println("1. 게시판 목록");
		System.out.println("2. 게시판 읽기");
		System.out.println("3. 게시판 쓰기");
		System.out.println("4. 게시판 수정");
		System.out.println("5. 게시판 삭제");
		System.out.println("0. 프로그램 종료");
		System.out.print("########## 입력 : ");
	}
	
	/**
	 * 게시글 목록
	 */
	public static void list() {
		System.out.println("# 게시글 목록");
		for (Board board : boardList) {
			System.out.println(board);
		}
	}
	
	/**
	 * 게시글 읽기
	 */
	public static void read() {
		System.out.println("# 게시글 읽기");
		System.out.print("게시글 번호 : ");
		int boardNo = sc.nextInt();
		
		// 글번호 유효성 검사
		if( check(boardNo) ) {
			return;		
		}
		
		Board board = boardList[boardNo-1];
		
		if( board == null ) {
			System.out.println("게시글이 존재하지 않습니다.");
		}
		else {
			System.out.println(board);
		}
		
	}
	
	/**
	 * 게시글 쓰기
	 */
	public static void write() {
		System.out.println("# 게시글 쓰기");
		
		Board board = input();
		
		int index = getIndex();
		board.setBoardNo(index+1);				// 글번호 지정
		board.setRegDate( new Date() );			// 등록일자 지정
		board.setUpdDate( new Date() );			// 수정일자 지정
		// new Date() : 현재 날짜/시간 정보를 가진 객체
		
		// 게시글 최대 개수 제한 확인
		if( index < max ) {
			boardList[index] = board;
			// boardList[index].setBoardNo(index+1);		// 글번호 지정
			System.out.println("# 게시글이 작성되었습니다");
		}
		else {
			System.out.println("# 게시글 목록이 꽉 찼습니다");
		}
		
		
	}
	
	// 등록 가능한 index 구하기
	public static int getIndex() {
		int index = max;
		
		for (int i = 0; i < boardList.length; i++) {
			// 비어있는 게시글 목록으 index
			if( boardList[i] == null ) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * 게시글 수정
	 * @param board
	 */
	public static void update() {
		System.out.print("수정할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();				// 엔터를 입력 스트림에서 제거
		
		// 글번호 유효성 검사
		if( check(boardNo) ) {
			return;		
		}
		
		// 존재하는 글인지 확인
		if( boardList[boardNo-1] == null ) {
			System.out.println("게시글이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("# 글 수정");
		Board board = input();
		
		// 객체를 배열요소에 대입해서 수정처리
		// 이렇게 하면, 기존에 글이 없을 때도, 배열요소에 글정보가 들어간다.
		// boardList[boardNo-1] = board;
		
		// (코드수정)
		// 1. 기존 글이 있는지 확인
		// 2. 기존 글이 있는 경우에만, 배열요소의 객체에 접근해서 제목,작성자,내용을 변경한다. 
		String updatedTitle = board.getTitle();
		String updatedWriter = board.getWriter();
		String updatedContent = board.getContent();
		
		boardList[boardNo-1].setTitle(updatedTitle);
		boardList[boardNo-1].setWriter(updatedWriter);
		boardList[boardNo-1].setContent(updatedContent);
		boardList[boardNo-1].setUpdDate( new Date() );
		System.out.println("# 게시글이 수정되었습니다.");
		
	}
	
	/**
	 * 게시글 삭제
	 */
	public static void delete() {
		System.out.print("삭제할 글 번호 : ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		
		// 글번호 유효성 검사
		if( check(boardNo) ) {
			return;
		}
		
		boardList[boardNo-1] = null;
		System.out.println("게시글이 삭제되었습니다.");
	}
	
	// 글번호 유효성 검사
	public static boolean check(int boardNo) {
		
		if( boardNo <= 0 || boardNo > max ) {
			System.out.println("1~10번 까지만 입력가능합니다.");
			return true;		
		}
		return false;
	}
	
	// 게시글 정보 입력
	public static Board input() {
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("작성자 : ");
		String writer = sc.nextLine();
		
		System.out.print("내용 : ");
		String content = sc.nextLine();
		
		Board board = new Board(title, content, writer);
		return board;
	}
	
	public static void main(String[] args) {
		
		int menuNo = 0;
		
		do {
			// 메뉴판 출력
			menu();
			
			// 메뉴번호 입력
			menuNo = sc.nextInt();
			sc.nextLine();
			
			// 메뉴번호 선택
			switch (menuNo) {
				// 게시글 목록
				case 1:	 list(); break;
				// 게시글 읽기
				case 2:	 read(); break;
				// 게시글 쓰기
				case 3:	 write(); break;
				// 게시글 수정
				case 4:	 update(); break;
				// 게시글 삭제
				case 5:	 delete(); break;
				default: break;
			}
			
		} while (menuNo != 0);
		
		System.out.println("게시판을 종료합니다...");
	}
	
	
	
	
}







