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
    @Test
    void TestCon4y5(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        FizzBuzz prueba2 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(4);
        String cocheAmarillo = prueba2.calculo(5);
        //assert
        assertEquals("4", cocheRojo);
        assertEquals("buzz", cocheAmarillo);
        System.out.println("Test con 4 y 5 ejecutado correctamente");
    }
    @Test
    void TestCon6(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(6);
        //assert
        assertEquals("fizz", cocheRojo);
        System.out.println("Test con 6 ejecutado correctamente");
    }
    void TestCon78Y9(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        FizzBuzz prueba2 = new FizzBuzz();
        FizzBuzz prueba3 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(7);
        String cocheAmarillo = prueba2.calculo(8);
        String cocheVerde = prueba3.calculo(9);
        //assert
        assertEquals("7", cocheRojo);
        assertEquals("8", cocheAmarillo);
        assertEquals("fizz", cocheVerde);
        System.out.println("Test con 7, 8 y 9 ejecutado correctamente");
    }
    @Test
    void TestCon10(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(10);
        //assert
        assertEquals("buzz", cocheRojo);
        System.out.println("Test con 10 ejecutado correctamente");
    }
    @Test
    void TestCon11Y12Y13Y14(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        FizzBuzz prueba2 = new FizzBuzz();
        FizzBuzz prueba3 = new FizzBuzz();
        FizzBuzz prueba4 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(11);
        String cocheAmarillo = prueba2.calculo(12);
        String cocheVerde = prueba3.calculo(13);
        String cocheGris = prueba4.calculo(14);
        //assert
        assertEquals("11", cocheRojo);
        assertEquals("fizz", cocheAmarillo);
        assertEquals("13", cocheVerde);
        assertEquals("14", cocheGris);
        System.out.println("Test con 10 ejecutado correctamente");
    }
    @Test
    void TestCon15(){
        //arrange (set up)
        FizzBuzz prueba1 = new FizzBuzz();
        //action
        String cocheRojo = prueba1.calculo(15);
        //assert
        assertEquals("fizzbuzz", cocheRojo);
        System.out.println("Test con 15 ejecutado correctamente");
    }
}