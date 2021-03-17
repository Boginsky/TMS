package Task15;
 public class Runner {

    public static void main(String[] args) {

        Computer.Inner computer = new Computer("Кирилл").new Inner("Windows","i7 kabby lake", "DDR4");
        Computer computer1 = new Computer("Кирилл");
        System.out.println(computer1.toString());
        System.out.println(computer.toString());

        }
    }
