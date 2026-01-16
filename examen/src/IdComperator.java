import java.util.Comparator;

public class IdComperator implements Comparator<SmartDevice> {
    @Override
    public int compare(SmartDevice o1, SmartDevice o2) {
        return o1.getId().compareTo(o2.getId());
    }
}
