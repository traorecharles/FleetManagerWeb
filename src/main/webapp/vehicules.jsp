<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>FleetManager Pro - Véhicules</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
    <jsp:include page="/WEB-INF/includes/header.jsp" />
    
    <div class="container-fluid">
        <div class="row">
            <jsp:include page="/WEB-INF/includes/sidebar.jsp" />
            
            <main class="col-md-9 ms-sm-auto col-lg-10 px-md-4 py-4">
                <div class="d-flex justify-content-between align-items-center mb-4">
                    <h2>Gestion des Véhicules</h2>
                    <button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#vehicleModal" onclick="clearForm()">
                        + Ajouter un véhicule
                    </button>
                </div>

                <div class="table-responsive shadow-sm bg-white rounded">
                    <table class="table table-hover align-middle mb-0">
                        <thead class="table-light">
                            <tr>
                                <th>Immatriculation</th>
                                <th>Marque / Modèle</th>
                                <th>Type</th>
                                <th>Année</th>
                                <th>Kilométrage</th>
                                <th>Statut</th>
                                <th>Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="v" items="${vehicles}">
                                <tr>
                                    <td class="fw-bold">${v.immatriculation}</td>
                                    <td>${v.marque} ${v.modele}</td>
                                    <td>${v.type}</td>
                                    <td>${v.annee}</td>
                                    <td>${v.kilometrage} km</td>
                                    <td>
                                        <span class="badge ${v.statut == 'DISPONIBLE' ? 'bg-success' : (v.statut == 'EN_MISSION' ? 'bg-primary' : 'bg-warning')}">
                                            ${v.statut}
                                        </span>
                                    </td>
                                    <td>
                                        <button class="btn btn-sm btn-outline-secondary" 
                                                onclick="editVehicle('${v.immatriculation}', '${v.marque}', '${v.modele}', ${v.annee}, '${v.type}', '${v.statut}', ${v.kilometrage})">
                                            Éditer
                                        </button>
                                        <a href="${pageContext.request.contextPath}/vehicules?action=delete&id=${v.immatriculation}" 
                                           class="btn btn-sm btn-outline-danger" 
                                           onclick="return confirm('Supprimer ce véhicule ?');">
                                            Supprimer
                                        </a>
                                    </td>
                                </tr>
                            </c:forEach>
                            <c:if test="${empty vehicles}">
                                <tr>
                                    <td colspan="7" class="text-center py-4 text-muted">Aucun véhicule enregistré.</td>
                                </tr>
                            </c:if>
                        </tbody>
                    </table>
                </div>
            </main>
        </div>
    </div>

    <!-- Modal Formulaire -->
    <div class="modal fade" id="vehicleModal" tabindex="-1">
        <div class="modal-dialog">
            <div class="modal-content">
                <form action="${pageContext.request.contextPath}/vehicules" method="post">
                    <div class="modal-header">
                        <h5 class="modal-title" id="modalTitle">Nouveau Véhicule</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                    </div>
                    <div class="modal-body">
                        <div class="mb-3">
                            <label class="form-label">Immatriculation</label>
                            <input type="text" id="immatriculation" name="immatriculation" class="form-control" required>
                        </div>
                        <div class="row">
                            <div class="col mb-3">
                                <label class="form-label">Marque</label>
                                <input type="text" id="marque" name="marque" class="form-control" required>
                            </div>
                            <div class="col mb-3">
                                <label class="form-label">Modèle</label>
                                <input type="text" id="modele" name="modele" class="form-control" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col mb-3">
                                <label class="form-label">Année</label>
                                <input type="number" id="annee" name="annee" class="form-control" required>
                            </div>
                            <div class="col mb-3">
                                <label class="form-label">Kilométrage</label>
                                <input type="number" id="kilometrage" name="kilometrage" class="form-control" required>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col mb-3">
                                <label class="form-label">Type</label>
                                <select id="type" name="type" class="form-select">
                                    <option value="Berline">Berline</option>
                                    <option value="SUV">SUV</option>
                                    <option value="Utilitaire">Utilitaire</option>
                                </select>
                            </div>
                            <div class="col mb-3">
                                <label class="form-label">Statut</label>
                                <select id="statut" name="statut" class="form-select">
                                    <option value="DISPONIBLE">DISPONIBLE</option>
                                    <option value="EN_MISSION">EN_MISSION</option>
                                    <option value="EN_MAINTENANCE">EN_MAINTENANCE</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Annuler</button>
                        <button type="submit" class="btn btn-primary">Enregistrer</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

    <script>
        function clearForm() {
            document.getElementById('modalTitle').innerText = 'Nouveau Véhicule';
            document.getElementById('immatriculation').value = '';
            document.getElementById('immatriculation').removeAttribute('readonly');
            document.getElementById('marque').value = '';
            document.getElementById('modele').value = '';
            document.getElementById('annee').value = new Date().getFullYear();
            document.getElementById('kilometrage').value = '0';
        }

        function editVehicle(immat, marque, modele, annee, type, statut, km) {
            document.getElementById('modalTitle').innerText = 'Modifier le Véhicule';
            document.getElementById('immatriculation').value = immat;
            document.getElementById('immatriculation').setAttribute('readonly', 'readonly');
            document.getElementById('marque').value = marque;
            document.getElementById('modele').value = modele;
            document.getElementById('annee').value = annee;
            document.getElementById('type').value = type;
            document.getElementById('statut').value = statut;
            document.getElementById('kilometrage').value = km;
            new bootstrap.Modal(document.getElementById('vehicleModal')).show();
        }
    </script>
</body>
</html>