import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;    //PreparedStatement cümle hazırla sql hazırla anlamındadır.
        ResultSet resultSet;       //ResultSet sonuçta gelen data için yazılır.
        try {
            connection = helper.getConnection();
            String sql = "delete from city where id = ? ";     // id'si ? olan ı sil demektir
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            int result = statement.executeUpdate(); //çalıştırıldığını gösterir ya 0 ya 1 genelde kullanılmaz
            System.out.println("Kayıt silindi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();  //işimiz bitince bağlantıyı keser
        }
    }


    public static void selectDemo() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement = null;    //Statement ifade cümle cümlecik gibi anlamlandırabiliriz.
        ResultSet resultSet;       //ResultSet sonuçta gelen dataiçin yazılır.
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();  //sorgu bu bağlantıya gidecektir.
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");  //parantez içindeki cümleciği çalıştırır
            ArrayList<Country> countries = new ArrayList<Country>();    //BU ARRAYLIST İ WHİLE DIŞINDA YAZMAYA DİKKAT EDİN AKSİ TAKDİRDE 1 TANE ELEMAN GÖRÜNÜR!!!
            while (resultSet.next()) {           //resultSet.next tek tek gez anlamına gelir
                countries.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }

            System.out.println(countries.size());  //kaç elemandan oluştuğu size

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();  //işimiz bitince bağlantıyı keser
        }
    }

    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;    //PreparedStatement cümle hazırla sql hazırla anlamındadır.
        ResultSet resultSet;       //ResultSet sonuçta gelen dataiçin yazılır.
        try {
            connection = helper.getConnection();
            String sql = "insert into city (Name,CountryCode,District,Population) values(?,?,?,?)";     //? bilinmiyor anlamında kullanıcıdan veri alırız
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce 2");  //1 soru işaretlerinin(?) sırası demektir 1 den başlar
            statement.setString(2,"Tur");
            statement.setString(3,"Turkey");
            statement.setInt(4,70000);

            int result = statement.executeUpdate(); //çalıştırıldığını gösterir ya 0 ya 1 genelde kullanılmaz
            System.out.println("Kayıt eklendi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();  //işimiz bitince bağlantıyı keser
        }
    }

    public void updateData () throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement = null;    //PreparedStatement cümle hazırla sql hazırla anlamındadır.
        ResultSet resultSet;       //ResultSet sonuçta gelen data için yazılır.
        try {
            connection = helper.getConnection();
            String sql = "update city set population = 100000 , district = 'Turkey' where id = ? ";     //nüfus u update eder 4082 deki  //? ile dışarıdan alabiliriz Turkey vs. de
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4082);
            int result = statement.executeUpdate(); //çalıştırıldığını gösterir ya 0 ya 1 genelde kullanılmaz
            System.out.println("Kayıt güncellendi.");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();  //işimiz bitince bağlantıyı keser
        }
    }

}

//time zone hatasının sebebi veri tabanıyla bizim saatimizin uyuşmamasıdır.
// dosya konumumuzda worlden sonra ? dahil devam eden kısım time zone u dikkate almasın diye yazdığımız bir metindir.
//ssl hatası alırsak useSSL=false& ekle = ?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC