package hola;

public class HolaMundo {

  public static void main(String[] args) {
    System.out.println("Hola Mundo");
    nuevosAvisos();
    avisoEmergenciaMaster();
    System.out.println("Es que se me había olvidado");
  }

  public static void nuevosAvisos() {
    System.out.println("Esto lo he metido nuevo en la rama nuevos avisos");
  }

  public static void avisoEmergenciaMaster() {
    System.out.println("Esto es un aviso que he tenido que meter en master de emergencia");
  }  
  
}
