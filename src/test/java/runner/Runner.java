    package runner;

    import io.cucumber.junit.Cucumber;
    import io.cucumber.junit.CucumberOptions;
    import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = "steps",
            tags = "@Test",
            features = "src/test/resources/features",
            plugin = {"pretty","summary",
            "html:target/.html",
            "json:target/.xml",
            "junit:target/.xml",
            "timeline:cucumber-timeline"}
    )
    public class Runner {
        public Runner() {
        }
    }
