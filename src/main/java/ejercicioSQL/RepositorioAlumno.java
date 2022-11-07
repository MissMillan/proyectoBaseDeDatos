package ejercicioSQL;

import java.util.List;

public interface RepositorioAlumno<T> {

    List<T> listar();

    void guardar(T t);


}
