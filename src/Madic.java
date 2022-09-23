public class Madic extends Hero implements HavingSuperAbility {

    public String applySuperAbility() {
        return "Medic  применил актевированный уголь";
    }

    public int healthPoint = 10;
    public int increaseExperience(){

        return  healthPoint + healthPoint/10;

    }

    @Override
    public String apllySuperAbility() {
        return null;
    }
}
