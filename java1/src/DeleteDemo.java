import java.sql.PreparedStatement;
import java.sql.SQLException;
import Configuration.DbConfig;

public class DeleteDemo {
    private static final String DELETE_QUERY = "delete from student where id=?";

    public static void main(String[] args){
        try{
            PreparedStatement preparedStatement = DbConfig.getDbConnection().prepareStatement(DELETE_QUERY);
            preparedStatement.setInt(1,2);
            int rowsAffected= preparedStatement.executeUpdate();
            if(rowsAffected>0){
                System.out.println(rowsAffected + " data deleted successfully" );
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
