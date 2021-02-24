package Task8;

//Создать класс City с внутренним классом, с помощью объектов которого
//        можно хранить информацию о проспектах, улицах, площадях.

public class City {


    private String name;
    private int amountOfCitizen;
    private int area;
    private int dateOfConstruction;
    private String nameOfCountry;

    City(){

    }

    City(String name, int amountOfCitizen, int area, int dateOfConstruction, String nameOfCountry) {
        this.name = name;
        this.amountOfCitizen = amountOfCitizen;
        this.area = area;
        this.dateOfConstruction = dateOfConstruction;
        this.nameOfCountry = nameOfCountry;

    }
        public class InnerClass {

        InnerClass(){

        }

            private String prospect;
            private String street;
            private String square;

            InnerClass(String prospect, String street, String square){

                this.prospect = prospect;
                this.street = street;
                this.square = square;
        }

            @Override
            public String toString(){
                return "Название проспекта: " + this.prospect + ". Название улицы: " + this.street + ". Название площади: " + this.square +".";
            }

        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfCitizen() {
        return amountOfCitizen;
    }

    public void setAmountOfCitizen(int amountOfCitizen) {
        this.amountOfCitizen = amountOfCitizen;
    }

    public int getArea() {
        return area;
    }


    public void setArea(int area) {
        this.area = area;
    }

    public void setDateOfConstruction(int dateOfConstruction) {
        this.dateOfConstruction = dateOfConstruction;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }
}








