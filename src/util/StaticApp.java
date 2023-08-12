package util;

public class StaticApp {
    public static void main(String[] args) {

        // print Constant
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        // print MathUtil
        System.out.println(MathUtil.sum(5,6,7,8,9,4));

        // print Country dan City (dari innerClass)
        Country.city city = new Country.city();
        city.setName("Depok");
        System.out.println(city.getName());

        // print StaticBlock
        System.out.println("Laptop Anda memiliki " + StaticBlock.PROCESSOR + " Processor");
    }
}
