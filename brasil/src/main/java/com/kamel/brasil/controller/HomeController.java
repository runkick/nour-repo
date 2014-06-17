package com.kamel.brasil.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kamel.brasil.bean.PronosBean;
import com.kamel.brasil.dao.CoupeDAO;
import com.kamel.brasil.model.Groupe;
import com.kamel.brasil.model.Pronostiqueur;
import com.kamel.brasil.service.CoupeServiceImpl;
import com.kamel.brasil.service.ICoupeService;

/**
 * Sample controller for going to the home page with a message
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	/**
	 * Selects the home page and populates the model with a message
	 */

	@Autowired
	CoupeDAO coupeDAO;
	
	@Autowired
	private ICoupeService coupeService;

	// @RequestMapping(value = "/", method = RequestMethod.GET)
	// public ModelAndView index(Model model) {
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("home");
	// return mav;
	// }

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView acceuil(Model model) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("accueil");
		Pronostiqueur pronostiqueur = new Pronostiqueur();
		mav.addObject("pronostiqueur", pronostiqueur);
		return mav;
	}

	
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/creationCompte")
	public ModelAndView creationCompte(
			@ModelAttribute Pronostiqueur pronostiqueur) {System.out.println("limada" + pronostiqueur.getPrenom());
		ModelAndView mav = new ModelAndView();
		logger.debug("Received postback on person " + pronostiqueur.getPrenom()
				+ " : " + pronostiqueur.getNom());
		coupeDAO.createPronostiqueur(pronostiqueur);

		mav.addObject("pronostiqueur", pronostiqueur);

		mav.setViewName("creationCompte");
		return mav;
	}

	@RequestMapping(value = "/creationCompte", method = RequestMethod.GET)
	public ModelAndView creationCompte() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("creationCompte");
		Pronostiqueur pronostiqueur = new Pronostiqueur();
		mav.addObject("pronostiqueur", pronostiqueur);
		return mav;

	}

	@RequestMapping(value = "/identification", method = RequestMethod.GET)
	public ModelAndView identification() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("identification");
		Pronostiqueur pronostiqueur = new Pronostiqueur();
		
		mav.addObject("pronostiqueur", pronostiqueur);
		return mav;

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/identification")
	public ModelAndView identification(
			@ModelAttribute Pronostiqueur pronostiqueur) {
		System.out.println("indetif pronos" + pronostiqueur.getPrenom());
		ModelAndView mav = new ModelAndView();

		Pronostiqueur playeur = coupeDAO.indentification(pronostiqueur);
		if (playeur != null) {

			mav.addObject("playeur", playeur);
			mav.setViewName("pronos");
		} else {
			mav.addObject("errorMessage", "erreur de login ou mot de passe");
			mav.setViewName("identification");
		}

		return mav;
	}	
		
//	@RequestParam(value = "pronos1", required = true) String pronos1,@RequestParam(value = "pronos2", required = true) String pronos2
	
	@RequestMapping(value ="/pronos", method = RequestMethod.GET)
		public ModelAndView pronos(){
			ModelAndView mav= new ModelAndView();
			mav.setViewName("pronos");
			
			mav.addObject("pronosBean" , new PronosBean());
			mav.setViewName("pronos");
			return mav;
		}
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/pronos")
	public ModelAndView pronos(@ModelAttribute("pronosBean")
    PronosBean pronosBean) {
		
		ModelAndView mav= new ModelAndView();
		mav.setViewName("phaseFinale");
		String pronos = pronosBean.construirePronos();
		List<Groupe> groupe = coupeService.loadGroupe();
		
		return mav;
	}
	
	
	@RequestMapping(value = "/phaseFinale", method = RequestMethod.GET)
	public ModelAndView phaseFinale() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("phaseFinale");
		
		return mav;

	}

}
