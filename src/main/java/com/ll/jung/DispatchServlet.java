package com.ll.jung;

import com.ll.jung.article.ArticleController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatchServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Rq rq = new Rq(req, resp);

        ArticleController articleController = new ArticleController();

        switch (rq.getMethod()) {
            case "GET":

                switch (rq.getActionPath()) {
                    case "/usr/article/list":
                        articleController.showList(rq);
                        break;

                    case "/usr/article/delete":

                        break;

                    case "/usr/article/write":

                        break;

                    case  "/usr/article/detail":

                        break;

                    case "/usr/article/modify":

                        break;
                }

                break;

            case "POST":


                break;

        }




    }
}
