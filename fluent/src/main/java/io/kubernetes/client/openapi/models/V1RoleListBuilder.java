package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1RoleListBuilder extends io.kubernetes.client.openapi.models.V1RoleListFluentImpl<io.kubernetes.client.openapi.models.V1RoleListBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1RoleList,io.kubernetes.client.openapi.models.V1RoleListBuilder> {

    io.kubernetes.client.openapi.models.V1RoleListFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1RoleListBuilder() {
        this(true);
    }

    public V1RoleListBuilder(java.lang.Boolean validationEnabled) {
        this(new V1RoleList(), validationEnabled);
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleListFluent<?> fluent) {
        this(fluent, true);
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleListFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1RoleList(), validationEnabled);
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleListFluent<?> fluent,io.kubernetes.client.openapi.models.V1RoleList instance) {
        this(fluent, instance, true);
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleListFluent<?> fluent,io.kubernetes.client.openapi.models.V1RoleList instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiVersion(instance.getApiVersion());
        
        fluent.withItems(instance.getItems());
        
        fluent.withKind(instance.getKind());
        
        fluent.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleList instance) {
        this(instance,true);
    }

    public V1RoleListBuilder(io.kubernetes.client.openapi.models.V1RoleList instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiVersion(instance.getApiVersion());
        
        this.withItems(instance.getItems());
        
        this.withKind(instance.getKind());
        
        this.withMetadata(instance.getMetadata());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1RoleList build() {
        V1RoleList buildable = new V1RoleList();
        buildable.setApiVersion(fluent.getApiVersion());
        buildable.setItems(fluent.getItems());
        buildable.setKind(fluent.getKind());
        buildable.setMetadata(fluent.getMetadata());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1RoleListBuilder that = (V1RoleListBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
