package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ScaleIOPersistentVolumeSourceBuilder extends io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluentImpl<io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource,io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceBuilder> {

    io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ScaleIOPersistentVolumeSourceBuilder() {
        this(true);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ScaleIOPersistentVolumeSource(), validationEnabled);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ScaleIOPersistentVolumeSource(), validationEnabled);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource instance) {
        this(fluent, instance, true);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSourceFluent<?> fluent,io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withFsType(instance.getFsType());
        
        fluent.withGateway(instance.getGateway());
        
        fluent.withProtectionDomain(instance.getProtectionDomain());
        
        fluent.withReadOnly(instance.getReadOnly());
        
        fluent.withSecretRef(instance.getSecretRef());
        
        fluent.withSslEnabled(instance.getSslEnabled());
        
        fluent.withStorageMode(instance.getStorageMode());
        
        fluent.withStoragePool(instance.getStoragePool());
        
        fluent.withSystem(instance.getSystem());
        
        fluent.withVolumeName(instance.getVolumeName());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource instance) {
        this(instance,true);
    }

    public V1ScaleIOPersistentVolumeSourceBuilder(io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withFsType(instance.getFsType());
        
        this.withGateway(instance.getGateway());
        
        this.withProtectionDomain(instance.getProtectionDomain());
        
        this.withReadOnly(instance.getReadOnly());
        
        this.withSecretRef(instance.getSecretRef());
        
        this.withSslEnabled(instance.getSslEnabled());
        
        this.withStorageMode(instance.getStorageMode());
        
        this.withStoragePool(instance.getStoragePool());
        
        this.withSystem(instance.getSystem());
        
        this.withVolumeName(instance.getVolumeName());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ScaleIOPersistentVolumeSource build() {
        V1ScaleIOPersistentVolumeSource buildable = new V1ScaleIOPersistentVolumeSource();
        buildable.setFsType(fluent.getFsType());
        buildable.setGateway(fluent.getGateway());
        buildable.setProtectionDomain(fluent.getProtectionDomain());
        buildable.setReadOnly(fluent.getReadOnly());
        buildable.setSecretRef(fluent.getSecretRef());
        buildable.setSslEnabled(fluent.getSslEnabled());
        buildable.setStorageMode(fluent.getStorageMode());
        buildable.setStoragePool(fluent.getStoragePool());
        buildable.setSystem(fluent.getSystem());
        buildable.setVolumeName(fluent.getVolumeName());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ScaleIOPersistentVolumeSourceBuilder that = (V1ScaleIOPersistentVolumeSourceBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
