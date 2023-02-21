public class MobilePhone {
    private boolean sensored;
    private String os_system;
    private String manufacturer;

    MobilePhone (boolean sensored, String os_system, String manufacturer) {
        this.sensored = sensored;
        this.os_system = os_system;
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
    String sensor;
    if (sensored) sensor = "сенсорный"; else sensor = "кнопочный";
    return "Телефон " + sensor + " c ОС " + os_system + " производства " + manufacturer + ".";
    }
}
