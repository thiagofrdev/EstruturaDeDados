public class ListaDeReceitas {
    private String ingredientes;
    private String modoDePreparo;
    private String categoria;
    
    public ListaDeReceitas(String ingredientes, String modoDePreparo, String categoria) {
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.categoria = categoria;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoDePreparo() {
        return modoDePreparo;
    }

    public void setModoDePreparo(String modoDePreparo) {
        this.modoDePreparo = modoDePreparo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}