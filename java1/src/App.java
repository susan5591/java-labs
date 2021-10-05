import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Configuration.DbConfig;
public class App{
    private final static String SELECT_STUDENT_QUERY="select * from student";
    public static void main(String[] args) throws Exception {
        try {
            Statement statement =  DbConfig.getDbConnection().createStatement();
            //execute the sql query and sets the value of the query to the resultset object
            ResultSet resultSet = statement.executeQuery(SELECT_STUDENT_QUERY);

            while(resultSet.next()){

                System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3));

            }
        } catch(SQLException e) {
            System.out.println(e);
            System.out.println("cannot execute the statement");
        }
    }

}


