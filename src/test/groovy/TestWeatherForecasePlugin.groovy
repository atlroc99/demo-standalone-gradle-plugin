import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.Task
import org.gradle.testfixtures.ProjectBuilder
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TestWeatherForecastPlugin {
    @Test
    public void testForecastPlugin() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply 'com.mz.weatherforecast'
        Assertions.assertNotNull(project.tasks.forecast)

        def forecastTask = project.getTasks().getByName('forecast')
        println(forecastTask);
    }
}
