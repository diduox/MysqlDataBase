package com.diduox.jdbc.myjdbc;

public interface jdbcinterface {

    //链接
    public Object getConnection();
    //crud
    public void crud();
    //关闭链接
    public void close();

}
