public class Nokia extends MobilePhone {
    private String model;
    boolean colored;
    boolean dual_sim;
    private int camera;
    boolean bluetooth;
    private int price = -1;

    Nokia (boolean sensored, String os_system, String manufacturer, String model, boolean colored, boolean dual_sim, int camera, boolean bluetooth) {
        super(sensored, os_system, manufacturer);
        this.model = model;
        this.colored = colored;
        this.dual_sim = dual_sim;
        this.camera = camera;
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        String display;
        if (colored) display = "цветной";
        else display = "монохромный";
        String dual;
        if (dual_sim) dual = "Да";
        else dual = "Нет";
        String bt;
        if (bluetooth) bt = "Да";
        else bt = "Нет";

        if (price == -1) {
            return super.toString() + " Модель " + model + ", экран " + display + ", поддержка 2 симкарт - " + dual +
                    ", поддержка блютуз - " + bt + ", камера - " + camera + "Мп.";
        }
        else return super.toString() + " Модель " + model + ", экран " + display + ", поддержка 2 симкарт - " + dual +
                ", поддержка блютуз - " + bt + ", камера - " + camera + "Мп." + " Цена = " + price + "руб.";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
