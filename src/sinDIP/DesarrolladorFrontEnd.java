package sinDIP;

public class DesarrolladorFrontEnd implements Desarrollador{
    public void usaJavascript(){
        System.out.println("Usa lenguaje javascript");
    }

    public void desarrollar() {
        this.usaJavascript();
    }
}
