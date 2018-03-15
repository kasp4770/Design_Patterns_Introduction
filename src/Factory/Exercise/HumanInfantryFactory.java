package Factory.Exercise;

public class HumanInfantryFactory extends InfantryUnit{


    public InfantryUnit createUnit(int techLevel) {
        InfantryUnit character = null;

        switch (techLevel) {
            case 1:
                character = new RockHauler();
                character.setRace("Human"); break;
            case 2:
                character = new SpearThrower();
                character.setRace("Human"); break;
            case 3:
                character = new Archer();
                character.setRace("Human"); break;
            case 4:
                character = new CrossbowMan();
                character.setRace("Human"); break;
            case 5:
                character = new Musketeer();
                character.setRace("Human"); break;
        }
        if (techLevel <1 || techLevel >5){
            character = null;
        }
        return character;
    }
}
