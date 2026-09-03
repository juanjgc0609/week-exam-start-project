package com.example.servlets;

import com.example.Application;
import com.example.model.Expedition;
import com.example.service.ExpeditionService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/expeditions")
public class ServletExpeditions extends HttpServlet {
    private ExpeditionService expeditionService;

    @Override
    public void init() {
        expeditionService = Application.getContext().getBean("expeditionService", ExpeditionService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Expediciones registradas</h1>");
        resp.getWriter().println("ul");
        for(Expedition expedition : expeditionService.getExpeditions()){
            resp.getWriter().println("<li>"+ expedition + "</li>");
        }
        resp.getWriter().println("</ul>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String code = req.getParameter("code");
        String region = req.getParameter("region");
        String baseCamp = req.getParameter("baseCamp");
        String leader = req.getParameter("leader");
        String startDate = req.getParameter("startDate");
        String endDate = req.getParameter("endDate");
        String estate = req.getParameter("estate");

        System.out.println("doPost: " + id + " - " + name);

        Expedition expedition = new Expedition(id, name, code,region, baseCamp, leader, startDate, endDate, estate);
        expeditionService.addExpedition(expedition);
        resp.getWriter().println("Expedicion registrada " + expedition);

    }
}
