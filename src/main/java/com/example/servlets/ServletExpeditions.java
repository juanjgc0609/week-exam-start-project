package com.example.servlets;

import com.example.Application;
import com.example.service.ExpeditionService;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/expeditions")
public class ServletExpeditions extends HttpServlet {
    private ExpeditionService expeditionService;

    @Override
    public void init() {
        expeditionService = Application.getContext().getBean("expeditionService", ExpeditionService.class);
    }
}
