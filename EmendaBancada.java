import java.util.ArrayList;
import java.util.List;

public class EmendaBancada extends Emenda{
    private List<String> listaParlamentares;
    private List<String> listaPartidos;
    private String ata;
    private String autorSugestao;

    public EmendaBancada(String id, String autor, double valor, int ano, String ata, String autorSugestao){
        super(id, autor, valor, ano);
        this.ata = ata;
        this.autorSugestao = autorSugestao;
        this.listaParlamentares = new ArrayList<>();
        this.listaPartidos = new ArrayList<>();
    }


    //ata
    public String getAta(){
        return ata;
    }
    public void setAta(String ata){
        this.ata = ata;
    }

    //autor
    public String getAutorSugestao(){
        return autorSugestao;
    }
    public void setAutorSugestao(String autorSugestao){
        this.autorSugestao = autorSugestao;
    }

    //parlamentares
    public void listaParlamentares(){
        if (listaParlamentares.isEmpty()){
            System.out.println("Nenhum parlamntar na lista.");
        }else{
            for (String parlamentar : listaParlamentares) {
                System.out.println(parlamentar);
            }
        }
    }

    public void addParlamentar(String parlamentar){
        listaParlamentares.add(parlamentar);
    }
    
    public void removerParlamentar(String parlamentar){
        if (listaParlamentares.contains(parlamentar)) {
            listaParlamentares.remove(parlamentar);
        } else {
            System.out.println("Parlamentar não encontrado na lista.");
        }
    }

    public List<String> getListaParlamentares(){
        return listaParlamentares;
    }

    //partidos
    public void listarPartidos(){
        if (listaPartidos.isEmpty()){
            System.out.println("Nenhum partido na lista.");
        }else{
            for (String partido : listaPartidos) {
                System.out.println(partido);
            }
        }
    }

    public void addPartido(String partido){
        listaPartidos.add(partido);
    }
    
    public void removerPartido(String partido){
        if (listaPartidos.contains(partido)) {
            listaPartidos.remove(partido);
        } else {
            System.out.println("Partido não encontrado na lista.");
        }
    }

    public List<String> getListaPartidos(){
        return listaPartidos;
    }
}
