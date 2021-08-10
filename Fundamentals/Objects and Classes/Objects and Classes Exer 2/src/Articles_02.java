import java.util.Scanner;

class Articles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String articlesDate = scanner.nextLine();
        String[] splitDate = articlesDate.split(",");

        String title = splitDate[0];
        String content = splitDate[1];
        String author = splitDate[2];

        Articles_02 articles = new Articles_02(title, content, author);

        int repetition = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < repetition; i++) {

            String command = scanner.nextLine();
            String commandName = command.split(":")[0];
            String commandParameter = command.split(":")[1];

            switch (commandName) {
                case "Edit":
                    articles.edit(commandParameter);
                    break;
                case "ChangeAuthor":
                    articles.changeAuthor(commandParameter);
                    break;
                case "Rename":
                    articles.rename(commandParameter);
                    break;
            }
        }

        System.out.println(articles);
    }
}





public class Articles_02 {

    private String title;
    private String content;
    private String author;

    public Articles_02(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    @Override
    public  String toString(){


        return this.title + " -" + this.content + ":" + this.author;
    }

}
