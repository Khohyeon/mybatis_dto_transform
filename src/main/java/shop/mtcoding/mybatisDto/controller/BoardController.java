package shop.mtcoding.mybatisDto.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.mtcoding.mybatisDto.dto.BoardDetailOutDto2;
import shop.mtcoding.mybatisDto.service.BoardService;

@RequiredArgsConstructor
@RestController
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/board/{id}")
    public ResponseEntity<?> detail(@PathVariable Integer id) {
        BoardDetailOutDto2 boardDetailOutDto2 = boardService.게시글상세보기(id);
        return ResponseEntity.ok().body(boardDetailOutDto2);
    }

}
