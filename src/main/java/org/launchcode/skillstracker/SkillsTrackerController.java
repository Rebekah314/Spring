package org.launchcode.skillstracker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsTrackerController {
    @GetMapping
    public String landingPage() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "<body>" +
                "<html>";
    }
    @GetMapping("/form")
    public String skillsForm() {
        return "<html>" +
                "<body>" +
                "<form action='results' method='post'>" +
                "<label>Name:</label>" +
                "<br />" +
                "<input type='text' name='name' />" +
                "<br />" +
                "<br />" +
                "<label>My favorite language:</label>" +
                "<br />" +
                "<select name='firstChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<br />" +
                "<label>My second favorite language:</label>" +
                "<br />" +
                "<select name='secondChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<br />" +
                "<label>My second favorite language:</label>" +
                "<br />" +
                "<select name='thirdChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select>" +
                "<br />" +
                "<br />" +
                "<input type='submit' value='Submit' />"+
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("/results")
    public String displayChoices(@RequestParam String name, @RequestParam String firstChoice,
                                 @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>"+ thirdChoice + "</li>";
    }


}
