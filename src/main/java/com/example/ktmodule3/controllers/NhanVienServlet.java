package com.codegym.demo.controllers;

import com.codegym.demo.dao.NhanVienDAO;
import com.codegym.demo.models.NhanVien;
import com.codegym.demo.models.PhongBan;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(urlPatterns = "/nhanvien")
public class NhanVienServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        PhongBan phongBan = (PhongBan) session.getAttribute("phongban");
        req.setAttribute("phongban", phongBan);
        req.setAttribute("nhanvien", NhanVienDAO.getAll());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/nhanvien/nhanvien.jsp");
        dispatcher.forward(req, resp);
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
        NhanVienDAO.save(new NhanVien(id, tennv, email, address, phone,salary,phongBanName));
        resp.sendRedirect("/nhanvien");
    }
}
