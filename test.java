
public class Main {
    public static void main(String[] args) {
        // Создаем массив книг с различными конструкторами
        Book[] books = {
                new Book("Java Programming", 49.99, true),
                new Book("Data Structures", 19.99),
                new Book("Algorithms", 39.99, true),
                new Book("Introduction to Java", 25.00),
                new Book("Advanced Java", 45.50, true)
        };

        // Выводим информацию о книгах
        for (Book book : books) {
            book.displayInfo();
            System.out.println();
        }

        // Подсчитываем общую стоимость книг
        double totalPrice = Book.calculateTotalPrice(books);
        System.out.println("Total Price: $" + totalPrice);

        // Подсчитываем количество книг с иллюстрациями
        int booksWithIllustrations = Book.countBooksWithIllustrations(books);
        System.out.println("Number of Books with Illustrations: " + booksWithIllustrations);
    }
}

