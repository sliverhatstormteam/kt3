package com.codegym.demo.controllers;

import com.codegym.demo.dao.NhanVienDAO;
import com.codegym.demo.models.NhanVien;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/editNhanvien")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        NhanVien nhanVien = NhanVienDAO.findById(id);
        req.setAttribute("nhanvien", nhanVien);
        RequestDispatcher dispatcher = req.getRequestDispatcher("/nhanvien/editNhanvien.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String tennv = req.getParameter("tennv");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String phongBanName = req.getParameter("phongBanName");
        double salary = Double.parseDouble(req.getParameter("salary"));
        NhanVienDAO.edit(new NhanVien(id, tennv, email, address, phone,salary,phongBanName));
        resp.sendRedirect("/nhanvien");

    }
}
