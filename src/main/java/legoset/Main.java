package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;

import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet LegoSet = new LegoSet();
        LegoSet.setName("Imperial TIE Fighter");
        LegoSet.setTheme("Star Wars");
        LegoSet.setSubtheme("Solo");
        LegoSet.setYear(Year.of(2018));
        LegoSet.setPieces(519);
        Set<String> tags = new HashSet<String>();
        tags.add("Starfighter");
        tags.add("Stormtrooper");
        tags.add("Star Wars");
        tags.add("Solo");
        LegoSet.setTags(tags);
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minfigs.add(new Minifig("Imperial Mudtrooper", 2));
        minfigs.add(new Minifig("Imperial Pilot", 1));
        minfigs.add(new Minifig("Mimban Stormtrooper", 1));        
        LegoSet.setMinifigs(minifigs);
        LegoSet.setWeigth(new Weight(0.89, "kg"));
        LegoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        LegoSet.setNumber(75211);
        
        JAXBHelper.toXML(LegoSet, System.out);

        JAXBHelper.toXML(LegoSet, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }

}
