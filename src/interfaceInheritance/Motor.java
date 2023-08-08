package interfaceInheritance;

public interface Motor extends IsMaintance, HasBrand {
    void drive();
    int getTire();
}
