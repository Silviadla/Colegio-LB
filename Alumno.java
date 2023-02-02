
public class Alumno{
    private int idAlumno;
    private String nombre;
    private Materia asignatura;
    /**
     * Constructor for objects of class Materia
     */
    public Alumno(int idAlumno, String nombre, Materia asignatura){
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.asignatura = asignatura;
    }

    public void setIdAlumno (int idAlumnoNuevo) {
        idAlumno = idAlumnoNuevo ;
    }
    
    public int getIdAlumno (){
        return idAlumno;
    }

    public void setNombre (String NombreNuevo) {
        nombre = NombreNuevo;
    }
    
    public String getNombre (){
        return nombre;
    }

    public void setAsignatura (Materia asignaturaNueva) {
        asignatura = asignaturaNueva;
    }
    
    public Materia getAsignatura (){
        return asignatura;
    }

    public void imprimirDetalles(){
        System.out.println("Esta es la Id del Alumno: " + idAlumno);
        System.out.println("Este es el nombre del alumno: " + nombre );
        System.out.println("Esta es la Id de la Asignatura: " + asignatura.getIdMateria() );
        System.out.println("Este es el nombre de la asignatura: " + asignatura.getNombreMat()+".");
    }
}
