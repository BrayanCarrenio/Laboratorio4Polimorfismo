
package programainterfaz;

//3. Crar la clase aplicacion, ProgramaInterfaz 

public class ProgramaInterfaz {

    public static void main(String[] args) {
        //persona
        Persona pavaroti = new Persona(); 
        hacerCantar(pavaroti); 
        //canario
        Canario piolin = new Canario(); 
        hacerCantar(piolin); 
        //burro
        Burro donkey = new Burro();
        hacerCantar(donkey); 
    }
    public static void hacerCantar(PuedeCantar cantor) { 
        cantor.cantar(); 
    } 
    /*5. Explique brevemente como se hace el llamado de la interfaz e implementadoras en la clase aplicación
    R/: La interfaz es una clase abstracta de la que se pueden crear metodos, en este caso creamos uno llamado 
    cantar(),y la heredamos usando 'implements' en las clases padres como lo fueron la clase Persona, la clase 
    Canario y la clase Burro,siendo clases implementadoras estas nos permiten el uso del metodo encontrado en 
    la interfaz y sobreescribirla para despues usarla en una funcion llamada hacercantardonde la invocaremos en 
    los objetos que vayamos a instaciar mediante las clases
    */
}
