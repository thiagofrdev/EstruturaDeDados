public class ListaDeReceita {
    private String nomeReceita;
    private String ingredientes;
    private String modoDePreparo;
    private String categoria;
    
    public ListaDeReceita(String nomeReceita, String ingredientes, String modoDePreparo, String categoria) {
        this.nomeReceita = nomeReceita; 
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.categoria = categoria;
    }

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nome) {
        this.nomeReceita = nome;
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