package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

/**
 *  Создание таблицы User(ов)
 *  Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в
 *  консоль ( User с именем – name добавлен в базу данных )
 *  Получение всех User из базы и вывод в консоль ( должен быть переопределен toString в классе User)
 *  Очистка таблицы User(ов)
 *  Удаление таблицы
 */
public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("Сергей", "Сергеев", (byte) 33);
        userService.saveUser("Андрей", "Андреев", (byte) 24);
        userService.saveUser("Дмитрий", "Дмитриев", (byte) 42);
        userService.saveUser("Роман", "Романов", (byte) 29);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}