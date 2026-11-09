<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<nav id="sidebarMenu" class="col-md-3 col-lg-2 d-md-block bg-light sidebar collapse py-3 border-end min-vh-100">
    <div class="position-sticky">
        <ul class="nav flex-column nav-pills">
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/dashboard">📊 Tableau de bord</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/vehicules">🚗 Véhicules</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/missions">🗺️ Missions</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/affectations">📋 Affectations</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/entretiens">🔧 Entretiens</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/documents">📁 Documents</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/statistiques">📈 Statistiques</a></li>
            <li class="nav-item"><a class="nav-link text-dark" href="${pageContext.request.contextPath}/administration">⚙️ Administration</a></li>
        </ul>
    </div>
</nav>