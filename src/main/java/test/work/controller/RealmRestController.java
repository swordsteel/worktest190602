package test.work.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import test.work.model.ErrorMessage;
import test.work.model.RealmRequest;
import test.work.service.RealmService;

@RestController
@RequestMapping("/service/user/realm")
public class RealmRestController {

    @Autowired
    private RealmService realmService;

    @GetMapping("/{requestId}")
    @ResponseBody
    public ResponseEntity<?> getRealm(@PathVariable String requestId) {
        try {
            int id = Integer.parseInt(requestId);
            return new ResponseEntity<>("Get Respons", HttpStatus.OK);
        } catch(NumberFormatException e) {
            return new ResponseEntity(new ErrorMessage("InvalidArgument"), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> createRealm(@RequestBody RealmRequest realmRequest) {
        if(realmRequest.getName() == null || realmRequest.getName().isEmpty()) {
            return new ResponseEntity(new ErrorMessage("InvalidRealmName"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity("Post Response", HttpStatus.OK);
    }

}
