package com.miage.fleet.servlet;

import com.miage.fleet.service.DatabaseService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DashboardServlet", urlPatterns = {"/dashboard"})
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        DatabaseService db = DatabaseService.getInstance();
        
        List<?> vehicles = (List<?>) db.getAllVehicles();
        List<?> missions = (List<?>) db.getAllMissions();
        List<?> entretiens = (List<?>) db.getAllEntretiens();
        List<?> users = (List<?>) db.getAllUsers();
        
        request.setAttribute("totalVehicles", vehicles != null ? vehicles.size() : 0);
        request.setAttribute("totalMissions", missions != null ? missions.size() : 0);
        request.setAttribute("totalEntretiens", entretiens != null ? entretiens.size() : 0);
        request.setAttribute("totalUsers", users != null ? users.size() : 0);

        request.getRequestDispatcher("/dashboard.jsp").forward(request, response);
    }
}