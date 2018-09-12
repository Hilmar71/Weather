package weather.temp.domain.con;

import javax.annotation.Resource;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.castor.CastorMarshaller;
import weather.temp.domain.conv.Converter;


@Configuration
public class Config {

    @Resource
    ConfigurableApplicationContext appContext;

    @Bean
    Converter Converter(){
        Converter Converter = new Converter();
        Converter.setMarshaller(castorMarshaller());
        Converter.setUnmarshaller(castorMarshaller());
        return Converter;
    }

    @Bean
    public CastorMarshaller castorMarshaller(){
        CastorMarshaller castorMarshaller = new CastorMarshaller();
        castorMarshaller.setMappingLocation(appContext.getResource("classpath:Mapping.xml"));
        return castorMarshaller;
    }
}
