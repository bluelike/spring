import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rote",locations = "classpath:config/rote.yml")
public class RoteConfig {
    private Logger logger = LoggerFactory.getLogger(getClass());
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String age;


    public void init(){
        logger.info("method3-name:"+name",method3-age:"+age);
    }
}
