package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{


    public Swordsman(boolean hasArmor) {
    }

    @Override
    public int doDamage() {
        return this.getDamage();
    }

    @Override
    public void sufferDamage(int i) {

    }
}
