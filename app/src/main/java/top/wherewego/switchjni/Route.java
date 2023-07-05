package top.wherewego.switchjni;

public class Route {
    private final String address;
    private final byte metric;
    private final int rt;

    public Route(String address, byte metric, int rt) {
        this.address = address;
        this.metric = metric;
        this.rt = rt;
    }

    public String getAddress() {
        return address;
    }

    public byte getMetric() {
        return metric;
    }

    public int getRt() {
        return rt;
    }

    @Override
    public String toString() {
        return "Route{" +
                "address='" + address + '\'' +
                ", metric=" + metric +
                ", rt=" + rt +
                '}';
    }
}
