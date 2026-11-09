package com.miage.fleet.servlet;

import com.miage.fleet.model.Entretien;
import com.miage.fleet.service.DatabaseService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/entretiens")
public class EntretienServlet extends HttpServlet {

    private final DatabaseService dbService = new DatabaseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("delete".equals(action)) {
            String id = request.getParameter("id");
            if (id != null) {
                dbService.deleteEntretien(id);
            }
            response.sendRedirect(request.getContextPath() + "/entretiens");
            return;
        }

        request.setAttribute("entretiens", dbService.getAllEntretiens());
        request.getRequestDispatcher("/entretiens.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Entretien e = new Entretien();
        e.setId("ENT-" + System.currentTimeMillis() % 10000);
        e.setVehicule(request.getParameter("vehicule"));
        e.setImmatriculation(request.getParameter("immatriculation"));
        e.setType(request.getParameter("type"));
        e.setGarage(request.getParameter("garage"));
        e.setDateEntree(request.getParameter("dateEntree"));
        e.setStatut("En cours");

        dbService.addEntretien(e);
        response.sendRedirect(request.getContextPath() + "/entretiens");
    }
}