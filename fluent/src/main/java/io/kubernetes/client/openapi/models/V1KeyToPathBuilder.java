package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1KeyToPathBuilder extends io.kubernetes.client.openapi.models.V1KeyToPathFluentImpl<io.kubernetes.client.openapi.models.V1KeyToPathBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1KeyToPath,io.kubernetes.client.openapi.models.V1KeyToPathBuilder> {

    io.kubernetes.client.openapi.models.V1KeyToPathFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1KeyToPathBuilder() {
        this(true);
    }

    public V1KeyToPathBuilder(java.lang.Boolean validationEnabled) {
        this(new V1KeyToPath(), validationEnabled);
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPathFluent<?> fluent) {
        this(fluent, true);
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPathFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1KeyToPath(), validationEnabled);
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1KeyToPath instance) {
        this(fluent, instance, true);
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPathFluent<?> fluent,io.kubernetes.client.openapi.models.V1KeyToPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withKey(instance.getKey());
        
        fluent.withMode(instance.getMode());
        
        fluent.withPath(instance.getPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPath instance) {
        this(instance,true);
    }

    public V1KeyToPathBuilder(io.kubernetes.client.openapi.models.V1KeyToPath instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withKey(instance.getKey());
        
        this.withMode(instance.getMode());
        
        this.withPath(instance.getPath());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1KeyToPath build() {
        V1KeyToPath buildable = new V1KeyToPath();
        buildable.setKey(fluent.getKey());
        buildable.setMode(fluent.getMode());
        buildable.setPath(fluent.getPath());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1KeyToPathBuilder that = (V1KeyToPathBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
