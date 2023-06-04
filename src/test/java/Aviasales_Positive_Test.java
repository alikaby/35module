import io.cucumber.testng.CucumberOptions;

    @CucumberOptions(
            features = "src/test/features",
            glue = "ru.savkk.test",
            tags = "@all",
            dryRun = false,
            strict = false,
            snippets = CucumberOptions.SnippetType.UNDERSCORE
//        name = "^Успешное|Успешная.*"
    )
    public class Aviasales_Positive_Test{

    }


