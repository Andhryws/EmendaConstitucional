import java.util.ArrayList;
import java.util.List;

public class EmendaBancada extends Emenda{
    private List<String> listaParlamentares;
    private String ata;
    private String autorSugestao;

    public EmendaBancada(String ata, String autorSugestao, int data, String tipo, String autor, int numero, boolean possuiApoiador, String localidade, String funcao, String subfuncao, String programaOrcamento, String acaoOrcamentaria, String planoOrcamento, String codigo, double valorEmpenhado, double valorLiquidado, double valorPago, double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos){
        super(data, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao, programaOrcamento, acaoOrcamentaria, planoOrcamento, codigo, valorEmpenhado, valorLiquidado, valorPago, valorRestosInscritos, valorRestosCancelados, valorRestosPagos);
        this.ata = ata;
        this.autorSugestao = autorSugestao;
        this.listaParlamentares = new ArrayList<>();
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
}
