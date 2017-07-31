package com.acehouhao;

import java.io.Serializable;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hao HOU on 2017/7/29.
 */
public class GuestBookBean implements Serializable {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/demo?useSSL=false&serverTimezone=UTC";
    private String username = "root";
    private String password = "root";

    public GuestBookBean() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void setMessage(Message message) {
        Connection conn = null;
        PreparedStatement statement = null;
        SQLException ex = null;
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            String sql = "INSERT INTO t_message(name, email, msg) VALUES (?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, message.getName());
            statement.setString(2, message.getEmail());
            statement.setString(3, message.getMsg());
            statement.executeUpdate();
        } catch (SQLException e) {
            ex = e;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    if (ex == null) {
                        ex = e;
                    }
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    if (ex == null) {
                        ex = e;
                    }
                }
            }
            if (ex != null) {
                throw new RuntimeException(ex);
            }
        }
    }

    public List<Message> getMessages() {
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        SQLException ex = null;
        List<Message> messages = null;

        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            statement = conn.createStatement();
            String sql = "SELECT * FROM t_message";
            resultSet = statement.executeQuery(sql);
            messages = new ArrayList<>();
            while (resultSet.next()) {
                Message message = new Message();
                message.setId(resultSet.getLong(1));;
                message.setName(resultSet.getString(2));
                message.setEmail(resultSet.getString(3));
                message.setMsg(resultSet.getString(4));
                messages.add(message);
            }
        } catch (SQLException e) {
            ex = e;
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    if (ex == null) {
                        ex = e;
                    }
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    if (ex == null) {
                        ex = e;
                    }
                }
            }
            if (ex != null) {
                throw new RuntimeException(ex);
            }
        }
        return messages;
    }
}
