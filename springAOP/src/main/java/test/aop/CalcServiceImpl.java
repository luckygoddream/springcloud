package test.aop;

import org.springframework.stereotype.Service;


/**
 * @Author jwq
 * @Date 2021/4/13 15:52
 */
@Service
public class CalcServiceImpl implements CalcService {
    @Override
    public int div(int x, int y) {
        int a = 0;
        int b = 1;
        int c = a + b;
        int result = x / y;
        System.out.println("输出结果为："+result);
        return result;
    }
}
