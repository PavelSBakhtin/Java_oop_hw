package homework_2;

public class main {
    public static void master(String[] args) {
        human Paul = new human(true, "Павел", "муж", 36);
        System.out.println(Paul);
        System.out.println(Paul.getChildren());
        io data = new io();
        data.save("homework_2/database.txt", Paul);
        System.out.print("Загрузка: ");
        System.out.println(data.load("homework_2/database.txt"));
    }
}
