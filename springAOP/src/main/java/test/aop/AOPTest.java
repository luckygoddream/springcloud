package test.aop;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;

import javax.annotation.Resource;

/**
 * @Author jwq
 * @Date 2021/4/13 15:53
 */
@SpringBootTest
public class AOPTest {

  @Resource //先根据名字 再根据类型 java自带的
//  @Autowired //根据类型注入 spring带的
  private CalcService calcService;

    @Test
    public void testAop4() {
        System.out.println(String.format("Spring Verision : %s, Sring Boot Version : %s.", //
                SpringVersion.getVersion(), SpringBootVersion.getVersion()));

        int div = calcService.div(10, 2);
        System.out.println(div);
    }
}
