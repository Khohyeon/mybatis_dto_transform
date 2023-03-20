package shop.mtcoding.mybatisDto.model.board;


import org.apache.ibatis.annotations.Mapper;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV1_1;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV2;
import shop.mtcoding.mybatisDto.dto.BoardJoinUserDtoV3;

import java.util.List;


@Mapper
public interface BoardRepository {
    public int insert(Board board);

    public int updateById(Board board);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public List<Board> findList(int id);

    public BoardJoinUserDtoV1_1 findByIdJoinUserV1(int id);
    public BoardJoinUserDtoV2 findByIdJoinUserV2(int id);
    public BoardJoinUserDtoV3 findByIdJoinUserV3(int id);


}