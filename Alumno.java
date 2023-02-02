
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

    public int getIdAlumno (){
        return idAlumno;
    }

    public String getNombre (){
        return nombre;
    }

    public Materia getAsignatura (){
        return asignatura;
    }
}
