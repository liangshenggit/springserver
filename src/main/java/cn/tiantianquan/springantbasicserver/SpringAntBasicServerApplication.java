package cn.tiantianquan.springantbasicserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableTransactionManagement
@SpringBootApplication
@MapperScan({"cn.tiantianquan.springantbasicserver.repository.modelMapper", "cn.tiantianquan.springantbasicserver.repository.entityMapper"})
public class SpringAntBasicServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAntBasicServerApplication.class, args);
    }
}
