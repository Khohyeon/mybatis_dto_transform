package shop.mtcoding.mybatisDto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @ToString
public class BoardDto {
    private Integer id;
    private String title;
    private String content;
//    private UserDto user;
    private Timestamp createdAt;
}
