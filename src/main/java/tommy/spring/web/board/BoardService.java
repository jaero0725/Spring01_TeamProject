package tommy.spring.web.board;

import java.util.List;

public interface BoardService {
	void insertBoard(BoardVO vo);

	void updateBoard(BoardVO vo);

	void deleteBoard(BoardVO vo);

	BoardVO getBoard(BoardVO vo);

	List<BoardVO> getBoardList(BoardVO vo);

}
/*
 * 
 * 
 * Service 는 모든 메서드를 추상메서드로 가지고 있고, 
 * insertService 등등  기능별로 분리를 하게 된다. 
 */
