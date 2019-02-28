package test2groovy

/*
import groovy.transform.CompileStatic
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.http.MediaType

@CompileStatic
@Controller("/") // <1>
class HelloController {
    //@Get("/") // <2>
    @Produces(MediaType.TEXT_PLAIN) // <3>
    String index() {
        "Hello from Root" // <4>
    }
}
*/

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Get
import io.micronaut.http.MediaType

import javax.annotation.Nullable;
import io.micronaut.http.annotation.Produces

@Controller("/api")
class ToDoController {
    @Get("{/id}")
	@Produces(MediaType.TEXT_PLAIN)
    public String getTodo(@Nullable int id) {
      //Do something with the id from the URI
      return "... ToDoController @Get was hit where id='${id}'"
    }    

    @Get("{?id}")
	@Produces(MediaType.TEXT_PLAIN)
    public String getTodo2(@Nullable int id) {
      //Do something with the id from the URI
      return "... ToDoController @Get was hit /api/'${id}'"
    }    

}