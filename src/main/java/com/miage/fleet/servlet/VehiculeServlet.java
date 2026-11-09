package com.miage.fleet.servlet;

import com.miage.fleet.model.Vehicle;
import com.miage.fleet.service.DatabaseService;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "VehiculeServlet", urlPatterns = {"/vehicules"})
public class VehiculeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String action = request.getParameter("action");
        DatabaseService db = DatabaseService.getInstance();

        if ("delete".equals(action)) {
            String immatriculation = request.getParameter("id");
            if (immatriculation != null && !immatriculation.trim().isEmpty()) {
                db.deleteVehicle(immatriculation);
            }
            response.sendRedirect(request.getContextPath() + "/vehicules");
            return;
        }

        List<Vehicle> vehicles = db.getAllVehicles();
        request.setAttribute("vehicles", vehicles);
        request.getRequestDispatcher("/vehicules.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        String immatriculation = request.getParameter("immatriculation");
        String marque = request.getParameter("marque");
        String modele = request.getParameter("modele");
        int annee = Integer.parseInt(request.getParameter("annee"));
        String type = request.getParameter("type");
        String statut = request.getParameter("statut");
        int kilometrage = Integer.parseInt(request.getParameter("kilometrage"));

        Vehicle vehicle = new Vehicle(immatriculation, marque, modele, annee, type, statut, kilometrage);
        DatabaseService db = DatabaseService.getInstance();

        if (db.getVehicleByImmatriculation(immatriculation) != null) {
            db.updateVehicle(vehicle);
        } else {
            db.addVehicle(vehicle);
        }

        response.sendRedirect(request.getContextPath() + "/vehicules");
    }
}