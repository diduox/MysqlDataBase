package com.diduox.jdbc;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/*
* 这是第一个Jdbc程序，完成简单的操作
* */
public class Jdbc01 {
    public static void main(String[] args) throws SQLException {
    //前置工作：在项目下创建一个文件夹 比如libs
    //将 mysql.jar 拷贝到该目录下，点击add to project .. 加入到该项目

    //1.注册驱动
    Driver driver = new Driver();//创建driver链接
    //2.得到链接 通过jdbc的方式连接mysql
    String url = "jdbc:mysql://localhost:3306/db02";
    //将用户名和密码放入到Properties对象
        Properties properties = new Properties();
        properties.setProperty("user","root");//用户
        properties.setProperty("password","");//密码

        Connection connect = driver.connect(url, properties);
    //3.执行sql
        String sql = "INSERT INTO actor VALUES(null,'王向晚','女','1970-11-11','110')";
        //执行静态的sql语句，并返回执行的结果
        Statement statement = connect.createStatement();
        int i = statement.executeUpdate(sql);//如果是dml语句，返回的就是影响的行数

        System.out.println(i > 0 ? "成功" : "失败");
    //4.关闭链接资源
        statement.close();
        connect.close();
    }
}
