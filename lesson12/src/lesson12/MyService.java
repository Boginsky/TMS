package lesson12;

import java.util.Objects;

@Version(version = 7.0, nameVersion = "Kaby")
public class MyService {
    private String name;
    private int id;

    MyService(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return id == myService.id && Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    private void thisClassInfo (){
        System.out.println("ID: " + id + ".Name of Service: " + name);
    }
}
