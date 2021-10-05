import java.sql.SQLException;

import Configuration.DbConfig;

import java.sql.PreparedStatement;
public class InsertDemo {
    private static final String INSERT_QUERY="insert into student(id,name,address) values(?,?,?)";

    public static void main(String[] args){
        try{
            PreparedStatement preparedStatement = DbConfig.getDbConnection().prepareStatement(INSERT_QUERY);
            preparedStatement.setInt(1,23);
            preparedStatement.setString(2,"abc");
            preparedStatement.setString(3,"dobato");

            int rowsUpdated = preparedStatement.executeUpdate();
            System.out.println("Rows updated after changes in query "+rowsUpdated);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
}
