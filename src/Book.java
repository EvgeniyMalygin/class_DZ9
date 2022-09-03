public class Book {
    private String nameBook;
    private String yearOfPublication;
    private Author author;

    public Book (String nameBook, String year, Author author){
        this.nameBook = nameBook;
        this.yearOfPublication = year;
        this.author = author;
    }
    public String getNameBook(){
        return nameBook;
    }
    public String getYearOfPublication(){
        return yearOfPublication;
    }
    public String getAuthor(){
        return author.getFistName() + " " + author.getLastName();
    }
    public void setYearOfPublication (String year){
        this.yearOfPublication = year;
    }

}
