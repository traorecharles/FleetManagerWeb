package com.miage.fleet.servlet;

import com.miage.fleet.model.Mission;
import com.miage.fleet.service.DatabaseService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/missions")
public class MissionServlet extends HttpServlet {

    private final DatabaseService dbService = new DatabaseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("delete".equals(action)) {
            String id = request.getParameter("id");
            if (id != null) {
                dbService.deleteMission(id);
            }
            response.sendRedirect(request.getContextPath() + "/missions");
            return;
        }

        request.setAttribute("missions", dbService.getAllMissions());
        request.getRequestDispatcher("/missions.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Mission m = new Mission();
        m.setId("MIS-" + System.currentTimeMillis() % 10000);
        m.setVehicule(request.getParameter("vehicule"));
        m.setImmatriculation(request.getParameter("immatriculation"));
        m.setEmploye(request.getParameter("employe"));
        m.setDepartement(request.getParameter("departement"));
        m.setDestination(request.getParameter("destination"));
        m.setMotif(request.getParameter("motif"));
        m.setDateDepart(request.getParameter("dateDepart"));
        m.setDateRetour(request.getParameter("dateRetour"));
        m.setStatut("En cours");

        dbService.addMission(m);
        response.sendRedirect(request.getContextPath() + "/missions");
    }
}