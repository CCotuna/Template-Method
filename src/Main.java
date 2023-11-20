
public class Main {
    public static void main(String[] args) {
        PaginaWeb homepage = new Homepage();
        homepage.generarePagina();
        System.out.println();

        PaginaWeb aboutUs = new AboutUs();
        aboutUs.generarePagina();
    }
}