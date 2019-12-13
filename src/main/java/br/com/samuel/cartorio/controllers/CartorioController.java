package br.com.samuel.cartorio.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.samuel.cartorio.dao.CartorioDAO;
import br.com.samuel.cartorio.models.Cartorio;

@Controller
@RequestMapping("/")
public class CartorioController {

	@Autowired
	CartorioDAO cartorioDao;

	@RequestMapping("/cadastro")
	public ModelAndView form() {
		return new ModelAndView("cartorio/form");
	}

	//@RequestMapping("/atualizar")
	//public ModelAndView updateForm() {
	//	return new ModelAndView("cartorio/updateForm");
	//}
	
	@RequestMapping("/atualizar/{id}")
	@Transactional
	public ModelAndView atualizarForm(@PathVariable("id") Integer id) {
		ModelAndView modelAndView = new ModelAndView("/cartorio/updateForm");
		Cartorio cartorio = cartorioDao.find(id);
		modelAndView.addObject("cartorio", cartorio);
		return modelAndView;
	}

	

	// create
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView gravar(Cartorio cartorio) {
		System.out.println(cartorio);
		cartorioDao.gravar(cartorio);
		return new ModelAndView("redirect:/");
	}

	// read (detalhe,lista e json)
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		List<Cartorio> cartorios = cartorioDao.listar();
		ModelAndView modelAndView = new ModelAndView("/cartorio/lista");
		modelAndView.addObject("cartorios", cartorios);
		return modelAndView;
	}

	@RequestMapping("/cartorios")
	@ResponseBody
	public List<Cartorio> listaJSON() {
		return cartorioDao.listar();
	}

	@RequestMapping("/detalhe/{id}")
	public ModelAndView detalhe(@PathVariable("id") Integer id) {
		ModelAndView modelAndView = new ModelAndView("/cartorio/detalhe");
		Cartorio cartorio = cartorioDao.find(id);
		modelAndView.addObject("cartorio", cartorio);
		return modelAndView;
	}

	// update
	@RequestMapping("/atualizar/post")
	@Transactional
	public ModelAndView atualizar(Cartorio cartorio) {
		cartorioDao.atualizar(cartorio);

		return new ModelAndView("redirect:/");
	}

	// delete
	@RequestMapping("/remover/{id}")
	@Transactional
	public ModelAndView remover(@PathVariable("id") Integer id) {
		Cartorio cartorio = cartorioDao.find(id);
		if (cartorio != null) {
			cartorioDao.remover(cartorio);
		}
		return new ModelAndView("redirect:/");
	}

}
