package sinDIP;

public class DesarrolladorBackEnd implements Desarrollador {
    public void usaJava(){
        System.out.println("Usa lenguaje java");
    }

    public void desarrollar() {
        this.usaJava();
    }
}
