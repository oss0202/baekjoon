package exception;

import java.sql.SQLException;

public class UseRuntimeException {
    public static void main(String[] args) {
        UseRuntimeException.update("");
    }
    public static void update(String sql) throws OssException {
        try {
            throw new SQLException();
        }catch (SQLException e){
            throw new OssException("Error 500");
//            throw new OssException(e);
        }
    }
}
