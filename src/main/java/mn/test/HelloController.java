package mn.test;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Put;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import javax.validation.Valid;

@Controller("/hello")
@ExecuteOn(TaskExecutors.IO)
public class HelloController {

  public HelloController() {
  }

  @Put(uri = "/{id}")
  public void update(long id, @Body @Valid UpdateRequest updateRequest) {
    System.out.println(id);
  }
}
