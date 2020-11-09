package utils.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class ResultExtractorUtils {
    /**
     * Method that returns a null when the database column value is null instead of returning 0 
     * @param result
     * @param idx
     * @return
     * @throws SQLException
     */
    public static Long getLong(ResultSet result, int idx) throws SQLException {
        if (result.getObject(idx) == null)
            return null;
        return result.getLong(idx);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param fieldName
     * @return
     * @throws SQLException
     */
    public static Long getLong(ResultSet result, String fieldName) throws SQLException {
        if (result.getObject(fieldName) == null)
            return null;
        return result.getLong(fieldName);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param idx
     * @return
     * @throws SQLException
     */
    public static Integer getInteger(ResultSet result, int idx) throws SQLException {
        if (result.getObject(idx) == null)
            return null;
        return result.getInt(idx);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param fieldName
     * @return
     * @throws SQLException
     */
    public static Integer getInteger(ResultSet result, String fieldName) throws SQLException {
        if (result.getObject(fieldName) == null)
            return null;
        return result.getInt(fieldName);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param idx
     * @return
     * @throws SQLException
     */
    public static Double getDouble(ResultSet result, int idx) throws SQLException {
        if (result.getObject(idx) == null)
            return null;
        return result.getDouble(idx);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param fieldName
     * @return
     * @throws SQLException
     */
    public static Double getDouble(ResultSet result, String fieldName) throws SQLException {
        if (result.getObject(fieldName) == null)
            return null;
        return result.getDouble(fieldName);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param idx
     * @return
     * @throws SQLException
     */
    public static Float getFloat(ResultSet result, int idx) throws SQLException {
        if (result.getObject(idx) == null)
            return null;
        return result.getFloat(idx);
    }
    /**
     * Method that returns a null when the database column value is null instead of returning 0
     * @param result
     * @param fieldName
     * @return
     * @throws SQLException
     */    
    public static Float getFloat(ResultSet result, String fieldName) throws SQLException {
        if (result.getObject(fieldName) == null)
            return null;
        return result.getFloat(fieldName);
    }
}
