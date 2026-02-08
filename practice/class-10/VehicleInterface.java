interface Vehicle{
    boolean startstop();
}
interface LandVehicle extends Vehicle{
    void SpeedControl(int speed);
}
interface AirVehicle extends Vehicle{
    void AttitudeControl(int attitude);
}
class HybridVehicle implements LandVehicle, AirVehicle, Vehicle{
    private int speed, attitude;
    HybridVehicle(int speed, int attitude){
        this.speed = speed;
        this.attitude = attitude;
    }

    @Override
    public boolean startstop() {
        return true;
    }
    public void SpeedControl(int speed) {
        System.out.println("Speed Control: " + speed);
    }

    public void AttitudeControl(int attitude){
        System.out.println("Attitude Control: " + attitude);
    }
}
public interface VehicleInterface {
    public static void main (String args[]){
        HybridVehicle hybrid = new HybridVehicle(10,10);
        hybrid.startstop();
        hybrid.SpeedControl(10);
        hybrid.AttitudeControl(10);

        Vehicle ob = hybrid;
        ob.startstop();

    }
}
