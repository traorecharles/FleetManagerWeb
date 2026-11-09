<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html>
<head>
    <title>Gestion des Affectations</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
    <jsp:include page="/WEB-INF/includes/header.jsp" />
    <h1>Gestion des Affectations</h1>

    <form action="${pageContext.request.contextPath}/affectations" method="POST" class="row g-3 my-3">
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
            <input type="date" name="dateDebut" class="form-control" required>
        </div>
        <div class="col-md-3">
            <button type="submit" class="btn btn-primary w-100">Affecter</button>
        </div>
    </form>

    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>ID</th>
                <th>Véhicule</th>
                <th>Employé</th>
                <th>Date Début</th>
                <th>Statut</th>
                <th>Action</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="a" items="${affectations}">
                <tr>
                    <td>${a.id}</td>
                    <td>${a.vehicule} (${a.immatriculation})</td>
                    <td>${a.employe}</td>
                    <td>${a.dateDebut}</td>
                    <td>${a.statut}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/affectations?action=delete&id=${a.id}" class="btn btn-danger btn-sm">Terminer</a>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>