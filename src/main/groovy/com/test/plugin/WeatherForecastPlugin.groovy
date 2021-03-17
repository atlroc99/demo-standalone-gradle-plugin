package com.test.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class WeatherForecastPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {
        project.task('forecast') {
            group = 'weather'
            doLast {
                print 'Sunny 86 degree'
            }
        }
    }
}
