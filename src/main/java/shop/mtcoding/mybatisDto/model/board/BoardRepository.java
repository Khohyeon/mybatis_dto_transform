package shop.mtcoding.mybatisDto.model.board;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;



@Mapper
public interface BoardRepository {
    public int insert(@Param("title") String title, @Param("content") String content,
                      @Param("userId") int userId);

    public int updateById(@Param("id") int id, @Param("title") String title, @Param("content") String content);

    public int deleteById(int id);

    public List<Board> findAll();

    public Board findById(int id);

    public List<Board> findList(int id);
//
//    public List<BoardMainRespDto> findAllWithUser();
//
//    public BoardDetailRespDto findByIdWithUser(int id);

}