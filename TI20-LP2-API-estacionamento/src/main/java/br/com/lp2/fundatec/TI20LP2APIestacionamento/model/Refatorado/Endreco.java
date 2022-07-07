package br.com.lp2.fundatec.TI20LP2APIestacionamento.model.Refatorado;

import javax.persistence.Column;

public class Endreco {
    private Long id_endereco;

    @Column(nullable = false, name = "UF")
    private String uf;

    @Column(nullable = false, name = "cidade")
    private String cidade;

    @Column(nullable = false, name = "bairro")
    private String bairro;

    @Column(nullable= false,  name = "CEP")
    private String cep;

    @Column(nullable = false, name = "rua")
    private String rua;

    @Column(nullable= false, name = "numero")
    private Integer numero;

    @Column(nullable= false, name = "complemento")
    private String complemento;
}
