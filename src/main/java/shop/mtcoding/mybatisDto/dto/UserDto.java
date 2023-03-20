package shop.mtcoding.mybatisDto.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class UserDto {
    private Integer id;
    private String username;
    private String password;
    private String email;
    private Timestamp createdAt;

}
