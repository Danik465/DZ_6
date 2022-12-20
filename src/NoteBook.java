import java.util.*;

/**
 * * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
 *      * Создать множество ноутбуков.
 *      * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
 *      * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 *      * “Введите цифру, соответствующую необходимому критерию:
 *      * 1 - ОЗУ
 *      * 2 - Объем HHD или SSD
 *      * 3 - Операционная система
 *      * 4 - Цвет …
 *      * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
 *      * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 *      * отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 *      */


public class NoteBook {
    public   String  name;
    public String RAM;
    public String OS;
    public String color;
    public Map<String , Integer> filterNootbooks = new HashMap<>();

    public String getName() {
        return name;
    }

    public String  getRAM() {
        return RAM;
    }

    public String getOS() {
        return OS;
    }

    public String getColor() {
        return color;
    }



    public Map<String, Integer> getFilterNootbooks() {
        filterNootbooks.put(getName(), 1);
        filterNootbooks.put(getRAM(), 2);
        filterNootbooks.put(getOS(), 3);
        filterNootbooks.put(getColor(), 4);
        return filterNootbooks;
    }





    public NoteBook(String name, String RAM, String OS, String color) {


        this.name = name;
        this.RAM = RAM;
        this.OS = OS;
        this.color = color;
    }
    public  static List<NoteBook> filter(List<NoteBook> listbook){
        List<NoteBook> newlist = new ArrayList<>();

            for (NoteBook noteBook : listbook) {
                if(Integer.parseInt(noteBook.getRAM())> 1600){
                    newlist.add(noteBook);
                    System.out.println(noteBook);
                }
            }




        return newlist;
    }


    public String toString() { return  name + " / " + RAM + " / " + OS + " / " +  color+ "\n" ;}
}
