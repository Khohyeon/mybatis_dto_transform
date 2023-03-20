package shop.mtcoding.mybatisDto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.mybatisDto.dto.BoardDetailOutDto;
import shop.mtcoding.mybatisDto.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDto;
import shop.mtcoding.mybatisDto.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;
    public BoardDetailOutDto2 게시글상세보기(Integer id) {
       BoardDetailOutDto boardDetailOutDto = boardRepository.findByIdJoinUser(id);
       System.out.println("디버그 : " + boardDetailOutDto);
        BoardDetailOutDto2 boardDetailOutDto2 =
                new BoardDetailOutDto2(boardDetailOutDto);
        System.out.println("디버그 : " + boardDetailOutDto2);
        return boardDetailOutDto2;
    }

    public BoardJoinUserDto 게시글상세보기2(Integer id) {
        BoardJoinUserDto boardJoinUserDto = boardRepository.findByIdJoinUser2(id);
        System.out.println("디버그 : " + boardJoinUserDto);
        return boardJoinUserDto;
    }
}
