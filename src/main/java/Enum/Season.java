package Enum;

public enum Season {

    SUMMER(24), WINTER(-5), AUTUMN(5), SPRING(15);

    private int temperature;

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

}
