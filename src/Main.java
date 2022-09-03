public class Main {
    public static void main(String[] args) {
    Author authorFistBook = new Author("Александр", "Пушкин");
    Author authorSecondBook = new Author("Александр", "Грибоедов");
    Book fistBook = new Book("Сборник стихов", "1979", authorFistBook);
    Book secondBook = new Book("Горе от ума", "1823", authorSecondBook);
    System.out.printf("Первая книга \"%s\", автор %s, год издания %s \n", fistBook.getNameBook(), fistBook.getAuthor(), fistBook.getYearOfPublication());
    fistBook.setYearOfPublication("1980");
    System.out.printf("Первая книга \"%s\", автор %s, год издания %s \n", fistBook.getNameBook(), fistBook.getAuthor(), fistBook.getYearOfPublication());
    System.out.printf("Вторая книга \"%s\", автор %s, год издания %s \n", secondBook.getNameBook(), secondBook.getAuthor(), secondBook.getYearOfPublication());
    }
}