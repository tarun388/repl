package com.verma.tarun.executor;

import io.dropwizard.core.Application;
import io.dropwizard.core.setup.Bootstrap;
import io.dropwizard.core.setup.Environment;

public class executorApplication extends Application<executorConfiguration> {

    public static void main(final String[] args) throws Exception {
        new executorApplication().run(args);
    }

    @Override
    public String getName() {
        return "executor";
    }

    @Override
    public void initialize(final Bootstrap<executorConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final executorConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
