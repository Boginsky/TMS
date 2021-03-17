package lesson12.task28;


/*Написать класс, который умеет хранить в себе массив любых типов
		данных (int, long etc.). Реализовать метод, который возвращает
		любой элемент массива по индексу.*/


public class Task28 {

    public static <T> void method(T[] arr) {

        T[] t = arr;

        Box<T> box = new Box<>();
        box.setArr(t);
        System.out.println("Элемент под индексом 1 " + box.getIndex(1));

        for (int i = 0; i < box.length(); i++) {
            System.out.println(box.getIndex(i) + " ");
        }

    }


    public static void main(String[] args) {
        String[] s = {"Hello", "My", "Name"};
        Integer[] i = {1,22,23123,123123,123};
        method(i);
        method(s);


    }
}


class Box<T> {
    private T[] arr;


    public T getIndex(int index) {
        return arr[index];
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }


    public int length() {
        return arr.length;
    }
}