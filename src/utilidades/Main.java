package utilidades;

public class Main {
public static void main(String[] args) {

         
CuentaBancaria cuenta = new CuentaBancaria(); 

 // ================================
        // EJERCICIO 1: Uso de atributos
        // ================================
        // 1. Intenta acceder directamente al atributo saldo:
        //    System.out.println(cuenta.saldo);
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
   
    


System.out.println(cuenta.getSaldo());


   // ================================
        // EJERCICIO 2: Métodos públicos
        // ================================
        // 1. Ingresa 100€ usando depositar().
        // 2. Retira 30€ usando retirar().
        // 3. Imprime el saldo con getSaldo().



 cuenta.depositar(100);

cuenta.retirar(30 );
cuenta.getSaldo();



        // EJERCICIO 3: Métodos privados
        // ================================
        // 1. Intenta llamar al método registrarOperacion("Hackeo", 9999).
        // 2. Observa el error de compilación.

        // Tu código aquí ↓
        
//cuenta.registrarOperacion("Hackeo", 9999);

 // Es privado, por eso no funciona




        // ================================
        // EJERCICIO 4: Libre
        // ================================
        // Puedes hacer pruebas adicionales con los métodos disponibles
        // para asegurarte de que comprendes la diferencia entre public y private.


System.out.println("Saldo después de operaciones: " + cuenta.getSaldo());

}
}


// ================================
// RESPUESTAS DE REFLEXIÓN
// ================================
// Ejercicio 1: ¿por qué no puedo acceder al saldo directamente?
// Respuesta:  Porque el saldo está marcado como private. Eso significa que solo se puede usar dentro de la clase. Así se protege para que nadie lo cambie sin control.

// Ejercicio 2: ¿por qué sí puedo usar los métodos depositar(), retirar() y getSaldo()?
// Respuesta:  Porque esos métodos son public, o sea, están abiertos para que los puedas usar desde fuera de la clase. Son como puertas seguras para trabajar con el saldo.

// Ejercicio 3: ¿qué significa el error al intentar llamar a registrarOperacion()?
// Respuesta:  El error aparece porque ese método es private. Solo se puede usar dentro de la clase, no desde fuera. Es como una herramienta interna que no se presta.
// - ¿Qué pasaría si saldo fuera public?
// - ¿Por qué registrarOperacion es private en lugar de public?
// Respuesta:  