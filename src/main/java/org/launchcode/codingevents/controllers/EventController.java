package org.launchcode.codingevents.controllers;

import org.launchcode.codingevents.Event;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();
    private static HashMap<String, String> hashMapEvents = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        hashMapEvents.put("Memorial Day", "End of May");
        hashMapEvents.put("Fourth of July", "Beginning in July");
        hashMapEvents.put("Father's Day", "Sometime in June");

//        model.addAttribute("title","All Events");
//        model.addAttribute("events", events);
        model.addAttribute("events", hashMapEvents);
        return "events/index";
    }

    //lives at /events/create
    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    //lives at /events/create
    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        //events.add(eventName);
        return "redirect:";
    }

}