public class Materia{
    private long idMateria;
    private String nombreMat;
    /**
     * Constructor for objects of class Materia
     */
    public Materia(long idMateria, String nombreMat){
        this.idMateria = idMateria ;
        this.nombreMat = nombreMat;
    }

    public void setIdMateria (long idNuevoMateria) {
        idNuevoMateria = idMateria;
    }

    public long getIdMateria (){
        return idMateria;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMateria) {
        nombreMateria = nombreMat;
    }
}