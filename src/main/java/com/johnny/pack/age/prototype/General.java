package com.johnny.pack.age.prototype;

// Doesn't support cloning
public class General extends GameUnit{

    private String state = "idle";

    public void boostMorale(){
        this.state = "MoraleBoost";
    }

    @Override
    public String toString(){
        return "General " + state + " @ " + getPosition();
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Generals are unique");
    }

    @Override
    protected void reset() {
        throw new UnsupportedOperationException("Reset not supported");
    }
}
