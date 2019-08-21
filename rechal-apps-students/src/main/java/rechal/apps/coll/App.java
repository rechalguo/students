package rechal.apps.coll;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.core.convert.converter.Converter;

import rechal.apps.coll.util.DateTimeUtil;

/**
 * Hello world!
 *
 */

@SpringBootApplication(exclude = {
		//jdbc auto configure
		//DataSourceAutoConfiguration.class,
		//DataSourceTransactionManagerAutoConfiguration.class,
		QuartzAutoConfiguration.class,
		HibernateJpaAutoConfiguration.class
})
@ImportResource(value={"classpath:META-INF/spring/applicationContext-beans.xml"})
@ComponentScan(basePackages = {"rechal.apps.coll"})
@MapperScan(basePackages = {"rechal.apps.coll.ext.mapper","rechal.apps.coll.mapper"})
public class App 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(App.class, args);
        System.out.println( "Hello World!" );
    }
    
    /**
     * 处理日期问题
     * @return
     */
    @Bean
    public Converter<String, Date> addNewConvert() {
        return new Converter<String, Date>() {
            @Override
            public Date convert(String source) {
            	if(StringUtils.isBlank(source)) return null;
            	String fmt=DateTimeUtil.getDateFormat(source);
                SimpleDateFormat sdf = new SimpleDateFormat(fmt);
                Date date = null;
                try {
                    date = sdf.parse((String) source);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return date;
            }
        };
    }
}
