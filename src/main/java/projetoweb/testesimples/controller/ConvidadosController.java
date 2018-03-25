package projetoweb.testesimples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import projetoweb.testesimples.model.Convidado;
import projetoweb.testesimples.repository.RepositoryConvidados;

@Controller
@RequestMapping(path="/convidados")
public class ConvidadosController {
	
	@Autowired
	RepositoryConvidados repositoryConvidados;
	
	@GetMapping(path="/lista")
	public ModelAndView listar() {
		ModelAndView modelAndViewConvidados = new ModelAndView("listaConvidados");
		modelAndViewConvidados.addObject(new Convidado());
		modelAndViewConvidados.addObject("convidados", this.repositoryConvidados.findAll());
		
		return modelAndViewConvidados;
	}
	
	@PostMapping(path="/salva")
	public String salva(Convidado convidado) {
		this.repositoryConvidados.save(convidado);
		return "redirect:/convidados/lista";
	}
	
}
