interface Documents{
    String prepareDocuments();
}
class WordDocument implements Documents{
    @Override
    public String prepareDocuments(){
        return "Word Document created.";
    }
}
class PdfDocument implements Documents{
    @Override
    public String prepareDocuments(){
        return "Pdf Document created.";
    }
}

class ExcelDocument implements Documents{
    @Override
    public String prepareDocuments(){
        return "Excel Document created.";
    }
}
abstract class DocumentFactory{
    abstract Documents createDocument();
}

class WordDocumentFactory extends DocumentFactory{
    public Documents createDocument(){
        return new WordDocument();
    }
}

class PdfDocumentFactory extends DocumentFactory{
    public Documents createDocument(){
        return new PdfDocument();
    }
}
class ExcelDocumentFactory extends DocumentFactory{
    public Documents createDocument(){
        return new ExcelDocument();
    }
}
public class Main {
    public static void main(String[] args) {
        DocumentFactory factory= new WordDocumentFactory();
        Documents document= factory.createDocument();
        System.out.println(document.prepareDocuments());
        factory=new PdfDocumentFactory();
        Documents document1= factory.createDocument();
        System.out.println(document1.prepareDocuments());
        factory=new ExcelDocumentFactory();
        Documents document2= factory.createDocument();
        System.out.println(document2.prepareDocuments());
    }
}