package pl.akademiakodu;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.apache.catalina.servlet4preview.http.MappingMatch.PATH;

/**
 * Created by Lenovo on 2016-12-05.
 */
@RestController
public class IndexController /*implements ErrorController*/ {

  /*  private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "Error handling";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }
    */
}