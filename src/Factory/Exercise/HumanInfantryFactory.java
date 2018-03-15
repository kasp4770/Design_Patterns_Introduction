package Factory.Exercise;

public class HumanInfantryFactory {


    public InfantryUnit createUnit(int techLevel) {


        switch (techLevel) {
            case 1:
                return new RockHauler();
            case 2:
                return new SpearThrower();
            case 3:
                return new Archer();
            case 4:
                return new CrossbowMan();
            case 5:
                return new Musketeer();
        }
        if (techLevel <1 || techLevel >5){
            return null;
        }
        return null;
    }
}
