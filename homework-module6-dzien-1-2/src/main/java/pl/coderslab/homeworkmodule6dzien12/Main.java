package pl.coderslab.homeworkmodule6dzien12;

import pl.coderslab.homeworkmodule6dzien12.entity.Article;
import pl.coderslab.homeworkmodule6dzien12.entity.Author;
import pl.coderslab.homeworkmodule6dzien12.entity.Category;

public class Main {
    public static void main(String[] args) {

        Author autor1 = new Author(0, "Henryk", "Sienkiewicz");
        Author autor2 = new Author(0, "Adam", "Mickiewicz");
        Author autor3 = new Author(0, "Kazimierz", "Przerwa-Tetmajer");
        Author autor4 = new Author(0, "Stanisław", "Lem");

        Category category1 = new Category(0, "Kryminał", null);
        Category category2 = new Category(0, "Komedia", null);
        Category category3 = new Category(0, "Poezja", null);
        Category category4 = new Category(0, "Poradniki", null);

        Article article1 = new Article(0, "Tytuł1", null, null, null, null);
        Article article2 = new Article(0, "Tytuł2", null, null, null, null);
        Article article3 = new Article(0, "Tytuł3", null, null, null, null);
        Article article4 = new Article(0, "Tytuł4", null, null, null, null);
    }
}
