import java.util.ArrayList;

class Macaco {

    private String nome;
    private ArrayList<String> bucho = new ArrayList<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void comer(String nome) {
        this.bucho.add(nome);
    }

    public ArrayList<String> verBucho() {
        return this.bucho;
    }

    public void digerir() {
        this.bucho.clear();
    }

}