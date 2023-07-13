package Day07.Ex01_Board;

import java.util.Date;

/**
 * 게시판
 * - 게시글 번호
 * - 제목
 * - 내용
 * - 작성자
 * - 등록일자
 * - 수정일자
 */
public class Board {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	// Date : 날짜/시간을 다루는 클래스 (java.util.xxx)
	private Date regDate;
	private Date updDate;
	
	// 생성자
	public Board() {
		this("제목없음", "작성자없음", "내용없음");
	}

	public Board(String title, String writer, String content) {
		this.title = title;
		this.writer = writer;
		this.content = content;
	}

	// getter, setter
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

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	// toString
	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regDate=" + regDate + ", updDate=" + updDate + "]";
	}
	
	
	
}










