package br.com.samuel.cartorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.samuel.cartorio.dao.CartorioDAO;
import br.com.samuel.cartorio.models.Cartorio;

@Controller
@RequestMapping("/")
public class CartorioController {

	@Autowired CartorioDAO cartorioDao;
	
		@RequestMapping("/cadastro")
	    public String form(){
	        return "cartorio/form";
	    }
	    
		@RequestMapping(method=RequestMethod.POST)
	    public ModelAndView gravar(Cartorio cartorio){
	        System.out.println(cartorio);
	        cartorioDao.gravar(cartorio);
	        return new ModelAndView("redirect:/");
	    }
		
		@RequestMapping(method=RequestMethod.GET)
		public ModelAndView listar(){
		    List<Cartorio> cartorios = cartorioDao.listar();
		    ModelAndView modelAndView = new ModelAndView("/cartorio/lista");
		    modelAndView.addObject("cartorios", cartorios);
		    return modelAndView;
		}
		
		@RequestMapping("/detalhe/{id}")
		public ModelAndView detalhe(@PathVariable("id") Integer id){
		    ModelAndView modelAndView = new ModelAndView("/cartorio/detalhe");
		    Cartorio cartorio = cartorioDao.find(id);
		    modelAndView.addObject("cartorio", cartorio);
		    return modelAndView;
		}
		    
}
