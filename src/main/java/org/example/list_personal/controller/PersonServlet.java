package org.example.list_personal.controller;

import org.example.list_personal.model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@WebServlet (name = "PersonServlet", urlPatterns = "/person")
public class PersonServlet extends HttpServlet {
    private static List<Person> personList;
    static {
        personList = new ArrayList<>();
        personList.add(new Person("nhon", LocalDate.parse("1998-09-10"),"dai nghia - dai loc - quang nam", ""));
        personList.add(new Person("vi", LocalDate.parse("1988-09-10"),"dai nghia - dai loc - quang nam", ""));
        personList.add(new Person("huy", LocalDate.parse("2009-03-08"),"dai nghia - dai loc - quang nam", ""));
        personList.add(new Person("tuyen", LocalDate.parse("1998-05-04"),"dai nghia - dai loc - quang nam", ""));
        personList.add(new Person("dat", LocalDate.parse("1998-05-12"),"dai nghia - dai loc - quang nam", ""));
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("personList" , personList);
        req.getRequestDispatcher("/person/list.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

}
