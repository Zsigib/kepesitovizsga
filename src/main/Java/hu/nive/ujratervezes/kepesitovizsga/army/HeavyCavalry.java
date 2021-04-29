package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    public HeavyCavalry() {
    }

    @Override
    public int doDamage() {
        return this.getDamage();
    }

    @Override
    public void sufferDamage(int i) {

    }
}
