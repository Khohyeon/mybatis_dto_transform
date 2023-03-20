package shop.mtcoding.mybatisDto.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV1_1;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV1_2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatisDto.model.board.BoardRepository;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;
    public BoardJoinUserDtoV1_2 게시글상세보기V1(Integer id) {
        BoardJoinUserDtoV1_1 boardJoinUserDtoV1_1 = boardRepository.findByIdJoinUserV1(id);
        BoardJoinUserDtoV1_2 boardJoinUserDtoV1_2 = new BoardJoinUserDtoV1_2(boardJoinUserDtoV1_1);
        return boardJoinUserDtoV1_2;
    }

    public BoardJoinUserDtoV2 게시글상세보기V2(Integer id) {
        BoardJoinUserDtoV2 boardJoinUserDto = boardRepository.findByIdJoinUserV2(id);
        System.out.println("디버그 : " + boardJoinUserDto);
        return boardJoinUserDto;
    }

    public BoardJoinUserDtoV3 게시글상세보기V3(Integer id) {
        BoardJoinUserDtoV3 boardJoinUserDto2 = boardRepository.findByIdJoinUserV3(id);
        System.out.println("디버그 : " + boardJoinUserDto2);
        return boardJoinUserDto2;
    }
}
