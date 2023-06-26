package lv.vsergejevs.library.controllers;

import lv.vsergejevs.library.models.Position;
import lv.vsergejevs.library.services.PositionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/positions")
public class PositionsController {
    private final PositionsService positionsService;

    @Autowired
    public PositionsController(PositionsService positionsService) {
        this.positionsService = positionsService;
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("position", positionsService.getPositions());
        return "index";
    }

    @GetMapping("/{id}/update")
    public String edit(Model model, @PathVariable("id") Long id) {
        model.addAttribute("position", positionsService.getPosition(id));
        return "edit";
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("position", positionsService.getPosition(id));
        return "position";
    }

    @GetMapping("/create")
    public String newPosition(Model model) {
        model.addAttribute("position", new Position());
        return "create";
    }

    @PostMapping
    public String create(@ModelAttribute("position") Position position) {
        positionsService.addPosition(position);
        return "redirect:/positions";
    }

    @PostMapping("/{id}/delete")
    public String delete(@ModelAttribute("position") Position position,
                         @RequestParam("_method") String method,
                         @PathVariable("id") Long id) {
        if (method.equalsIgnoreCase("DELETE")) {
            positionsService.deletePosition(id);
        }
        return "redirect:/positions";
    }

    @PostMapping("/{id}/update")
    public String update(@ModelAttribute("position") Position position,
                         @PathVariable("id") Long id,
                         @RequestParam("_method") String method) {
        if (method.equalsIgnoreCase("PATCH")) {
            positionsService.updatePosition(position, id);
        }
        return "redirect:/positions";
    }
}
