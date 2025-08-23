package chain_of_responsibility;

import java.util.Map;

public abstract class AccessSender {
    protected Byte clearanceLevel;
    protected AccessSender nextSender;

    public AccessSender(int clearanceLevel) {
        this.clearanceLevel = (byte) clearanceLevel;
    }

    public AccessSender(int clearanceLevel, AccessSender nextSender) {
        this.clearanceLevel = (byte) clearanceLevel;
        this.nextSender = nextSender;
    }

    public abstract void accessManager(Map<String, Integer> docList, int userLevel);
}
