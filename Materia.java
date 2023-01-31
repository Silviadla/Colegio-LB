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
<<<<<<< HEAD
         idMateria = idNuevoMateria ;
=======
        idNuevoMateria = idMateria;
>>>>>>> 6ed1599a59e84d00a595e1772084be2ad88eac43
    }

    public long getIdMateria (){
        return idMateria;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMateria) {
<<<<<<< HEAD
         nombreMat = nombreMateria;
    }

    public void imprimirDetalles(){
        System.out.println("Este es la Id de la Materia: " + idMateria + " y el nombre de la materia: " + nombreMat +".");
=======
        nombreMateria = nombreMat;
>>>>>>> 6ed1599a59e84d00a595e1772084be2ad88eac43
    }
}