package test.work.controller;

import org.springframework.web.bind.annotation.*;
import test.work.model.RealmRequest;

@RestController
@RequestMapping("/service/user/realm")
public class RealmRestController {

    @GetMapping("/{id}")
    @ResponseBody
    public String getRealm(@PathVariable int id) {
        return "Get Respons";
    }

    @PostMapping
    @ResponseBody
    public String createRealm(@RequestBody RealmRequest realmRequest) {
        return "Post Response";
    }

}
