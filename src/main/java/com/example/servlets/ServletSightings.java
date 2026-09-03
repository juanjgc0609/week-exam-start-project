package com.example.servlets;

import com.example.Application;
import com.example.model.Expedition;
import com.example.model.Sighting;
import com.example.service.ExpeditionService;
import com.example.service.SightingService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/sightings")
public class ServletSightings extends HttpServlet {
    private SightingService sightingService;

    @Override
    public void init() {
        sightingService = Application.getContext().getBean("sightingService", SightingService.class);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h1>Avistamientos registrados</h1>");
        resp.getWriter().println("ul");
        for(Sighting sighting : sightingService.getSightings()){
            resp.getWriter().println("<li>"+ sighting + "</li>");
        }
        resp.getWriter().println("</ul>");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String sightingCode = req.getParameter("code");
        String description = req.getParameter("region");
        String scientificName = req.getParameter("baseCamp");
        String sightedAt = req.getParameter("leader");
        String location = req.getParameter("startDate");
        String quantity = req.getParameter("endDate");
        String confidenceLevel = req.getParameter("estate");
        String expeditionId = req.getParameter("estate");

        System.out.println("doPost: " + id + " - " + name);
        Sighting sighting = new Sighting();
        sighting.setId(id);
        sighting.setName(name);
        sighting.setSightingCode(sightingCode);
        sighting.setDescription(description);
        sighting.setScientificName(scientificName);
        sighting.setSightedAt(sightedAt);
        sighting.setLocation(location);
        sighting.setQuantity(quantity);
        sighting.setConfidenceLevel(confidenceLevel);
        sighting.setExpeditionId(expeditionId);

        sightingService.addSighting(sighting);
        resp.getWriter().println("Avistamiento registrado " + sighting);

    }
}
