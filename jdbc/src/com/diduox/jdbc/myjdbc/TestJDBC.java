package com.diduox.jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args) {
        //完成对mysql的操作
        jdbcinterface jdbcinterface = new MYsqlJdbcImpl();
        jdbcinterface.getConnection();//通过接口来调用实现类
        jdbcinterface.crud();
        jdbcinterface.close();
    }
}
