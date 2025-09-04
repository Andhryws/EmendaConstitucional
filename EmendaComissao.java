import java.util.ArrayList;
import java.util.List;

public class EmendaComissao extends Emenda{
    private List<String> listaParlamentares;
    private String linkComissao;
    private String relatorioAtividades;
    private String autorSugestao;

    public EmendaComissao(String linkComissao, String relatorioAtividades, String autorSugestao, int data, String tipo, String autor, int numero, boolean possuiApoiador, String localidade, String funcao, String subfuncao, String programaOrcamento, String acaoOrcamentaria, String planoOrcamento, String codigo, double valorEmpenhado, double valorLiquidado, double valorPago, double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos, String parlamentar){
        super(data, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao, programaOrcamento, acaoOrcamentaria, planoOrcamento, codigo, valorEmpenhado, valorLiquidado, valorPago, valorRestosInscritos, valorRestosCancelados, valorRestosPagos);
        this.listaParlamentares = new ArrayList<>();
        this.linkComissao = linkComissao;
        this.relatorioAtividades = relatorioAtividades;
        this.autorSugestao = autorSugestao;
    }


    public String getLinkComissao(){
        return linkComissao;
    }
    public void setLinkComissao(String linkComissao){
        this.linkComissao = linkComissao;
    }

    public String getRelatorioAtividades(){
        return relatorioAtividades;
    }

    public void setRelatorioAtividades(String relatorioAtividades){
        this.relatorioAtividades = relatorioAtividades;
    }

    public String getAutorSugestao(){
        return autorSugestao;
    }
    public void setAutorSugestao(String autorSugestao){
        this.autorSugestao = autorSugestao;
    }

    public List<String> getListaParlamentares(){
        return listaParlamentares;
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
}