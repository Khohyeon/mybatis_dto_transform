package shop.mtcoding.mybatisDto.model.board;
import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import shop.mtcoding.mybatisDto.model.user.User;

@Setter
@Getter
public class Board {
    private Integer id;
    private String title;
    private String content;
    private int userId;
    private Timestamp createdAt;
}