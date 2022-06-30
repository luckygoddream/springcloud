package com.jwq.springcloud.controller;

import com.jwq.springcloud.entities.CommonResult;
import com.jwq.springcloud.entities.Payment;
import com.jwq.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author jwq
 * @Date 2020/7/20 17:46
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

   @Value("${server.port}")
    private String serverPort;

   /***
    * 服务发现
    * **/
   @Resource
   private DiscoveryClient discoveryClient;

    //@RequestBody 注解用来处理前端传来的数据
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果:{}",result);
        log.info("serverPort:{}",serverPort);
        //服务发现 获取服务名称
        List<String> strings = discoveryClient.getServices();
       return result > 0 ? new CommonResult(200,"插入数据成功,serverPort: "+serverPort,result) : new CommonResult(400,"插入数据失败,serverPort"+serverPort,null);
//        if (result > 0){
//            return new CommonResult(200,"插入数据成功",result);
//        }else {
//            return new CommonResult(200,"插入数据成功",null);
//        }

    }

    /**
     * @PathVariable(“xxx”)
     * 通过 @PathVariable 可以将URL中占位符参数{xxx}绑定到处理器类的方法形参中@PathVariable(“xxx“)
     * @RequestMapping(value=”payment/get/{id}”)
     * 请求路径：http://localhost:8080/payment/get/1
     * ***/
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果:{}",result);
        log.info("serverPort:{}",serverPort);
        return result != null ? new CommonResult(200,"查询数据成功,serverPort: "+serverPort,result) : new CommonResult(400,"查询数据失败,serverPort"+serverPort,null);

    }
}
