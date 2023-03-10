import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class FizzBuzzTest {
    @Test
    void TestDevuelveNumeroEnFormatoCadena(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        FizzBuzz prueba2 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(1);
        String cocheAmarillo = prueba2.calculo(2);
        //assert
        assertEquals("1", cocheRojo);
        assertEquals("2", cocheAmarillo);
        System.out.println("Test con 1 y 2 ejecutado correctamente");
    }
    @Test
    void TestCon3(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(3);
        //assert
        assertEquals("fizz", cocheRojo);
        System.out.println("Test con 3 ejecutado correctamente");
    }
}