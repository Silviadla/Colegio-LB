
public class Alumno{
    private int idAlumno;
    private String nombre;
    private Materia asignatura;
    /**
     * Constructor for objects of class Materia
     */
    public Alumno(int idAlumno, String nombre){
        this.idAlumno = idAlumno;
        this.nombre = nombre;
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
