package br.utfpr.architecture.controllers;

import br.utfpr.architecture.Entity.Coordenador;
import br.utfpr.architecture.Entity.Estados;
import br.utfpr.architecture.Entity.SolicitarSubstituicao;

/**
 * CoordenadorController
 */
public class CoordenadorController {

    private Coordenador coordenador;

    public void CoordenadorController(Coordenador coordenador){
        this.coordenador = coordenador;
    }

    public void novaSolicitacao(SolicitarSubstituicao solicitarSubstituicao){
        coordenador.getSolicitacoes.add(solicitarSubstituicao);
    }

    public void aceitarSolicitacao(SolicitarSubstituicao solicitarSubstituicao, boolean estado){
        Estados estados;
        if(estado)
            solicitarSubstituicao.setEstado(estados.DEFERIDO);
        else
            solicitarSubstituicao.setEstado(estados.INDEFERIDO);
    }
}