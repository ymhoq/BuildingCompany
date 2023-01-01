package ConnectionPool;

import java.sql.Connection;
import java.sql.DriverManager;

public final class MyConn {

    private static MyConn instance;

    public MyConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


    }

    public static MyConn newInstance() {
        if (instance == null)
            new MyConn();
        return instance;
    }

    public static Connection getConnection(String url, String username, String password) {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (Exception e) {

        }

        return null;
    }

}