package mn.test;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

@Controller("/bye")
@ExecuteOn(TaskExecutors.IO)
public class ByeController {

  public ByeController() {
  }

  @Get
  public String get() {
    return "Bye 1";
  }
}
