package com.wdx;

import com.wdx.mapper.BoardMapper;
import com.wdx.pojo.Board;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class MybatisplusApplicationTests {
    @Autowired
    private  BoardMapper boardMapper;
    @Test
    @Transactional
    void contextLoads() {
        List<Board> boards = boardMapper.selectList(null);
        Board board1 = boardMapper.selectById(4);
        System.out.println(board1);
        for (Board board : boards) {
            System.out.println(board);
        }
    }

}
