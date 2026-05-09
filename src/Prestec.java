import java.time.LocalDate;

/**
 * classe que representa un prestec d'un llibre a un usuari.
 */
public class Prestec {

    private Usuari usuari;
    private Llibre llibre;
    private LocalDate dataPrestec;
    private LocalDate dataRetorn;
    private boolean retornat;

    /**
     * constructor que crea un nou prestec.
     * @param usuari L'usuari que fa el prestec
     * @param llibre El llibre que es presta
     * @param dataPrestec La data en que es fa el prestec
     */
    public Prestec(Usuari usuari, Llibre llibre, LocalDate dataPrestec) {
        this.usuari = usuari;
        this.llibre = llibre;
        this.dataPrestec = dataPrestec;
        this.dataRetorn = dataPrestec.plusWeeks(2);
        this.retornat = false;
    }

    /**
     * retorna l'usuari del prestec.
     * @return usuari
     */
    public Usuari getUsuari() {
        return usuari;
    }

    /**
     * retorna el llibre del prestec.
     * @return llibre
     */
    public Llibre getLlibre() {
        return llibre;
    }

    /**
     * retorna la data en que es va fer el prestec.
     * @return data del prestec
     */
    public LocalDate getDataPrestec() {
        return dataPrestec;
    }

    /**
     * retorna la data límit per tornar el llibre.
     * @return data de retorn
     */
    public LocalDate getDataRetorn() {
        return dataRetorn;
    }

    /**
     * comprova si el llibre ja ha estat retornat.
     * @return true si ha estat retornat, false si no
     */
    public boolean esRetornat() {
        return retornat;
    }

    /**
     * marca el prestec com a retornat.
     */
    public void marcarRetornat() {
        retornat = true;
    }

    /**
     * mostra la informació del prestec.
     * @return string amb la informació del prestec
     */
    @Override
    public String toString() {
        return "Llibre: " + llibre.getTitol() +
               " | Usuari: " + usuari.getNom() +
               " | Data prestec: " + dataPrestec +
               " | Data retorn: " + dataRetorn;
    }
}