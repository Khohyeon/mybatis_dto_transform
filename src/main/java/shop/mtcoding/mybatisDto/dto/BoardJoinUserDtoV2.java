package shop.mtcoding.mybatisDto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @ToString
public class BoardJoinUserDtoV2 {
    private BoardDto board;
    private UserDto user;
    @Getter @Setter @ToString
    public static class BoardDto {
        private Integer id;
        private String title;
        private String content;
        //    private UserDto user;
        private Timestamp createdAt;
    }
    @Getter
    @Setter
    @ToString
    public static class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;

    }

}
