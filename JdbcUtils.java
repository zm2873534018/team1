package cn.kgc.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
    new 代码补齐 快捷键 alt+shift+l
    try...catch  代码提示快捷键 alt+shift+Z
*  导包  快捷键  alt+回车
*  多行注释ctrl+shift+/
*/
public class JdbcUtils {
    //1.读取c3p0配置文件
    private  static DataSource ds= new ComboPooledDataSource();
    //2.获取数据源
    public static DataSource getDs(){
        return ds;
    }
    //3.获取连接对象
    public static Connection getConnection(){
        try {
            return  ds.getConnection();
        } catch (SQLException e) {
            throw  new RuntimeException(e);
        }
    }



}
