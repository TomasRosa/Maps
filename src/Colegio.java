import java.util.HashMap;


public class Colegio
{
    private String apellido;
    private String nacionalidad;
    HashMap<String,String> hashmapColegio;

    public Colegio ()
    {
        this.hashmapColegio = new HashMap<>();
    }
    public Colegio (String apellido, String nacionalidad)
    {
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.hashmapColegio = new HashMap<>();
    }
    public void addAlumno (String nacionalidad, String apellido)
    {
        this.hashmapColegio.put(apellido,nacionalidad);
    }
    public void showAll ()
    {
        HashMap<String,Integer> nacionalidades = new HashMap<>();
        int contador = 0;

        for(String nacionalidad: this.hashmapColegio.values())
        {
            if(nacionalidades.containsKey(nacionalidad))
            {
                contador = nacionalidades.get(nacionalidad);
                nacionalidades.put(nacionalidad,contador++);
            }
            else
            {
                nacionalidades.put(nacionalidad,1);
            }
        }
        for (Map.Entry<String, Integer> entry : nacionalidades.entrySet()) {
            System.out.println("La nacionalidad " + entry.getKey() + " tiene " + entry.getValue() + " alumnos");
        }
        ///asd
    }
    public void showNacionalidad ()
    {

    }
}
