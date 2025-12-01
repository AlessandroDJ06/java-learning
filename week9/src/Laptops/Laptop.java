package Laptops;

public class Laptop {
    private String owner;
    private CpuGeneration cpuGeneration;
    private CpuType cpuType;
    private int ram;
    private int disk;
    private Brand brand;

    public Laptop(String owner,CpuGeneration cpuGeneration,CpuType cpuType, int ram,int disk,Brand brand){
        this.owner = owner;
        this.cpuGeneration = cpuGeneration;
        this.cpuType = cpuType;
        this.ram = ram;
        this.disk = disk;
        this.brand = brand;
    }

    public String getOwner() {
        return owner;
    }

    public CpuGeneration getCpuGeneration() {
        return cpuGeneration;
    }

    public CpuType getCpuType() {
        return cpuType;
    }

    public int getRam() {
        return ram;
    }

    public int getDisk() {
        return disk;
    }

    public Brand getBrand() {
        return brand;
    }

    public String toString(){
        return String.format("%s: %s (%s %s), %dGB, %dGB",owner,brand,cpuType,cpuGeneration,ram,disk);
    }
}
