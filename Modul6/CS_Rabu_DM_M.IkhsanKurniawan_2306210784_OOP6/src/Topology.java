import java.lang.Module;
import java.util.List;

public class Topology {

    public void addRouterV4(NetworkDeviceBuilder builder,String deviceName, String ipV4){
        builder.setModelName("Netlab Router");
        builder.setDeviceName(deviceName);
        builder.setIpV4(ipV4);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
    }

    public void addSwitch(NetworkDeviceBuilder builder,String deviceName, String macAddress, int vlan){
        builder.setModelName("Netlab Switch");
        builder.setDeviceName(deviceName);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setVlan(vlan);
    }

    public void addPCv4(NetworkDeviceBuilder builder,String deviceName, String macAddress, int vlan, String ipV4){
        builder.setModelName("Netlab PC");
        builder.setDeviceName(deviceName);
        builder.setMacAddress(NetworkDevice.randomMACAddress());
        builder.setIpV4(ipV4);
    }
}
