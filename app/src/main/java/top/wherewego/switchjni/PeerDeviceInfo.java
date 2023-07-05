package top.wherewego.switchjni;

public class PeerDeviceInfo {
    private final int virtualIp;
    private final String name;
    private final String status;
    private final Route route;

    public PeerDeviceInfo(int virtualIp, String name, String status, Route route) {
        this.virtualIp = virtualIp;
        this.name = name;
        this.status = status;
        this.route = route;
    }

    public int getVirtualIp() {
        return virtualIp;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Route getRoute() {
        return route;
    }

    @Override
    public String toString() {
        return "PeerDeviceInfo{" +
                "virtualIp=" + virtualIp +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", route=" + route +
                '}';
    }
}
