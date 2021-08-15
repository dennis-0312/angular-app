package pe.com.dennis.data;

import java.util.List;
import pe.com.dennis.domain.Persona;


public interface PersonaDao {
    public List<Persona> encontrarTodasPersonas();
    public Persona encontrarPersona(Persona persona);
    public void insertarPersona(Persona persona);
    public void actualizarPersona(Persona persona);
    public void eliminarPersona(Persona persona);
    
    
}
