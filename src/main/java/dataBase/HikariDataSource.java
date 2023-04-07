package dataBase;

import com.zaxxer.hikari.HikariConfig;

import java.sql.Connection;
import java.sql.SQLException;

public class HikariDataSource {
    private static final HikariConfig config= new HikariConfig();
    private static HikariDataSource hikariDataSource;
    static {
        config.setJdbcUrl("jdbc:postgresql://localhost:5432/maktab92");
        config.setUsername("postgres");
        config.setPassword("123");
        config.addDataSourceProperty( "cachePrepStmts" , "true" );
        config.addDataSourceProperty( "prepStmtCacheSize" , "250" );
        config.addDataSourceProperty( "prepStmtCacheSqlLimit" , "2048" );
        hikariDataSource=new HikariDataSource(config);
    }

    public HikariDataSource(HikariConfig config) {
    }

    public static Connection getConnection()throws SQLException {
        return hikariDataSource.getConnection();
    }

}
/*
private static HikariConfig config = new HikariConfig();
private static HikariDataSource ds;
static {
config.setJdbcUrl("jdbc:postgresql://localhost:5432/hw8q1");
config.setUsername("postgres");
config.setPassword("123456");
config.addDataSourceProperty("cachePrepStmts", "true");
config.addDataSourceProperty("prepStmtCacheSize", "250");
config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");
ds = new HikariDataSource(config);
}
private DataSource() {
}
public static Connection getConnection() throws SQLException {
return ds.getConnection();
}
 */
