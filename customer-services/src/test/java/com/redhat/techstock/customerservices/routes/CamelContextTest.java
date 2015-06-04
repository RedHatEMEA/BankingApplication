package com.redhat.techstock.customerservices.routes;

import org.junit.Test;

public class CamelContextTest extends BaseCamelBlueprintTestSupport {

    @Test
    public void camelContextIsNotNull() {
        assertNotNull(context);
    }
}
