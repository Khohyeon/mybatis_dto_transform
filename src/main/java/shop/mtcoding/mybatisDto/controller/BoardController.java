package shop.mtcoding.mybatisDto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV1_2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV3;
import shop.mtcoding.mybatisDto.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardJoinUserDtoV1_2 dtoV1 = boardService.게시글상세보기V1(id);
        return ResponseEntity.ok().body(dtoV1);
    }

    @GetMapping("/board/v2/{id}")
    public ResponseEntity<?> detailV2(@PathVariable Integer id) {
        BoardJoinUserDtoV2 dtoV2 = boardService.게시글상세보기V2(id);
        return ResponseEntity.ok().body(dtoV2);
    }

    @GetMapping("/board/v3/{id}")
    public ResponseEntity<?> detailV3(@PathVariable Integer id) {
        BoardJoinUserDtoV3 dtoV3 = boardService.게시글상세보기V3(id);
        return ResponseEntity.ok().body(dtoV3);
    }

}
