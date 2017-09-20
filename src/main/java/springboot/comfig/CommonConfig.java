package springboot.comfig;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

/**
 * 读取 通用配置
 */
@Configuration
public class CommonConfig {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Value("${spring.application.name:1}")
    private  String appName;
    @Value("${server.port:8080}")
    private String port;

    public void init (){
         logger.info("method1:spring.application.name-"+this.appName);
         logger.info("method1:server.port-"+this.port);

    }


}
