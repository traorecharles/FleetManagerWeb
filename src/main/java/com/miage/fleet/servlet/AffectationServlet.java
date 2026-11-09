package com.miage.fleet.servlet;

import com.miage.fleet.model.Affectation;
import com.miage.fleet.service.DatabaseService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/affectations")
public class AffectationServlet extends HttpServlet {

    private final DatabaseService dbService = new DatabaseService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String action = request.getParameter("action");
        
        if ("delete".equals(action)) {
            String id = request.getParameter("id");
            if (id != null) {
                dbService.deleteAffectation(id);
            }
            response.sendRedirect(request.getContextPath() + "/affectations");
            return;
        }

        request.setAttribute("affectations", dbService.getAllAffectations());
        request.getRequestDispatcher("/affectations.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        Affectation a = new Affectation();
        a.setId("AFF-" + System.currentTimeMillis() % 10000);
        a.setVehicule(request.getParameter("vehicule"));
        a.setImmatriculation(request.getParameter("immatriculation"));
        a.setEmploye(request.getParameter("employe"));
        a.setDepartement(request.getParameter("departement"));
        a.setDateDebut(request.getParameter("dateDebut"));
        a.setDateFin(request.getParameter("dateFin"));
        a.setStatut("Active");

        dbService.addAffectation(a);
        response.sendRedirect(request.getContextPath() + "/affectations");
    }
}