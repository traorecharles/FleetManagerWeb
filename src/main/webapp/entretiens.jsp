<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion des Entretiens</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <jsp:include page="/WEB-INF/includes/header.jsp" />
    <h1>Maintenance et Entretiens</h1>

    <form action="${pageContext.request.contextPath}/entretiens" method="POST" class="row g-3 my-3">
        <div class="col-md-3">
            <input type="text" name="vehicule" class="form-control" placeholder="Véhicule" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="immatriculation" class="form-control" placeholder="Immatriculation" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="type" class="form-control" placeholder="Type (Vidange, Réparation...)" required>
        </div>
        <div class="col-md-3">
            <input type="text" name="garage" class="form-control" placeholder="Garage" required>
        </div>
        <div class="col-md-3">
            <input type="date" name="dateEntree" class="form-control" required>
        </div>
        <div class="col-md-3">
            <button type="submit" class="btn btn-primary w-100">Programmer</button>
        </div>
    </form>

    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Véhicule</th>
                <th>Type</th>
                <th>Garage</th>
                <th>Date Entrée</th>
                <th>Statut</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="e" items="${entretiens}">
                <tr>
                    <td>${e.id}</td>
                    <td>${e.vehicule} (${e.immatriculation})</td>
                    <td>${e.type}</td>
                    <td>${e.garage}</td>
                    <td>${e.dateEntree}</td>
                    <td>${e.statut}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/entretiens?action=delete&id=${e.id}" class="btn btn-danger btn-sm">Supprimer</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>