package br.utfpr.architecture.controllers;

import br.utfpr.architecture.Entity.AulasDoPlanoSubstituicao;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.SolicitacaoPlanoDeSubstituicao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class substituicaoService {

	@Autowired
	private substituicaoService substituicaoService;

	@GetMapping("/solicitacao")
	public List<SolicitacaoPlanoDeSubstituicao> PlanodeSolicitacao(@PathVariable Long idPlanoDeAula) {
		return substituicaoService.retrievePlanoDeAulas(idPlanoDeAula);
	}
        
        
        @Autowired
	private substituicaoService aulaPlanoService;
        @GetMapping("/solicitacao/aulaPlano")
        
	public List<AulasDoPlanoSubstituicao> retrieveAulasForSolicitacao(@PathVariable Long idAulaPlanoSubstituicao) throws Exception {
	try{
            
            if (aulaPlanoService.aulaPlanoService.PlanodeSolicitacao(idAulaPlanoSubstituicao).size() > 6){
             throw new Exception("Erro: Quantidade de aulas no Plano de aula maior que 6");
            }
        }catch(Exception ex){
             JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
            return aulaPlanoService.retrieveAulas(idAulaPlanoSubstituicao);
	}
        
        @Autowired
	private substituicaoService aprovaPlanoService;

	@GetMapping("/solicitacao/aprovaPlano")
	public List<SolicitacaoPlanoDeSubstituicao> aprovaPlanodeSolicitacao(@PathVariable Long idPlanoDeAula) {
		return substituicaoService.retrievePlanoDeAulas(idPlanoDeAula);
	}
        
         @Autowired
	private substituicaoService enviaListaChamada;

	@GetMapping("/solicitacao/enviarListaChamada")
        public void upload(String pasta, String nomeDoArquivo,InputStream arquivoCarregado) throws FileNotFoundException {
            String caminhoArquivo = pasta + "/" + nomeDoArquivo;
            File novoArquivo = new File(caminhoArquivo);
            FileOutputStream saida = new FileOutputStream(novoArquivo);
           
        }
        
        
        

    private List<SolicitacaoPlanoDeSubstituicao> retrievePlanoDeAulas(Long idPlanoDeAula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private List<AulasDoPlanoSubstituicao> retrieveAulas(Long idAulaPlanoSubstituicao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}