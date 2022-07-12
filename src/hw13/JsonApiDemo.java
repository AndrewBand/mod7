package hw13;

import java.io.IOException;
import java.net.URI;
import java.util.List;

public class JsonApiDemo {

    private static final String POSTS = "https://jsonplaceholder.typicode.com/posts";
    private static final String USERS = "https://jsonplaceholder.typicode.com/users";


    public static void main(String[] args) throws IOException, InterruptedException {
        User defaultUser = new User(1, "defName", "defUserName",
                "def@email", new Address("defStrit", "defSuite", "defCity",
                "defZipcode", new Geo("00.0000", "00.0000")),
                "defPhonenumber","defWeb.site",
                new Company("Romaguera-Crona", "Multi-layered client-server neural-net",
                        "harness real-time e-markets"));
        System.out.println("1.1 создание нового объекта" );
        User createdUser = HttpUtil.putUser(URI.create(USERS), defaultUser);
        System.out.println(createdUser);
        System.out.println("1.2 обновление объекта" );
        User updatedUser = HttpUtil.postUser(URI.create(USERS), defaultUser);
        System.out.println(updatedUser);
        System.out.println("1.3 удаление объекта" );
        HttpUtil.deleteUser(URI.create(USERS), 11);
        System.out.println("1.4 получение информации обо всех пользователях" );
        List<User> allUsers = HttpUtil.getUsers(URI.create(USERS));
        System.out.println(allUsers);
        System.out.println("1.5 получение информации о пользователе с определенным id");
        User userById = HttpUtil.getUserById(URI.create(USERS),110);
        System.out.println(userById);
        System.out.println("1.6 получение информации о пользователе с определенным username" );
        User userName = HttpUtil.getUserByUserName(URI.create(USERS), "Delphine");
        System.out.println(userName);
        System.out.println("2 все комментарии к последнему посту определенного пользователя" );
        HttpUtil.getUserComments(2);
        System.out.println("3 все открытые задачи для пользователя" );
        List<Todo> allTodos = HttpUtil.getUserTodos(URI.create(USERS), 1);
        System.out.println(allTodos);

    }
}
