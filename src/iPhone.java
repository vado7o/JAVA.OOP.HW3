public class iPhone extends MobilePhone {
    private String model;
    private int display;
    private int hdd;
    private int camera;
    private int price = -1;


    iPhone(boolean sensored, String os_system, String manufacturer, String model, int display, int hdd, int camera) {
        super(sensored, os_system, manufacturer);
        this.model = model;
        this.display = display;
        this.hdd = hdd;
        this.camera = camera;
    }

    @Override
    public String toString() {
        if (price == -1) {
            return super.toString() + " Модель " + model + ", диагональ экрана " + display + "''," + " память - " + hdd + "Гб, камера - " + camera + "Мп.";
        }
        else return super.toString() + " Модель " + model + ", диагональ экрана " + display + "''," + " память - " + hdd + "Гб, камера - " + camera + "Мп." + " Цена = " + price + "руб.";
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
