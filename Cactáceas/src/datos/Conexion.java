package datos;



public class Conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "REPTILES";

    
    public static Connection getConnection() {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }

    public static void close(Resulset rs) {
        try{
                   rs.close();

        }catch (Exception ex) {
            
        }
    }
    public static void close(PreparedStatement stmn){
        stmn.close();
    }
    public static void close(ResultSet rs){
        rs.close();
    }

    
    }

