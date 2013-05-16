package exemplo.jpa;


import jpa.Categoria;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Calebe de Paula Bianchini
 */
public class CategoriaTest {

    @Test
    public void ConstructorTest() {
        Categoria obj = new Categoria("teste");
        assertEquals("teste", obj.getNome());
    }
}
