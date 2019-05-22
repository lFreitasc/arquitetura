package br.utfpr.architecture.controllers;

import br.utfpr.architecture.Entity.AulasDoPlanoSubstituicao;
import br.utfpr.architecture.Entity.Professor;
import br.utfpr.architecture.Entity.SolicitacaoPlanoDeSubstituicao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/home") 
public class HomeController {
     
    @RequestMapping( value = { "/" , "" ,"/solicitacao" }) 
    public SolicitacaoPlanoDeSubstituicao Solicitacao(){
       
        return new SolicitacaoPlanoDeSubstituicao("home/solicitacao");
    }
     
    @RequestMapping( "/addAulas" ) 
    public AulasDoPlanoSubstituicao addAulas(){
         
        return new AulasDoPlanoSubstituicao("home/addAula");
    }
    
    @RequestMapping( "/aprovaSubstituicao" ) 
    public Professor aprovaSubstituicao(){
        
        return null; 
    }
     
}