package org.dongho.board.service;

import org.dongho.board.domain.Board;
import org.dongho.board.dto.BoardDTO;

public interface BoardService {

	// dto�� ������ vo�� ����� �޼���
	default Board toDomain(BoardDTO dto) {
		
		Board.builder().bno(dto.getBno())
					   .title(dto.getTitle())
					   .content(dto.getContent())
					   .writer(dto.getWriter())
					   .regdate(dto.getRegdate())
					   .updateDate(dto.getUpdateDate())
					   .build();
		
		return null;
					   
	}
	
}
