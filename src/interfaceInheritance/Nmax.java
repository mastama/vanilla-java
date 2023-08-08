package interfaceInheritance;

public class Nmax implements Motor{
    @Override
    public void drive() {
        System.out.println("U can drive Nmax");
    }

    @Override
    public int getTire() {
        return 5;
    }

    @Override
    public String getBrand() {
        return "Yamaha";
    }

    @Override
    public boolean isMainteances() {
        return false;
    }
}
