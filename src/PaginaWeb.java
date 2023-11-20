public abstract class PaginaWeb {

    public final void generarePagina() {
        generareAntet();
        generareContinut();
        generareSubsol();
    }

    abstract void generareAntet();
    abstract void generareContinut();
    abstract void generareSubsol();
}
