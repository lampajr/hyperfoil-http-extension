package io.lampajr.hyperfoil.example;

import io.hyperfoil.api.config.Name;
import io.hyperfoil.api.config.Step;
import io.hyperfoil.api.config.StepBuilder;
import io.hyperfoil.http.steps.HttpRequestStepBuilder;
import org.kohsuke.MetaInfServices;

import java.util.List;

@MetaInfServices(StepBuilder.class)
@Name("extendedHttpRequest")
public class ExtendedHttpRequestStepBuilder extends HttpRequestStepBuilder {
   @Override
   public List<Step> build() {
      return super.build();
   }
}
