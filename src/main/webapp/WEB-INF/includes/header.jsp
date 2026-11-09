<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-2 shadow">
    <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3 fs-6 fw-bold" href="${pageContext.request.contextPath}/dashboard">
        FleetManager Pro
    </a>
    <div class="navbar-nav w-100 d-flex justify-content-end pe-3">
        <div class="nav-item text-nowrap text-white me-3 d-inline-block">
            <span>👤 ${sessionScope.user.nom} (${sessionScope.user.role})</span>
        </div>
        <div class="nav-item text-nowrap d-inline-block">
            <a class="btn btn-outline-light btn-sm" href="${pageContext.request.contextPath}/logout">Déconnexion</a>
        </div>
    </div>
</header>