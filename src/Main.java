import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
                NoteBook Acer = new NoteBook("Acer", "1666", "Windows 7", "Black");
                NoteBook Mac= new NoteBook("Macbook", "1333", "MacOS", "White");
                NoteBook Samsung = new NoteBook("Samsung", "2400", "Windows 10", "Red");
                NoteBook Asus = new NoteBook("Asus", "3200", "Windows 11", "Black");
                List<NoteBook> noteBooks = new ArrayList<>();
                noteBooks.add(Acer);
                noteBooks.add(Mac);
                noteBooks.add(Samsung);
                noteBooks.add(Asus);
                NoteBook.filter(noteBooks);



        }




}