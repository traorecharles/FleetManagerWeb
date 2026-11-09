<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion des Missions</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <jsp:include page="/WEB-INF/includes/header.jsp" />
    <h1>Gestion des Missions</h1>

    <!-- Formulaire d'ajout -->
    <form action="${pageContext.request.contextPath}/missions" method="POST" class="row g-3 my-3">
        <div class="col-md-3">
            <input type="text" name="vehicule" class="form-control" placeholder="Véhicule" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="immatriculation" class="form-control" placeholder="Immatriculation" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="employe" class="form-control" placeholder="Employé" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="destination" class="form-control" placeholder="Destination" required>
        </div>
        <div class="col-md-3">
            <input type="date" name="dateDepart" class="form-control" required>
        </div>
        <div class="col-md-3">
            <input type="date" name="dateRetour" class="form-control" required>
        </div>
        <div class="col-md-3">
            <button type="submit" class="btn btn-primary w-100">Créer Mission</button>
        </div>
    </form>

    <!-- Table d'affichage -->
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Véhicule</th>
                <th>Employé</th>
                <th>Destination</th>
                <th>Dates</th>
                <th>Statut</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="m" items="${missions}">
                <tr>
                    <td>${m.id}</td>
                    <td>${m.vehicule} (${m.immatriculation})</td>
                    <td>${m.employe}</td>
                    <td>${m.destination}</td>
                    <td>${m.dateDepart} au ${m.dateRetour}</td>
                    <td>${m.statut}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/missions?action=delete&id=${m.id}" class="btn btn-danger btn-sm">Supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>