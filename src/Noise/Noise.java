package Noise;

import OtherObjects.Room;

abstract public class Noise {
    protected String name;
    public Noise(String n) {
        this.name = n;
    }

    public abstract void MakeNoise(Room o);


    public void TitleVerification(String n) {
        if (n == "")
            throw new RuntimeException("Отсутствует название");
    }
    @Override
    public String toString() {

        return name;
    }

}
