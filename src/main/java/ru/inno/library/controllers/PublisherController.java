package ru.inno.library.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.inno.library.dto.PublisherForm;
import ru.inno.library.services.PublisherService;


@RequiredArgsConstructor
@Controller
public class PublisherController {

    private final PublisherService publisherService;

    @GetMapping("/publishers")
    public String getPublishers(@RequestParam(value = "orderBy", required = false) String orderBy,
                                    @RequestParam(value = "dir", required = false) String direction, Model model) {
        model.addAttribute("publishers", publisherService.getPublishers());
        return "publishers/publishers_page";
    }

    @GetMapping("/publishers/{publisher-id}")
    public String getPublisher(@PathVariable("publisher-id") Long publisherId, Model model) {
        model.addAttribute("publisher", publisherService.getPublisher(publisherId));
        return "publishers/publisher_page";
    }

    @PostMapping("/publishers")
    public String addPublisher(PublisherForm publisher) {
        publisherService.addPublisher(publisher);
        return "redirect:/publishers";
    }

    @PostMapping("/publishers/{publisher-id}/update")
    public String updatePublisher(@PathVariable("publisher-id") Long publisherId, PublisherForm publisher) {
        publisherService.updatePublisher(publisherId, publisher);
        return "redirect:/publishers" + publisherId;
    }

    @GetMapping("/publishers/{publisher-id}/delete")
    public String deletePublisher(@PathVariable("publisher-id") Long publisherId) {
        publisherService.deletePublisher(publisherId);
        return "redirect:/publishers/";
    }

}
