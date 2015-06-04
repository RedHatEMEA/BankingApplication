package com.redhat.techstock.customerservices.routes;

import java.util.Dictionary;
import java.util.Map;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.apache.camel.util.KeyValueHolder;
import org.mockito.Mockito;
import org.springframework.transaction.PlatformTransactionManager;

public class BaseCamelBlueprintTestSupport extends CamelBlueprintTestSupport {

    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/customerservices-context.xml";
    }

    @Override
    protected void addServicesOnStartup(Map<String, KeyValueHolder<Object, Dictionary>> services) {
        services.put(PlatformTransactionManager.class.getCanonicalName(), asService(Mockito.mock(PlatformTransactionManager.class), null));

        super.addServicesOnStartup(services);
    }
}
