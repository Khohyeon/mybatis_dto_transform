package shop.mtcoding.mybatisDto.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDetailOutDto2 {
    private Integer id;
    private String title;
    private String content;
    private UserDto user; // json 리턴될때 이름이 훨신이쁘기때문에 user 씀
    private Timestamp createdAt;

    public BoardDetailOutDto2(BoardDetailOutDto board) {
        this.id = board.getId();
        this.title = board.getTitle();
        this.content = board.getContent();
        this.user = new UserDto(
                board.getUserId(),
                board.getUserUsername(),
                board.getUserPassword(),
                board.getUserEmail(),
                board.getUserCreatedAt());
        this.createdAt = board.getCreatedAt();
    }

    @Getter
    @Setter
    @ToString
    public class UserDto {
        private Integer id;
        private String username;
        private String password;
        private String email;
        private Timestamp createdAt;

        public UserDto(Integer id, String username, String password, String email, Timestamp createdAt) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.email = email;
            this.createdAt = createdAt;
        }
    }

}