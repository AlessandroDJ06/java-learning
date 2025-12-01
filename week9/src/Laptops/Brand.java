package Laptops;

public enum Brand {
    ACER,APPLE,ASUS,DELL,HP,LENOVO,MEDION,TOSHIBA;

    public String toString(){
        String lower = name().toLowerCase();
        String cap = lower.substring(0,1).toUpperCase()+lower.substring(1);
        return cap;
    }
}
