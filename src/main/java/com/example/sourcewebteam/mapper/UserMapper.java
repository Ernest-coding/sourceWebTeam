package com.example.sourcewebteam.mapper;

import com.example.sourcewebteam.entity.User;
import com.example.sourcewebteam.entity.UserWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Feb 16 20:53:15 CST 2022
     */
    @Delete({
        "delete from user",
        "where Host = #{host,jdbcType=CHAR}",
          "and User = #{user,jdbcType=CHAR}"
    })
    int deleteByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Feb 16 20:53:15 CST 2022
     */
    @Insert({
        "insert into user (Host, User, Select_priv, ",
        "Insert_priv, Update_priv, ",
        "Delete_priv, Create_priv, ",
        "Drop_priv, Reload_priv, ",
        "Shutdown_priv, Process_priv, ",
        "File_priv, Grant_priv, References_priv, ",
        "Index_priv, Alter_priv, ",
        "Show_db_priv, Super_priv, ",
        "Create_tmp_table_priv, Lock_tables_priv, ",
        "Execute_priv, Repl_slave_priv, ",
        "Repl_client_priv, Create_view_priv, ",
        "Show_view_priv, Create_routine_priv, ",
        "Alter_routine_priv, Create_user_priv, ",
        "Event_priv, Trigger_priv, ",
        "Create_tablespace_priv, ssl_type, ",
        "max_questions, max_updates, ",
        "max_connections, max_user_connections, ",
        "plugin, password_expired, ",
        "password_last_changed, password_lifetime, ",
        "account_locked, Create_role_priv, ",
        "Drop_role_priv, Password_reuse_history, ",
        "Password_reuse_time, Password_require_current, ",
        "ssl_cipher, x509_issuer, ",
        "x509_subject, authentication_string, ",
        "User_attributes)",
        "values (#{host,jdbcType=CHAR}, #{user,jdbcType=CHAR}, #{selectPriv,jdbcType=CHAR}, ",
        "#{insertPriv,jdbcType=CHAR}, #{updatePriv,jdbcType=CHAR}, ",
        "#{deletePriv,jdbcType=CHAR}, #{createPriv,jdbcType=CHAR}, ",
        "#{dropPriv,jdbcType=CHAR}, #{reloadPriv,jdbcType=CHAR}, ",
        "#{shutdownPriv,jdbcType=CHAR}, #{processPriv,jdbcType=CHAR}, ",
        "#{filePriv,jdbcType=CHAR}, #{grantPriv,jdbcType=CHAR}, #{referencesPriv,jdbcType=CHAR}, ",
        "#{indexPriv,jdbcType=CHAR}, #{alterPriv,jdbcType=CHAR}, ",
        "#{showDbPriv,jdbcType=CHAR}, #{superPriv,jdbcType=CHAR}, ",
        "#{createTmpTablePriv,jdbcType=CHAR}, #{lockTablesPriv,jdbcType=CHAR}, ",
        "#{executePriv,jdbcType=CHAR}, #{replSlavePriv,jdbcType=CHAR}, ",
        "#{replClientPriv,jdbcType=CHAR}, #{createViewPriv,jdbcType=CHAR}, ",
        "#{showViewPriv,jdbcType=CHAR}, #{createRoutinePriv,jdbcType=CHAR}, ",
        "#{alterRoutinePriv,jdbcType=CHAR}, #{createUserPriv,jdbcType=CHAR}, ",
        "#{eventPriv,jdbcType=CHAR}, #{triggerPriv,jdbcType=CHAR}, ",
        "#{createTablespacePriv,jdbcType=CHAR}, #{sslType,jdbcType=CHAR}, ",
        "#{maxQuestions,jdbcType=INTEGER}, #{maxUpdates,jdbcType=INTEGER}, ",
        "#{maxConnections,jdbcType=INTEGER}, #{maxUserConnections,jdbcType=INTEGER}, ",
        "#{plugin,jdbcType=CHAR}, #{passwordExpired,jdbcType=CHAR}, ",
        "#{passwordLastChanged,jdbcType=TIMESTAMP}, #{passwordLifetime,jdbcType=SMALLINT}, ",
        "#{accountLocked,jdbcType=CHAR}, #{createRolePriv,jdbcType=CHAR}, ",
        "#{dropRolePriv,jdbcType=CHAR}, #{passwordReuseHistory,jdbcType=SMALLINT}, ",
        "#{passwordReuseTime,jdbcType=SMALLINT}, #{passwordRequireCurrent,jdbcType=CHAR}, ",
        "#{sslCipher,jdbcType=LONGVARBINARY}, #{x509Issuer,jdbcType=LONGVARBINARY}, ",
        "#{x509Subject,jdbcType=LONGVARBINARY}, #{authenticationString,jdbcType=LONGVARCHAR}, ",
        "#{userAttributes,jdbcType=LONGVARCHAR})"
    })
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Feb 16 20:53:15 CST 2022
     */
    @Select({
        "select",
        "Host, User, Select_priv, Insert_priv, Update_priv, Delete_priv, Create_priv, ",
        "Drop_priv, Reload_priv, Shutdown_priv, Process_priv, File_priv, Grant_priv, ",
        "References_priv, Index_priv, Alter_priv, Show_db_priv, Super_priv, Create_tmp_table_priv, ",
        "Lock_tables_priv, Execute_priv, Repl_slave_priv, Repl_client_priv, Create_view_priv, ",
        "Show_view_priv, Create_routine_priv, Alter_routine_priv, Create_user_priv, Event_priv, ",
        "Trigger_priv, Create_tablespace_priv, ssl_type, max_questions, max_updates, ",
        "max_connections, max_user_connections, plugin, password_expired, password_last_changed, ",
        "password_lifetime, account_locked, Create_role_priv, Drop_role_priv, Password_reuse_history, ",
        "Password_reuse_time, Password_require_current, ssl_cipher, x509_issuer, x509_subject, ",
        "authentication_string, User_attributes",
        "from user",
        "where Host = #{host,jdbcType=CHAR}",
          "and User = #{user,jdbcType=CHAR}"
    })
    @Results({
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Select_priv", property="selectPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Insert_priv", property="insertPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Update_priv", property="updatePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Delete_priv", property="deletePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_priv", property="createPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_priv", property="dropPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Reload_priv", property="reloadPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Shutdown_priv", property="shutdownPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Process_priv", property="processPriv", jdbcType=JdbcType.CHAR),
        @Result(column="File_priv", property="filePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Grant_priv", property="grantPriv", jdbcType=JdbcType.CHAR),
        @Result(column="References_priv", property="referencesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Index_priv", property="indexPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_priv", property="alterPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_db_priv", property="showDbPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Super_priv", property="superPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tmp_table_priv", property="createTmpTablePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Lock_tables_priv", property="lockTablesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Execute_priv", property="executePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_slave_priv", property="replSlavePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_client_priv", property="replClientPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_view_priv", property="createViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_view_priv", property="showViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_routine_priv", property="createRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_routine_priv", property="alterRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_user_priv", property="createUserPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Event_priv", property="eventPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Trigger_priv", property="triggerPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tablespace_priv", property="createTablespacePriv", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_type", property="sslType", jdbcType=JdbcType.CHAR),
        @Result(column="max_questions", property="maxQuestions", jdbcType=JdbcType.INTEGER),
        @Result(column="max_updates", property="maxUpdates", jdbcType=JdbcType.INTEGER),
        @Result(column="max_connections", property="maxConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="max_user_connections", property="maxUserConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="plugin", property="plugin", jdbcType=JdbcType.CHAR),
        @Result(column="password_expired", property="passwordExpired", jdbcType=JdbcType.CHAR),
        @Result(column="password_last_changed", property="passwordLastChanged", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="password_lifetime", property="passwordLifetime", jdbcType=JdbcType.SMALLINT),
        @Result(column="account_locked", property="accountLocked", jdbcType=JdbcType.CHAR),
        @Result(column="Create_role_priv", property="createRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_role_priv", property="dropRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Password_reuse_history", property="passwordReuseHistory", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_reuse_time", property="passwordReuseTime", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_require_current", property="passwordRequireCurrent", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_cipher", property="sslCipher", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_issuer", property="x509Issuer", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_subject", property="x509Subject", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="authentication_string", property="authenticationString", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="User_attributes", property="userAttributes", jdbcType=JdbcType.LONGVARCHAR)
    })
    UserWithBLOBs selectByPrimaryKey(@Param("host") String host, @Param("user") String user);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Feb 16 20:53:15 CST 2022
     */
    @Select({
        "select",
        "Host, User, Select_priv, Insert_priv, Update_priv, Delete_priv, Create_priv, ",
        "Drop_priv, Reload_priv, Shutdown_priv, Process_priv, File_priv, Grant_priv, ",
        "References_priv, Index_priv, Alter_priv, Show_db_priv, Super_priv, Create_tmp_table_priv, ",
        "Lock_tables_priv, Execute_priv, Repl_slave_priv, Repl_client_priv, Create_view_priv, ",
        "Show_view_priv, Create_routine_priv, Alter_routine_priv, Create_user_priv, Event_priv, ",
        "Trigger_priv, Create_tablespace_priv, ssl_type, max_questions, max_updates, ",
        "max_connections, max_user_connections, plugin, password_expired, password_last_changed, ",
        "password_lifetime, account_locked, Create_role_priv, Drop_role_priv, Password_reuse_history, ",
        "Password_reuse_time, Password_require_current, ssl_cipher, x509_issuer, x509_subject, ",
        "authentication_string, User_attributes",
        "from user",
        "order by id"
    })
    @Results({
        @Result(column="Host", property="host", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="User", property="user", jdbcType=JdbcType.CHAR, id=true),
        @Result(column="Select_priv", property="selectPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Insert_priv", property="insertPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Update_priv", property="updatePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Delete_priv", property="deletePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_priv", property="createPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_priv", property="dropPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Reload_priv", property="reloadPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Shutdown_priv", property="shutdownPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Process_priv", property="processPriv", jdbcType=JdbcType.CHAR),
        @Result(column="File_priv", property="filePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Grant_priv", property="grantPriv", jdbcType=JdbcType.CHAR),
        @Result(column="References_priv", property="referencesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Index_priv", property="indexPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_priv", property="alterPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_db_priv", property="showDbPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Super_priv", property="superPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tmp_table_priv", property="createTmpTablePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Lock_tables_priv", property="lockTablesPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Execute_priv", property="executePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_slave_priv", property="replSlavePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Repl_client_priv", property="replClientPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_view_priv", property="createViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Show_view_priv", property="showViewPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_routine_priv", property="createRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Alter_routine_priv", property="alterRoutinePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_user_priv", property="createUserPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Event_priv", property="eventPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Trigger_priv", property="triggerPriv", jdbcType=JdbcType.CHAR),
        @Result(column="Create_tablespace_priv", property="createTablespacePriv", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_type", property="sslType", jdbcType=JdbcType.CHAR),
        @Result(column="max_questions", property="maxQuestions", jdbcType=JdbcType.INTEGER),
        @Result(column="max_updates", property="maxUpdates", jdbcType=JdbcType.INTEGER),
        @Result(column="max_connections", property="maxConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="max_user_connections", property="maxUserConnections", jdbcType=JdbcType.INTEGER),
        @Result(column="plugin", property="plugin", jdbcType=JdbcType.CHAR),
        @Result(column="password_expired", property="passwordExpired", jdbcType=JdbcType.CHAR),
        @Result(column="password_last_changed", property="passwordLastChanged", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="password_lifetime", property="passwordLifetime", jdbcType=JdbcType.SMALLINT),
        @Result(column="account_locked", property="accountLocked", jdbcType=JdbcType.CHAR),
        @Result(column="Create_role_priv", property="createRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Drop_role_priv", property="dropRolePriv", jdbcType=JdbcType.CHAR),
        @Result(column="Password_reuse_history", property="passwordReuseHistory", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_reuse_time", property="passwordReuseTime", jdbcType=JdbcType.SMALLINT),
        @Result(column="Password_require_current", property="passwordRequireCurrent", jdbcType=JdbcType.CHAR),
        @Result(column="ssl_cipher", property="sslCipher", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_issuer", property="x509Issuer", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="x509_subject", property="x509Subject", jdbcType=JdbcType.LONGVARBINARY),
        @Result(column="authentication_string", property="authenticationString", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="User_attributes", property="userAttributes", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<User> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Wed Feb 16 20:53:15 CST 2022
     */
    @Update({
        "update user",
        "set Select_priv = #{selectPriv,jdbcType=CHAR},",
          "Insert_priv = #{insertPriv,jdbcType=CHAR},",
          "Update_priv = #{updatePriv,jdbcType=CHAR},",
          "Delete_priv = #{deletePriv,jdbcType=CHAR},",
          "Create_priv = #{createPriv,jdbcType=CHAR},",
          "Drop_priv = #{dropPriv,jdbcType=CHAR},",
          "Reload_priv = #{reloadPriv,jdbcType=CHAR},",
          "Shutdown_priv = #{shutdownPriv,jdbcType=CHAR},",
          "Process_priv = #{processPriv,jdbcType=CHAR},",
          "File_priv = #{filePriv,jdbcType=CHAR},",
          "Grant_priv = #{grantPriv,jdbcType=CHAR},",
          "References_priv = #{referencesPriv,jdbcType=CHAR},",
          "Index_priv = #{indexPriv,jdbcType=CHAR},",
          "Alter_priv = #{alterPriv,jdbcType=CHAR},",
          "Show_db_priv = #{showDbPriv,jdbcType=CHAR},",
          "Super_priv = #{superPriv,jdbcType=CHAR},",
          "Create_tmp_table_priv = #{createTmpTablePriv,jdbcType=CHAR},",
          "Lock_tables_priv = #{lockTablesPriv,jdbcType=CHAR},",
          "Execute_priv = #{executePriv,jdbcType=CHAR},",
          "Repl_slave_priv = #{replSlavePriv,jdbcType=CHAR},",
          "Repl_client_priv = #{replClientPriv,jdbcType=CHAR},",
          "Create_view_priv = #{createViewPriv,jdbcType=CHAR},",
          "Show_view_priv = #{showViewPriv,jdbcType=CHAR},",
          "Create_routine_priv = #{createRoutinePriv,jdbcType=CHAR},",
          "Alter_routine_priv = #{alterRoutinePriv,jdbcType=CHAR},",
          "Create_user_priv = #{createUserPriv,jdbcType=CHAR},",
          "Event_priv = #{eventPriv,jdbcType=CHAR},",
          "Trigger_priv = #{triggerPriv,jdbcType=CHAR},",
          "Create_tablespace_priv = #{createTablespacePriv,jdbcType=CHAR},",
          "ssl_type = #{sslType,jdbcType=CHAR},",
          "max_questions = #{maxQuestions,jdbcType=INTEGER},",
          "max_updates = #{maxUpdates,jdbcType=INTEGER},",
          "max_connections = #{maxConnections,jdbcType=INTEGER},",
          "max_user_connections = #{maxUserConnections,jdbcType=INTEGER},",
          "plugin = #{plugin,jdbcType=CHAR},",
          "password_expired = #{passwordExpired,jdbcType=CHAR},",
          "password_last_changed = #{passwordLastChanged,jdbcType=TIMESTAMP},",
          "password_lifetime = #{passwordLifetime,jdbcType=SMALLINT},",
          "account_locked = #{accountLocked,jdbcType=CHAR},",
          "Create_role_priv = #{createRolePriv,jdbcType=CHAR},",
          "Drop_role_priv = #{dropRolePriv,jdbcType=CHAR},",
          "Password_reuse_history = #{passwordReuseHistory,jdbcType=SMALLINT},",
          "Password_reuse_time = #{passwordReuseTime,jdbcType=SMALLINT},",
          "Password_require_current = #{passwordRequireCurrent,jdbcType=CHAR},",
          "ssl_cipher = #{sslCipher,jdbcType=LONGVARBINARY},",
          "x509_issuer = #{x509Issuer,jdbcType=LONGVARBINARY},",
          "x509_subject = #{x509Subject,jdbcType=LONGVARBINARY},",
          "authentication_string = #{authenticationString,jdbcType=LONGVARCHAR},",
          "User_attributes = #{userAttributes,jdbcType=LONGVARCHAR}",
        "where Host = #{host,jdbcType=CHAR}",
          "and User = #{user,jdbcType=CHAR}"
    })
    int updateByPrimaryKey(User record);
}