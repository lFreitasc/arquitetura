package br.utfpr.architecture.models;

import br.utfpr.architecture.Entity.Ausencia;
import br.utfpr.architecture.Entity.Coordenador;
import br.utfpr.architecture.Entity.Estados;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.Substituicao;

/**
 * CoordenadorController
 */
public class CoordenadorController {

    private Coordenador coordenador;

    public void CoordenadorController(Coordenador coordenador){
        this.coordenador = coordenador;
    }

    public void novaSolicitacao(Substituicao solicitarSubstituicao){
        coordenador.getSolicitacoes.add(solicitarSubstituicao);
    }

    public void aceitarSolicitacao(Substituicao solicitarSubstituicao, boolean estado){
        Estados estados;
        if(estado)
            solicitarSubstituicao.setEstado(estados.DEFERIDO);
        else
            solicitarSubstituicao.setEstado(estados.INDEFERIDO);
    }

    public void registrarAusencias(Professor professor, String procedimento){
        professor.getAusencias().add(new Ausencia(procedimento));
    }

    public void comprovanteAula(Substituicao substituicao, Presenca presenca){
        substituicao.setPresenca() = presenca;
    }
}