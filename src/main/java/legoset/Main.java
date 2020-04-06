package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoSet = new LegoSet();
        legoSet.setName("Imperial TIE Fighter");
        legoSet.setTheme("Star Wars");
        legoSet.setSubtheme("Solo");
        legoSet.setYear(Year.of(2018));
        legoSet.setPieces(519);
        legoSet.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minfigs.add(new Minifig("Imperial Mudtrooper", 2));
        minfigs.add(new Minifig("Imperial Pilot", 1));
        minfigs.add(new Minifig("Mimban Stormtrooper", 1));        
        legoSet.setMinifigs(minifigs);
        legoSet.setWeigth(new Weight("kg", 0.89));
        legoSet.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoSet, System.out);

        JAXBHelper.toXML(legoSet, new FileOutputStream("legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }

}
