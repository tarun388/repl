package com.verma.tarun;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class ExecutorApplication extends Application<ExecutorConfiguration> {

    public static void main(final String[] args) throws Exception {
        new ExecutorApplication().run(args);
    }

    @Override
    public String getName() {
        return "Executor";
    }

    @Override
    public void initialize(final Bootstrap<ExecutorConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ExecutorConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
