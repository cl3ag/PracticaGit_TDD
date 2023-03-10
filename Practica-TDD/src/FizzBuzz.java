public class FizzBuzz {
    public String calculo(int numero){
        String fizzbuzz;
        if (numero%3==0){
            fizzbuzz = "fizz";
        } else if (numero%5==0){
            fizzbuzz = "buzz";
        }else {
            String coche = String.valueOf(numero);
            return coche;
        }
        return fizzbuzz;
    }
}
