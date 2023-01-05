package com.codegym.demo.dao;

import com.codegym.demo.models.NhanVien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanVienDAO {
    static Connection connection = ConnectionMySql.getConnection();

    public static List<NhanVien> getAll() {
        List<NhanVien> nhanViens = new ArrayList<>();
        String sql = "Select * from nhanvien";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String tennv = resultSet.getString("tennv");
                String email = resultSet.getString("email");
                String address = resultSet.getString("address");
                String phone = resultSet.getString("phone");
                double salary = resultSet.getDouble("salary");
                String phongBanName = resultSet.getString("phongBanName");

                nhanViens.add(new NhanVien(id, tennv, email, address, phone,salary,phongBanName));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return nhanViens;
    }

    public static boolean save(NhanVien nhanVien) {
        String sql = "insert into nhanvien(tennv, email, address, phone,salary,phongBanName) values (?,?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setInt(1, nhanVien.getId());
            preparedStatement.setString(1, nhanVien.getTennv());
            preparedStatement.setString(2, nhanVien.getEmail());
            preparedStatement.setString(3, nhanVien.getAddress());
            preparedStatement.setString(4, nhanVien.getPhone());
            preparedStatement.setDouble(5, nhanVien.getSalary());
            preparedStatement.setString(6, nhanVien.getPhongBanName());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean edit(NhanVien nhanVien) {
        String sql = "update nhanvien set tennv=?, email=?, address=?, phone=?,salary=?,phongBanName=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(7, nhanVien.getId());
            preparedStatement.setString(1, nhanVien.getTennv());
            preparedStatement.setString(2, nhanVien.getEmail());
            preparedStatement.setString(3, nhanVien.getAddress());
            preparedStatement.setString(4, nhanVien.getPhone());
            preparedStatement.setDouble(5, nhanVien.getSalary());
            preparedStatement.setString(6, nhanVien.getPhongBanName());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static NhanVien findById(int id){
        String sql = "select * from nhanvien where id = "+ id;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            resultSet.next();

            String tennv = resultSet.getString("tennv");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            String phone = resultSet.getString("phone");
            double salary = resultSet.getDouble("salary");
            String phongBanName = resultSet.getString("phongBanName");


            return new NhanVien(id, tennv, email, address, phone,salary,phongBanName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void delete(int id){
        String sql ="delete from nhanvien where id = "+id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(sql);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
