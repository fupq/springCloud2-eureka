/**
* @Title: AppEureka.java
* @Package com.fpq
* @Description: TODO(��һ�仰�������ļ���ʲô)
* @author slx
* @date 2019��3��20��
* @version V1.0
*/
package com.fpq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * eureka注册中心主页地址：http://127.0.0.1:8100
* @classDesc: 功能描述：eureka服务注册中心服务类
* @author 付品欣
* @createTime 2019年3月20日 下午11:16:47
* @version: V1.0
* @copyright:深圳科翔教育科技有限公司
* @wechat:qhjx666888
 */
@EnableEurekaServer //开启eurekaServer
@SpringBootApplication
public class AppEureka {

	public static void main(String[] args) {
		SpringApplication.run(AppEureka.class, args);
	}

}
