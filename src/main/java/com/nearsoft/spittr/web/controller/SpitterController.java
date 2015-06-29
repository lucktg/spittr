package com.nearsoft.spittr.web.controller;

import com.nearsoft.spittr.domain.model.Spitter;
import com.nearsoft.spittr.domain.repository.SpitterRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by vtorres on 29/06/15.
 */
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    private SpitterRepository spitterRepository;

    public SpitterController(SpitterRepository spitterRepository) {
        this.spitterRepository = spitterRepository;
    }

    public SpitterController() {

    }


    @RequestMapping(method = GET, value = "/register")
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(method = POST, value = "/register")
    public String processRegistration(Spitter spitter) {
        spitterRepository.save(spitter);
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(method = GET, value = "/{username}")
    public String showSpitterProfile(@PathVariable(value = "username") String userName, Model model) {
        model.addAttribute(spitterRepository.findByUsername(userName));
        return "profile";
    }

}
