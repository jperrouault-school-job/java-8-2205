module fr.formation.service {
    requires transitive fr.formation.base;

    provides    fr.formation.service.ifaces.IProduitService
    with        fr.formation.service.ProduitServiceV2;
}
