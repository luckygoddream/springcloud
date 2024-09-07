import cglibproxy.CglibProxyFactory;
import cglibproxy.service.AliSmsService;
import org.junit.Test;

public class MyTest {
    @Test
    public void testStatistics() {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
        aliSmsService.send("java");
    }
}
