package Factory.Exercise;

public class Main {
    public static void main(String[] args) {
        HumanInfantryFactory humanInfantryFactory = new HumanInfantryFactory();

        InfantryUnit human1 = humanInfantryFactory.createUnit(1);
        
    }
}
