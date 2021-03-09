package Task15;
 public class Runner {

    public static void main(String[] args) {

        Computer.Inner computer = new Computer().new Inner("Windows","i7 kabby lake", "DDR4");


        System.out.println(computer.toString());

        }
    }
