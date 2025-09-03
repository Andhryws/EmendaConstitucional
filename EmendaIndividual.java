public class EmendaIndividual extends Emenda{
    private String tipoTransferencia;
    private String projeto;
    private String licitacao;

    public EmendaIndividual(String tipoTransferencia, int data, String tipo, String autor, int numero, boolean possuiApoiador, String localidade, String funcao, String subfuncao, String programaOrcamento, String acaoOrcamentaria, String planoOrcamento, String codigo, double valorEmpenhado, double valorLiquidado, double valorPago, double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos, String projeto, String licitacao){
        super(data, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao, programaOrcamento, acaoOrcamentaria, planoOrcamento, codigo, valorEmpenhado, valorLiquidado, valorPago, valorRestosInscritos, valorRestosCancelados, valorRestosPagos);
        this.projeto = projeto;
        this.licitacao = licitacao;
        this.tipoTransferencia = tipoTransferencia;
    }

    // Getters e Setters
    public String getTipoTransferenciaString(){
        return tipoTransferencia;
    }
    public void setTipoTransferencia(String tipoTransferencia){
        this.tipoTransferencia = tipoTransferencia;
    }

    public String getProjeto(){
        return projeto;
    }
    public void setProjeto(String projeto){
        this.projeto = projeto;
    }

    public String getLicitacao(){
        return licitacao;
    }
    public void setLicitacao(String licitacao){
        this.licitacao = licitacao;
    }
}
