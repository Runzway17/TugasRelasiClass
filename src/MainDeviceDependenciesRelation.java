public class MainDeviceDependenciesRelation {
    public static void main(String[] args) {
        // Membuat object oporation system
        OperationSystem oS = new OperationSystem();

        // memanggil atribut dan nilai
        oS.operationSystem = "Android Operation System";
        oS.OSVersion = "Android 11";

        // Membuat object Device
        DeviceDependenciesRelation xiaomiLite11 = new DeviceDependenciesRelation();
        xiaomiLite11.setBrand("Xiaomi");
        xiaomiLite11.setCPU("Octa-core (2x2.3 GHz Kryo 470 Gold & 6x1.8 GHz Kryo 470 Silver)");
        xiaomiLite11.setScreen("AMOLED 6,55 inci (1.080 x 2.400 piksel), HDR 10, refresh rate 90 Hz, Gorilla Glass 5, aspek rasio 20:9");
        xiaomiLite11.setDimension("160,5 x 75,7 x 6,8 mm");
        xiaomiLite11.setWeight("157 gram");
        xiaomiLite11.setRAM("128 GB");
        xiaomiLite11.setBatteryCapacity("4.250 mAh (Fast Charging 33 Watt)");
        xiaomiLite11.turnOnDevice(oS);
        xiaomiLite11.prepareHomeDisplay(oS);
        xiaomiLite11.chargeDevice();
        xiaomiLite11.callPhone();
        xiaomiLite11.displaySpecification();
        xiaomiLite11.turnOffDevice(oS);
    }
}
