package weather.temp.domain;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import weather.temp.domain.conv.Converter;
import weather.temp.domain.pl.Place;

@SpringBootApplication

public class SpringbootTempApplication implements CommandLineRunner{

    @Resource
    Converter Converter;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootTempApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        final String xmlFile = "Place.xml";
        Place pl = new Place(20);

        //Convert Place Object to Xml!
        System.out.println("Convert Place Object to Xml!");
        Converter.convertFromObjectToXML(pl, xmlFile);
        System.out.println("Done \n");

        //from XML to Place Object
        System.out.println("Convert Xml to Place Object!");
        Place place2 = (Place)Converter.convertFromXMLToObject(xmlFile);
        System.out.println(place2.toString());
        System.out.println("Done");

    }
}
