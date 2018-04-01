package seminarioDisenio;
import org.junit.*;

public class PantalonTest {

	Pantalon pantalon = new Pantalon("hola",28);
	
	@Test
	public void deberiaSerHola() {
	 /*Pantalon pantalon = new Pantalon("hola",28);*/  
		Assert.assertEquals("hola",pantalon.getNombrePantalon());
	 }
	
	@Test
	public void elTalleEs28() {
		Assert.assertTrue(pantalon.getTalle() == 28);
	}
	
	
	
	
	
}
