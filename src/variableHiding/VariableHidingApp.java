package variableHiding;

public class VariableHidingApp {
    public static void main(String[] args) {

        /**
         * variable hiding terjadi ketika kita mau mengoverride kelas child dari parent
         */

        Child child = new Child();
        child.name = "Singgih";
        child.doit();
        System.out.println("Hello " + child.name);

        Parent parent = (Parent) child;
        parent.name = "Pratama";
        parent.doit();
        System.out.println("Hello " + parent.name);
    }
}
