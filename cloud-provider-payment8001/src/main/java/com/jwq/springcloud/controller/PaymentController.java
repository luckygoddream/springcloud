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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

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


//    /**
//     *
//     * CREATE TABLE 'order_info'(
//     * 'order_id' bigint (20) unsigned NOT NULL AUTO_INCREMENT COMMENT '订单自增id'，
//     * 'order_number' varchar(32)DEFAULT NULL COMMENT'订单号，唯一'，
//     * `buyer id` bigint (20)DEFAULT NULL COMMENT '买家ID'，
//     * 'trade_status' tinyint(2) unsigned DEFAULT '0' COMMENT '交易状态:0为进行中,1,已完成，2,为取消交易,3,已结算'，
//     * 'pay_status' tinyint(2) unsigned DEFAULT '0' COMMENT'支付状态:1，未付款，2，已付款，3，线下付款，4线下付款已收款'，
//     * 'pay_type' tinyint(2) unsigned DEFAULT '0' COMMENT '支付方式：0，微信，1，支付宝，2，银联'，
//     * 'order_amount' decimal (12,2)DEFAULT NULL COMMENT '订单金额'，
//     * 'pay_amount' decimal (12,2)DEFAULT NULL COMMENT'付款金额，
//     * 'total_amount' decimal (12,2)DEFAULT NULL COMMENT'商品最终金额'，
//     * 'pay_time' datetime DEFAULT NULL COMMENT '订单支付时间'，
//     * 'outer_trade_no' varchar (48) DEFAULT NULL COMMENT '交易订单号，比如支付宝给我平台的订单号，
//     * 'create_time' datetime DEFAULT NULL COMMENT '订单创建时间'，
//     * 'remark' varchar(255) DEFAULT NULL COMMENT '订单备注，由用户提交订单前填写·，
//     * 'delivery_type' tinyint (4) DEFAULT '1'COMMENT '配送方式：1为平台送,2.卖家自己送'，
//     * PRIMARY KEY ( 'order_id')
//     * )ENGINE=InnoDB AUTO_INCREMENT=508 DEFAULT CHARSET=utf8 COMMENT='基础订单表';
//     * */
//    //生成订单
//    @PostMapping(value = "/order/create")
//    public void createOrderInfo(@RequestBody OrderInfo orderInfo){
//        UUID uuid = UUID.randomUUID();//生成唯一不重复订单号
//        String orderNumber = uuid.toString().replaceAll("\\-", "");
//        LocalDateTime now = LocalDateTime.now();
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        String nowFormat = now.format(dateTimeFormatter);
//        orderInfo.setOrderNUmber(orderNumber);//添加订单号
//        orderInfo.setCreateTime(nowFormat);//添加生成时间
//        orderInfo.setXXX//添加相关信息
//        orderInfoService.insert(orderInfo);//订单信息入库操作
//
//    }
}
