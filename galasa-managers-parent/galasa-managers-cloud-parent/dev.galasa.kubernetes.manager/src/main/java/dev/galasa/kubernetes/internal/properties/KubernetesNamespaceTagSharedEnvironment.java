/*
 * Licensed Materials - Property of IBM
 * 
 * (c) Copyright IBM Corp. 2020.
 */
package dev.galasa.kubernetes.internal.properties;

import dev.galasa.framework.spi.ConfigurationPropertyStoreException;
import dev.galasa.framework.spi.cps.CpsProperties;
import dev.galasa.kubernetes.KubernetesManagerException;


/**
 * Kubernetes Tag Shared Environment
 * 
 * @galasa.cps.property
 * 
 * @galasa.name kubernetes.namespace.tag.XXXXXX.shared.environment
 * 
 * @galasa.description Informs the Kubernetes Manager which Shared Environment will be assigned to a Namespace Tag 
 * 
 * @galasa.required No
 * 
 * @galasa.default none
 * 
 * @galasa.valid_values A valid Shared Environment
 * 
 * @galasa.examples 
 * <code>kubernetes.namespace.tag.SHARED.shared.environment=M1</code>
 * 
 */
public class KubernetesNamespaceTagSharedEnvironment extends CpsProperties {

    public static String get(String tag) throws KubernetesManagerException {
        try {
            return getStringNulled(KubernetesPropertiesSingleton.cps(), "namespace.tag." + tag, "shared.environment") ;
        } catch (ConfigurationPropertyStoreException e) {
            throw new KubernetesManagerException("Problem retrieving the shared environment for namespace tag " + tag, e);
        }
    }
}