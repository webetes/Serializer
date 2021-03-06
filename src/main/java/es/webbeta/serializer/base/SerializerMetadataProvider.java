package es.webbeta.serializer.base;

import es.webbeta.serializer.type.FieldAccessType;

public interface SerializerMetadataProvider {
    Boolean canProvide(Class<?> klass);
    String[] getPropertiesByGroup(Class<?> klass, ParentFieldData parentData, String... group);
    String[] getGroupsByFieldName(Class<?> klass, String fieldName);
    Boolean hasPropertyAccessType(Class<?> klass, String propertyName);
    FieldAccessType getPropertyAccessType(Class<?> klass, String propertyName);
    String getPropertyCustomGetterName(Class<?> klass, String propertyName);
    Boolean hasPropertySerializedName(Class<?> klass, String propertyName);
    String getPropertySerializedName(Class<?> klass, String propertyName);
    Boolean isVirtualProperty(Class<?> klass, String propertyName);
    Boolean hasAccessType(Class<?> klass);
    FieldAccessType getAccessType(Class<?> klass);
}
