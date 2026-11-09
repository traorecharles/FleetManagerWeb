<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>FleetManager Pro - Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <jsp:include page="/WEB-INF/includes/header.jsp" />
    
    <div class="container-fluid">
        <div class="row">
            <jsp:include page="/WEB-INF/includes/sidebar.jsp" />
            
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 py-4">
                <h1 class="h2 mb-4">Tableau de bord</h1>
                
                <div class="row g-3">
                    <div class="col-md-3">
                        <div class="card text-white bg-primary shadow-sm p-3">
                            <div class="card-body">
                                <h5 class="card-title">Véhicules</h5>
                                <p class="card-text fs-2 fw-bold">${totalVehicles}</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card text-white bg-success shadow-sm p-3">
                            <div class="card-body">
                                <h5 class="card-title">Missions</h5>
                                <p class="card-text fs-2 fw-bold">${totalMissions}</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card text-white bg-warning shadow-sm p-3">
                            <div class="card-body">
                                <h5 class="card-title">Entretiens</h5>
                                <p class="card-text fs-2 fw-bold">${totalEntretiens}</p>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="card text-white bg-info shadow-sm p-3">
                            <div class="card-body">
                                <h5 class="card-title">Utilisateurs</h5>
                                <p class="card-text fs-2 fw-bold">${totalUsers}</p>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
    </div>
</body>
</html>