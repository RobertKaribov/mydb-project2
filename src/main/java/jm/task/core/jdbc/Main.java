package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserDao userDao = new UserDaoJDBCImpl(new Util());
        userDao.createUsersTable();
        userDao.saveUser("Андрей", "Андреев", (byte) 34);
        userDao.saveUser("Дмитрий", "Дмитриев", (byte) 22);
        userDao.saveUser("Сергей", "Сергеев", (byte) 39);
        userDao.saveUser("Роман", "Романов", (byte) 29);
        userDao.removeUserById(4);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}

