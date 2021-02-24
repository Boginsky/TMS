package Task15;

//Создать класс Computer с внутренним классом, с помощью объектов которого можно хранить информацию об операционной системе, процессоре
//        и оперативной памяти.

public class Computer {

    public class Inner{
        private String os;
        private String cpu;
        private String ram;


        Inner(String os,String cpu,String ram){
            this.os = os;
            this.cpu = cpu;
            this.ram = ram;
        }

        @Override
        public String toString(){
            return "Название ОС: " + this.os + ". Название CPU: " + this.cpu + ". Название RAM: " + this.ram + ".";
        }

    }

}
