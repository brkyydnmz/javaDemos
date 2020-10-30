import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    private String userName="root";
    private String password="12345";
    private String dbUrl="jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";  //serverda 3306 portudur serverın world veri tabanımız bizim

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);  //DriverManager bu driverlara erişimi sağlar
    }

    public void showErrorMessage(SQLException exception){
        System.out.println("Error : " + exception.getMessage());
        System.out.println("Error code : " + exception.getErrorCode());
    }

}
