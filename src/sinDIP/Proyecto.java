package sinDIP;

public class Proyecto {
//    private DesarrolladorBackEnd desarrolladorBackEnd = new DesarrolladorBackEnd();
//    private DesarrolladorFrontEnd desarrolladorFrontEnd = new DesarrolladorFrontEnd();

    public void implementar(Desarrollador desarrollador){
        desarrollador.desarrollar();
    }

    public static void main(String[] args) {
        DesarrolladorBackEnd desarrolladorBackEnd = new DesarrolladorBackEnd();
        DesarrolladorFrontEnd desarrolladorFrontEnd = new DesarrolladorFrontEnd();
        Proyecto proyecto = new Proyecto();

        proyecto.implementar(desarrolladorFrontEnd);
    }
}
