package xyz.itwill09.util;

import lombok.Data;

//페이징 처리 관련 값들을 저장하기 위한 클래스
@Data
public class Pager {
	//생성자 매개변수로 전달받은 값을 필드에 저장
	private int pageNum;//요청 페이지 번호
	private int pageSize;//하나의 페이지에 출력될 게시글의 갯수
	private int totalSize;//전체 게시글의 갯수
	private int blockSize;//하나의 블럭에 출력될 페이지 번호의 갯수
	
	//생성자로 초기화된 필드값을 사용해 계산 결과값을 필드에 저장
	private int totalPage;//전체 페이지의 갯수
	private int startRow;//요청 페이지에 출력될 게시글의 시작 행번호
	private int endRow;//요청 페이지에 출력될 게시글의 종료 행번호
	private int startPage;//현재 블럭에 출력될 시작 페이지 번호
	private int endPage;//현재 블럭에 출력될 종료 페이지 번호
	private int prevPage;//이전 블럭에 출력될 시작 페이지 번호
	private int nextPage;//다음 블럭에 출력될 시작 페이지 번호
		
	public Pager(int pageNum, int pageSize, int totalSize, int blockSize) {
		super();
		this.pageNum = pageNum;
		this.pageSize = pageSize;
		this.totalSize = totalSize;
		this.blockSize = blockSize;
		
		calcPaging();
	}
	
	private void calcPaging() {
		totalPage=(int)Math.ceil((double)totalSize/pageSize);// 전체 페이지 수를 계산합니다.
		if(pageNum <=0 || pageNum > totalPage) {// 페이지 번호가 범위를 벗어나면
			pageNum=1;// 첫 번째 페이지로 설정합니다.
		}
		
		startRow=(pageNum-1)*pageSize+1;// 현재 페이지에서의 데이터 시작 행 번호를 계산합니다.
		endRow=pageNum*pageSize;// 현재 페이지에서의 데이터 끝 행 번호를 계산합니다.
		if(endRow > totalSize) {// 마지막 페이지의 끝 행 번호가 전체 데이터 수를 초과하면
			endRow=totalSize;// 끝 행 번호를 전체 데이터 수로 조정합니다.
		}
		
		startPage=(pageNum-1)/blockSize*blockSize+1;// 현재 페이지가 속한 페이지 블록의 시작 페이지를 계산합니다.
		endPage=startPage+blockSize-1;// 현재 페이지가 속한 페이지 블록의 끝 페이지를 계산합니다.

		prevPage=startPage-blockSize;// 이전 페이지 블록의 마지막 페이지 번호를 계산합니다.
		nextPage=startPage+blockSize;// 다음 페이지 블록의 첫 페이지 번호를 계산합니다.
	}
}