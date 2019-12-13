package br.com.samuel.cartorio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.samuel.cartorio.dao.CartorioDAO;
import br.com.samuel.cartorio.models.Cartorio;

@Controller
public class CartorioController {

	@Autowired CartorioDAO cartorioDao;
	
		@RequestMapping("/cadastro")
	    public String form(){
	        return "cartorio/form";
	    }
	    
		@RequestMapping("/submit")
	    public String gravar(Cartorio cartorio){
	        System.out.println(cartorio);
	        cartorioDao.gravar(cartorio);
	        return "cartorio/ok";
	    }
		
		@RequestMapping("/lista")
		public ModelAndView listar(){
		    List<Cartorio> cartorios = cartorioDao.listar();
		    ModelAndView modelAndView = new ModelAndView("/cartorio/lista");
		    modelAndView.addObject("cartorios", cartorios);
		    return modelAndView;
		}
}
