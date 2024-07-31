package Assignment_13_Abstraction;
abstract class Document
{
    String name;
    int size;
    Document(String name,int size)
    {
        this.name=name;
        this.size=size;
    }
    abstract String create();
    abstract String save();
    abstract void displayDetails();

    void display()
    {
        System.out.println("File Name      : "+name);
        System.out.println("File Size      : "+size);
    }
}
class PDFDocument extends Document{

    PDFDocument(String format, int size) {
        super(format, size);
    }

    @Override
    String create() {
        return "PDF file is Created.";
    }

    @Override
    String save() {
         return "PDF file saved.";
    }
    void displayDetails()
    {
        super.display();
        System.out.println(create());
        System.out.println(save());
    }

}
class TextDocument extends Document{

    TextDocument(String name, int size) {
        super(name, size);
    }

    @Override
    String create() {
        return "Text Document is Created.";
    }

    @Override
    String save() {
         return "Text Document is saved.";
    }
    void displayDetails()
    {
        super.display();
        System.out.println(create());
        System.out.println(save());
    }
}
class ImageDocument extends Document{

    ImageDocument(String name, int size) {
        super(name, size);
    }

    @Override
    String create() {
        return "Image Document is created.";
    }

    @Override
    String save() {
        return "Image Document is saved.";
    }

    void displayDetails()
    {
        super.display();
        System.out.println(create());
        System.out.println(save());
    }
}

public class DocumentDemo {
    public static void main(String[] args) {
        Document file1=new PDFDocument("Assigment",20);
        file1.displayDetails();
        System.out.println("-----------------------------------------------------------------------------------------");
        Document file2=new TextDocument("personal Details",30);
        file2.displayDetails();
        System.out.println("-----------------------------------------------------------------------------------------");
        Document file3=new ImageDocument("Logo",45);
        file3.displayDetails();
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}
