package io.micronaut.docs.qualifiers.annotationmember

import javax.inject.Singleton

// tag::class[]
@Singleton
@Cylinders(value = 8, description = "8-cylinder V8 engine") // <1>
class V8Engine implements Engine { // <2>
    @Override
    int getCylinders() {
        return 8
    }

    @Override
    String start() {
        return "Starting V8"
    }
}
// end::class[]
