package hu.nive.ujratervezes.kepesitovizsga.army;

public class Archer extends MilitaryUnit {

    public Archer() {
    }

    @Override
    public int doDamage() {
        return this.getDamage();
    }

    @Override
    public void sufferDamage(int i) {

    }
}
