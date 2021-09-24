package com.project;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/servlet" })
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter writer = resp.getWriter();

        String path = req.getContextPath();

        writer.println(
                "<!DOCTYPE html> <html lang='en'> <head> <meta charset='UTF-8' /> <meta http-equiv='X-UA-Compatible' content='IE=edge' /> <meta name='viewport' content='width=device-width, initial-scale=1.0' /> <title>Only Servlet</title> <link rel='shortcut icon' type='image/x-icon' href='https://res.cloudinary.com/practicaldev/image/fetch/s--E8ak4Hr1--/c_limit,f_auto,fl_progressive,q_auto,w_32/https://dev-to.s3.us-east-2.amazonaws.com/favicon.ico'> <link rel='stylesheet' href='"
                        + path
                        + "/css/styles.css' /> </head> <body> <main class='main' id='main'> <div class='exercise'> <a href='"
                        + path + "/servlet'> <div class='exercise__box active'>Only Servlet</div> </a> <a href='" + path
                        + "/jsp'> <div class='exercise__box'>Only JSP</div> </a> <a href='" + path
                        + "/servlet-and-jsp'> <div class='exercise__box'>JSP combined with Servlet</div> </a> </div> <div class='login'> <div class='login__container'> <div class='login__img'> <img src='https://cdn.dribbble.com/users/949981/screenshots/16123153/media/1063bc72b4c7d1b694aeb93e5a300a2f.png?compress=1&resize=1200x900' alt='' /> </div> <div class='login__auth'> <div class='auth'> <div class='auth__logo'> <a href='https://summonz.vercel.app'> <div class='logo'> <div class='logo__moon'></div> <div class='logo__sun'></div> </div> </a> </div> <div class='auth__form'> <div class='form'> <form id='form' action='servlet/post' method='post'> <div class='input'> <input type='text' value='' id='name' name='name' autocomplete='off' placeholder='Fullname' required /> </div> <div class='input'> <input type='text' value='' id='username' name='username' autocomplete='off' placeholder='Username' required /> </div> <div class='input'> <input type='password' value='' id='password' name='password' autocomplete='off' placeholder='Password' required /> </div> <div class='form__control'> <input type='checkbox' required /> <p> I agree to platforms <span> Terms of Service</span> and <span>Privacy Policy</span> </p> </div> <button type='submit' class='form__btn'>Sign Up</button> </form> </div> <div class='student'> <div class='student__box'> <span>19110260 - Phạm Minh Phát</span> </div> <div class='student__box'> <span>19110293 - Nguyễn Đắc Thắng</span> </div> </div> </div> </div> </div> </div> </div> </main> <footer id='footer'>© 2021 Copyright UTE PMP-NDT</footer> </body> </html>");

        writer.close();
    }
}
