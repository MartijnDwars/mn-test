package mn.test;

import io.micronaut.core.annotation.Introspected;

import javax.validation.constraints.NotEmpty;

@Introspected
public class UpdateRequest {

  @NotEmpty
  private String name;

  @NotEmpty
  private String gitHubAccessToken;

  @NotEmpty
  private String gitHubRepository;

  public UpdateRequest() {}

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGitHubAccessToken() {
    return gitHubAccessToken;
  }

  public void setGitHubAccessToken(String gitHubAccessToken) {
    this.gitHubAccessToken = gitHubAccessToken;
  }

  public String getGitHubRepository() {
    return gitHubRepository;
  }

  public void setGitHubRepository(String gitHubRepository) {
    this.gitHubRepository = gitHubRepository;
  }
}
