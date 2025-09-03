public class EmendaRelator extends Emenda{
    private String autorSugestao;
    private String nomeRelator;
    private String beneficiarioFinal;

    public EmendaRelator(String autorSugestao, String nomeRelator, String beneficiarioFinal, int data, String tipo, String autor, int numero, boolean possuiApoiador, String localidade, String funcao, String subfuncao, String programaOrcamento, String acaoOrcamentaria, String planoOrcamento, String codigo, double valorEmpenhado, double valorLiquidado, double valorPago, double valorRestosInscritos, double valorRestosCancelados, double valorRestosPagos){
        super(data, tipo, autor, numero, possuiApoiador, localidade, funcao, subfuncao, programaOrcamento, acaoOrcamentaria, planoOrcamento, codigo, valorEmpenhado, valorLiquidado, valorPago, valorRestosInscritos, valorRestosCancelados, valorRestosPagos);
        this.autorSugestao = autorSugestao;
        this.nomeRelator = nomeRelator;
        this.beneficiarioFinal = beneficiarioFinal;
    }

    public String getAutorSugestao(){
        return autorSugestao;
    }
    public void setAutorSugestao(String autorSugestao){
        this.autorSugestao = autorSugestao;
    }

    public String getNomeRelator(){
        return nomeRelator;
    }

    public String getBeneficiarioFinal(){
        return beneficiarioFinal;
    }
    public void setBeneficiarioFinal(String beneficiarioFinal){
        this.beneficiarioFinal = beneficiarioFinal;
    }
}