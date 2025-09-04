public class Main {
    public static void main(String[] args) {
        
        // EMENDAS INDIVIDUAIS
        
        EmendaIndividual ei1 = new EmendaIndividual(
        "Transferência com Finalidade Definida", 2025, "Individual", "ABILIO BRUNINI", 8, false,
     "VÁRZEA GRANDE - MT", "Saúde", "Atenção básica", "5119 - ATENCAO PRIMARIA A SAUDE", "2E89 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVIÇOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS", "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVIÇOS DE ATENCAO PRIMARIA A SAUDE PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS", "202542900008",
        500000.0, 0.0, 0.0, 0.0, 0.0, 0.0,
        "Projeto A", "Licitacao A"
    );

    EmendaIndividual ei2 = new EmendaIndividual(
     "Transferência com Finalidade Definida", 2025, "Individual", "ABILIO BRUNINI", 9, false,
    "VÁRZEA GRANDE - MT", "Saúde", "Assistência hospitalar e ambulatorial", "5118 - ATENCAO ESPECIALIZADA A SAUDE", "2E90 - INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ASSISTENCIA HOSPITALAR E AMBULATORIAL PARA CUMPRIMENTO DE METAS", "INCREMENTO TEMPORARIO AO CUSTEIO DOS SERVICOS DE ASSISTENCIA HOSPITALAR E AMBULATORIAL PARA CUMPRIMENTO DE METAS - DESPESAS DIVERSAS", "202542900009",
     1500000.00, 0.0, 0.0, 0.0, 0.0, 0.0,
     "Projeto B", "Licitacao B"
    );

    EmendaIndividual ei3 = new EmendaIndividual(
     "Emenda Individual - Transferências Especiais", 2022, "Individual", "ABILIO SANTANA", 4, false,
     "IRAMAIA - BA", "Encargos especiais", "Outras transferências", "0903 - OPERACOES ESPECIAIS: TRANSFERENCIAS CONSTITUCIONAIS E AS DECORRENTES DE LEGISLACAO ESPECIFICA", "0EC2 - TRANSFERENCIAS ESPECIAIS", "TRANSFERENCIAS ESPECIAIS", "202238950004",
        200000.00, 0.0, 0.0, 200000.00, 0.0, 200000.0,
        "Projeto C", "Licitacao C"
    );

        
        // EMENDAS DE BANCADA
       
        EmendaBancada eb1 = new EmendaBancada(
                "https://www.congressonacional.leg.br/documents/137784508/146970366/Ceara.pdf/3309cc2d-3884-44c8-af58-46b90076678a", "Sugestao A", 2025, "Emenda de Bancada", "7103 - BANCADA DE ALAGOAS", 8, false,
                "ALAGOAS (UF)", "Educação", "Ensino profissional", "5112 - EDUCACAO PROFISSIONAL E TECNOLOGICA QUE TRANSFORMA", "20RG - REESTRUTURACAO E MODERNIZACAO DAS INSTITUICOES DA REDE FEDERAL DE EDUCACAO PROFISSIONAL, CIENTIFICA E TECNOLOGICA", "REESTRUTURACAO E MODERNIZACAO DAS INSTITUICOES DA REDE FEDERAL DE EDUCACAO PROFISSIONAL, CIENTIFICA E TECNOLOGICA - DESPESAS DIVERSAS", "202571030008",
                1930159.20, 0, 0, 0, 0, 0
        );

       
        // EMENDAS DE COMISSÃO
       
        EmendaComissao ec1 = new EmendaComissao(
                "link1.com", "Relatorio A", "Sugestao A", 2023, "Emenda de Comissão", "5038 - COM MISTA PERM SOBRE MIG INTERNACIONAIS E REFUGIAD", 3, false,
                "Nacional", "Defesa nacional", "Defesa terrestre", "6011 - COOPERACAO COM O DESENVOLVIMENTO NACIONAL", "219C - ACOLHIMENTO HUMANITARIO E INTERIORIZACAO DE MIGRANTES EM SITUACAO DE VULNERABILIDADE E FORTALECIMENTO DO CONTROLE DE FRONTEIRAS", "ACOLHIMENTO HUMANITARIO E INTERIORIZACAO DE MIGRANTES EM SITUACAO DE VULNERABILIDADE E FORTALECIMENTO DO CONTROLE DE FRONTEIRAS - DESPESAS DIVERSAS", "202350380003\t",
                100000.00, 0, 0, 0, 214.58, 99785.42, "Parlamentar 6"
        );
    

       
        // EMENDAS DE RELATOR
        
        EmendaRelator er1 = new EmendaRelator(
                "Sugestao A", "Relator A", "Beneficiario A", 2020, "Emenda de Relator", "8100 - RELATOR GERAL", 1470, true,
                "MÚLTIPLO", "Saúde", "Saneamento básico urbano", "2222 - SANEAMENTO BASICO", "7652 - IMPLANTACAO DE MELHORIAS SANITARIAS DOMICILIARES PARA PREVENCAO E CONTROLE DE DOENCAS E AGRAVOS EM LOCALIDADES URBANAS DE MUNICIPIOS COM POPULACAO ATE 50.000 HABITANTES", "IMPLANTACAO DE MELHORIAS SANITARIAS DOMICILIARES PARA PREVENCAO E CONTROLE DE DOENCAS E AGRAVOS EM LOCALIDADES URBANAS DE MUNICIPIOS COM POPULACAO ATE 50.000 HABITANTES", "202081001470",
                22760560.00, 232541.43, 232541.43, 33118099.33, 2326716.48, 9901120.66
        );


        ei1.addDocumento(new DocumentoRelacionado("2025-03-10", "Empenho", 25000.0, "Empenho-123", "Hospital A"));
        ei1.addDocumento(new DocumentoRelacionado("2025-04-05", "Liquidação", 15000.0, "Liq-456", "Hospital A"));
        ei1.addDocumento(new DocumentoRelacionado("2025-05-20", "Pagamento", 12000.0, "Pgto-789", "Hospital A"));

        
        ei2.addDocumento(new DocumentoRelacionado("2025-02-20", "Empenho", 50000.0, "Empenho-201", "Prefeitura B"));
        ei2.addDocumento(new DocumentoRelacionado("2025-03-15", "Liquidação", 30000.0, "Liq-202", "Prefeitura B"));
        ei2.addDocumento(new DocumentoRelacionado("2025-06-01", "Pagamento", 20000.0, "Pgto-203", "Prefeitura B"));


        ei3.addDocumento(new DocumentoRelacionado("17-05-2022", "Empenho", 200000.00, "2022NE004574", "13.894.902/0001-60 - MUNICIPIO DE IRAMAIA"));
        ei3.addDocumento(new DocumentoRelacionado("31-12-2022", "Liquidação", 0.0, 
                        "2022NS018904", "-"));
        ei3.addDocumento(new DocumentoRelacionado("28-03-2023", "Liquidação", 0.0, "2023NS005665", "13.894.902/0001-60 - MUNICIPIO DE IRAMAIA"));
        ei3.addDocumento(new DocumentoRelacionado("28-03-2023", "Liquidação", 0.0, "2023NS005665", "13.894.902/0001-60 - MUNICIPIO DE IRAMAIA"));

       
        
       
        ei1.imprimirDocumentos();
        System.out.println();
        eb1.imprimirDocumentos();
        System.out.println();
        ec1.imprimirDocumentos();
        System.out.println();
        er1.imprimirDocumentos();

       // uso de calcTotalporFase
        System.out.println();
        System.out.println("Total empenho EI1: R$ " + String.format("%.2f", ei1.calcTotalporFase("Empenho")));
        System.out.println("Total pagamento EI2: R$ " + String.format("%.2f", ei2.calcTotalporFase("Pagamento")));
    }
}