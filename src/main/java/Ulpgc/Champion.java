package Ulpgc;

public class Champion {

    private final String N;
    private final String Name;
    private final String Clase;
    private final String Style;
    private final String Difficulty;
    private final String DamageType;
    private final String Damage;
    private final String Sturdiness;
    private final String CrowdControl;
    private final String Mobility;
    private final String Functionality;

    public Champion(String n, String name, String clase, String style, String difficulty, String damageType, String damage, String sturdiness, String crowdControl, String mobility, String functionality) {
        N = n;
        Name = name;
        Clase = clase;
        Style = style;
        Difficulty = difficulty;
        DamageType = damageType;
        Damage = damage;
        Sturdiness = sturdiness;
        CrowdControl = crowdControl;
        Mobility = mobility;
        Functionality = functionality;
    }

    public String getN() {
        return N;
    }

    public String getName() {
        return Name;
    }

    public String getClase() {
        return Clase;
    }

    public String getStyle() {
        return Style;
    }

    public String getDifficulty() {
        return Difficulty;
    }

    public String getDamageType() {
        return DamageType;
    }

    public String getDamage() {
        return Damage;
    }

    public String getSturdiness() {
        return Sturdiness;
    }

    public String getCrowdControl() {
        return CrowdControl;
    }

    public String getMobility() {
        return Mobility;
    }

    public String getFunctionality() {
        return Functionality;
    }

    @Override
    public String toString() {
        return "Champion{" +
                "N='" + N + '\'' +
                ", Name='" + Name + '\'' +
                ", Clase='" + Clase + '\'' +
                ", Style='" + Style + '\'' +
                ", Difficulty='" + Difficulty + '\'' +
                ", DamageType='" + DamageType + '\'' +
                ", Damage='" + Damage + '\'' +
                ", Sturdiness='" + Sturdiness + '\'' +
                ", CrowdControl='" + CrowdControl + '\'' +
                ", Mobility='" + Mobility + '\'' +
                ", Functionality='" + Functionality + '\'' +
                '}';
    }
}
