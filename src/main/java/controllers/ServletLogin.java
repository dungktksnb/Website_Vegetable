package controllers;

import daos.CRUDAccount;
import daos.CRUDProduct;
import models.Account;
import services.ManageAccount;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletLogin", urlPatterns = {"/login"})
public class ServletLogin extends HttpServlet {
    ManageAccount manageAccount=new ManageAccount();
    RequestDispatcher requestDispatcher;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;

        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "signup":
                response.sendRedirect("views/createAccount.jsp");
                break;
            default:
                try {
                    request.setAttribute("listAccount", CRUDAccount.showAccount());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                requestDispatcher = request.getRequestDispatcher("views/login.jsp");
                requestDispatcher.forward(request, response);
//            case "check":
//                String userName = request.getParameter("username");
//                String passWord = request.getParameter("password");
//                boolean check = .checkLogin(userName, passWord);
//                HttpSession session = request.getSession();
//                RequestDispatcher dispatcher;
////
////
//                if (check) {
//                    session.setAttribute("username", userName);
//                    response.sendRedirect("/UserProduct");
//                } else {
//                    if (userName.equals("admin") && passWord.equals("admin1")) {
//                        dispatcher = request.getRequestDispatcher("admin/admin.jsp");
//                    } else {
//                        dispatcher = request.getRequestDispatcher("Product/Login.jsp");
//                        request.setAttribute("msg", "User account or password incorrect! Please re-enter.");
//                    }
//                    dispatcher.forward(request, response);
//                }
//



                break;


        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";

        }
        switch (action) {
            case "createAccount":
                String user=request.getParameter("taikhoan");
                String pass=request.getParameter("matkhau");
                String hoTen=request.getParameter("hoten");
                String gioiTinh=request.getParameter("gioitinh");
                String ngaySinh=request.getParameter("ngaysinh");
                String diaChi=request.getParameter("diachi");
                String email=request.getParameter("email");
                String soDienThoai=request.getParameter("sodienthoai");
                int nhomQuyen= Integer.parseInt(request.getParameter("nhomquyen"));
                Account account=new Account(user,pass,hoTen,gioiTinh,ngaySinh,diaChi,email,soDienThoai,nhomQuyen);
                try {
                    manageAccount.save(account);

                } catch (Exception e) {
                    e.printStackTrace();
                }
                response.sendRedirect("/login");
                break;
            case  "check":
                String userName = request.getParameter("username");
                String passWord = request.getParameter("password");
                boolean check = CRUDAccount.checkLogin(userName,passWord);
                HttpSession session = request.getSession();
                RequestDispatcher dispatcher;
                if (check) {
                    session.setAttribute("username", userName);
                    response.sendRedirect("/home");
                } else {
                    if (userName.equals("admin") && passWord.equals("pass")) {
                        dispatcher = request.getRequestDispatcher("/home");
                    } else {
                        dispatcher = request.getRequestDispatcher("views/login.jsp");
                        request.setAttribute("msg", "User account or password incorrect! Please re-enter.");
                    }
                    dispatcher.forward(request, response);
                }
                break;
//



            default:

        }


    }
}
