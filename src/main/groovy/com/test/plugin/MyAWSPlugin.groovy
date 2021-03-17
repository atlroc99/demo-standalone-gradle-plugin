package com.test.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

public class MyAwsPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('copyToS3') {
            println('copying files to s3')
        }

        project.task('deployTpS3') {
            println('deploying to ec2 insance')
        }
    }
}