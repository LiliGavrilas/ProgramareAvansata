package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class MyController {
    PlayerRepository players;
    @GetMapping("/")
    public List<Player> getPlayer()
    {
        return players.findAll();
    }

    @PostMapping("/addplayer")
    public String addPlayer(@Valid Player player, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "add-player";
        }

        players.save(player);
        model.addAttribute("player", players.findAll());
        return "index";
    }

    @PutMapping("/{id}")//update player
    public String updateUser(@PathVariable("id") long id, @Valid Player player,BindingResult result, Model model) {
        if (result.hasErrors()) {
            player.setId(id);
            return "update-player";
        }

        players.save(player);
        model.addAttribute("player", players.findAll());
        return "index";
    }
    @DeleteMapping("/{id}")
    void deletePlayer(@PathVariable long id)
    {
        players.deleteById(id);

    }

}
