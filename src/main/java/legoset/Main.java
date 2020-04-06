package legoset;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.time.Year;
import java.util.List;
import java.util.Set;

import jaxb.JAXBHelper;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIE Fighter");
        legoset.setTheme("Star Wars");
        legoset.setSubtheme("Solo");
        legoset.setYear(Year.of(2018));
        legoset.setPieces(519);
        legoset.setTags(List.of("Starfighter", "Stormtrooper", "Star Wars", "Solo"));
        ArrayList<Minifig> minifigs = new ArrayList<>();
        minfigs.add(new Minifig("Imperial Mudtrooper", 2));
        minfigs.add(new Minifig("Imperial Pilot", 1));
        minfigs.add(new Minifig("Mimban Stormtrooper", 1));        
        legoset.setMinifigs(minifigs);
        Weight weigths = new Weight();
        legoset.setWeigth(weights);
        legoset.setUrl(new URL("https://brickset.com/sets/75211-1/Imperial-TIE-Fighter"));

        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("Legoset.xml"));
        System.out.println(JAXBHelper.fromXML(LegoSet.class, new FileInputStream("legoset.xml")));
    }

}
