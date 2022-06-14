import javax.lang.model.type.NullType;

public class Instructor {
    public long id;
    public String name;
    public String title;
    public String department;
    public Book[] books;

    /*
    public Instructor(long id, String name, String title, String department, Book[] books) {
        this(id,name,title,department);
        this.books = books; //the book here is shadowing the instance variable at line 8
    }

    public Instructor(long id, String name, String title, String department) {
        this(id,name,title);
        this.department = department;
    }

    public Instructor(long id, String name, String title) {
        this(id,name);
        this.title = title;
    }

    public Instructor(long id, String name) {
        this.id = id;
        this.name = name;
    }
    */


    // Best practices
    // Primary Constructor
        // initialization is in the first constructor.
    public Instructor(long id, String name, String title, String department, Book[] books) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.department = department;
        this.books = books; //the book here is shadowing the instance variable at line 8
    }
    public Instructor(long id, String name, String title, String department) {
        this(id,name,title,department,null); // strings can be set to null
    }

    public Instructor(long id, String name, String title) {
        this(id,name, title,null, null);
    }

    public Instructor(long id, String name) {
        this(id,name,null,null,null);
    }

    public String getMostRecentBookTitle() {
        return books[books.length - 1].getTitle();
    }

    public Book updateBook(int index, String title) {
        Book oldBook = new Book(books[index].getTitle()); // gets the title of the book at the specified index
        books[index].setTitle(title); // you are updating the title here
        return oldBook;

    }

    public Book updateBook(int index, Book book) {
        Book oldBook = books[index];
        books[index] = book;
        return oldBook;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java for Beginners");
        Book book2 = new Book("Scala for Beginners");
        Book book3 = new Book("Effective Python");
        String[] booksTitles = {book1.title,book2.title,book3.title};

        Instructor instructor = new Instructor(101, "John", "Assistant Professor",
                "Computer Science", new Book[]{book1, book2, book3});
        System.out.println("old book title: " + instructor.updateBook(1, "Effective C#").getTitle());

        Book book4 = new Book("Introduction to Data Mining");
        System.out.println("old book title: " + instructor.updateBook(1, book4).getTitle());
        int x = 7;
        int y = ++x;
        y = x--;
        double z = 'a';
        System.out.println("x: " + x + "," + "y: " + y);
        System.out.println(z);
    }
}
