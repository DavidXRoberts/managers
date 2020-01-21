package dev.galasa.kubernetes;

import javax.validation.constraints.NotNull;

/**
 * Kubernetes Namespace 
 *  
 * @author Michael Baylis
 *
 */
public interface IKubernetesNamespace {
    
    @NotNull
    public IResource createResource(@NotNull String yaml) throws KubernetesManagerException;


}