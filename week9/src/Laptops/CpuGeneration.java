package Laptops;

import java.util.Locale;

public enum CpuGeneration {
    SANDY_BRIDGE,IVY_BRIDGE,HASWELL,BROADWELL,SKYLAKE,KABYLAKE;

    public String toString(){
        String lower = name().toLowerCase().replaceAll("_"," ");
        String cap = lower.substring(0,1).toUpperCase()+lower.substring(1);
        return cap;
    }
}
