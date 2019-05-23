package com.alberto.soto.xslt.spring.controller;

import com.alberto.soto.xslt.spring.data.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * com.alberto.soto.xslt.spring.controller
 * Class RestExampleController
 * 07/05/2019
 *
 * @author berto (alberto.soto@gmail.com)
 */
@RestController
public class RestExampleController {
    private static final String REST_PREFIX = "/rest/api/v1";

    @RequestMapping(value = REST_PREFIX + "/sayHi", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE, headers = "Accept=*/*")
    public ResponseEntity<Book> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Book aux = new Book();
        aux.setName(name);
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }

    @RequestMapping(value = REST_PREFIX + "/dummy", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, headers = "Accept=*/*")
    public ResponseEntity<Book> dummy() {
        Book aux = new Book();
        aux.setName("Pepito");
        return new ResponseEntity<>(aux, HttpStatus.OK);
    }
}
