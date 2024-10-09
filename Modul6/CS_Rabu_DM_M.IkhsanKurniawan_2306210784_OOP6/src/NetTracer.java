public class NetTracer {
    public static void main(String[] args) {
        NetworkDeviceBuilder builder = new NetworkDeviceBuilder();
        Topology topology = new Topology();


        NetworkDevice routerA1 = topology.addRouterV4(builder, "A1", "192.168.0.1");
        NetworkDevice switch3 = topology.addSwitch(builder, "3", 1);


        NetworkDevice pc1 = topology.addPCv4(builder, "1", "192.168.0.4");
        NetworkDevice pc2 = topology.addPCv4(builder, "2", "192.168.0.16");


        routerA1.addModule(Module.HWIC_2T);
        routerA1.addModule(Module.HWIC_4ESW);


        switch3.addModule(Module.HWIC_8A);


        routerA1.showRunning();
        switch3.showRunning();
        pc1.showRunning();
        pc2.showRunning();
    }

}
