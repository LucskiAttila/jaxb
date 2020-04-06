package legoset;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Weigth {

    @XmlValue
    private double value;

    @XmlAttribute
    private String unit;

    public Weight() {}

    public Weigth(double value, String unit) {
        this.value = value;
        this.unit = unit;
    }

}
