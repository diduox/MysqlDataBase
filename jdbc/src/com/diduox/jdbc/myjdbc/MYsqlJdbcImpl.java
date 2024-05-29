package com.diduox.jdbc.myjdbc;

public class MYsqlJdbcImpl implements jdbcinterface{
    @Override
    public Object getConnection() {
        System.out.println("得到mysql的链接");
        return null;
    }

    @Override
    public void crud() {
        System.out.println("完成Mysql的增删改查");
    }

    @Override
    public void close() {
        System.out.println("关闭mysql的链接");
    }
}
