package com.wdx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wdx.mapper")
/*@MapperScan("com.wdx.mapper")是为了扫描com.wdx.mapper包下的
接口并生成他们的实现类注入到IOC，如果此处不添加，则必须在Mapper类中添加@Mapper注解才可以实现同样功能*/
public class MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisplusApplication.class, args);
    }

}
