package SOLID;

public class DIP_01 {

    // Step 1: Define an abstraction
    public interface SwitchableDevice {

        void turnOn();

        void turnOff();
    }

    // Step 2: Implement the interface
    public static class LightBulb implements SwitchableDevice {

        public void turnOn() {
            System.out.println("Light is ON!");
        }

        public void turnOff() {
            System.out.println("Light is OFF!");
        }
    }

    // Step 3: Switch depends on the abstraction
    public static class Switch {

        private SwitchableDevice device;

        public Switch(SwitchableDevice device) {
            this.device = device;
        }

        public void operate() {
            device.turnOn();
        }
    }

    public static void main(String[] args) {
        SwitchableDevice lightBulb = new LightBulb();
        Switch lightSwitch = new Switch(lightBulb);
        lightSwitch.operate();
    }
}
