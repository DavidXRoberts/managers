package dev.galasa.common.openstack.manager.internal.properties;

import dev.galasa.common.openstack.manager.OpenstackManagerException;
import dev.galasa.framework.spi.cps.CpsProperties;

/**
 * OpenStack Maximum Compute Instances
 * <p>
 * This property restricts the maximum number of instances the OpenStack Manager 
 * can create across all tests. 
 * </p><p>
 * The property is:-<br><br>
 * openstack.server.maximum.compute.instances=9 
 * </p>
 * <p>
 * default value is 2 instaces
 * </p>
 * 
 * @author Michael Baylis
 *
 */
public class MaximumInstances extends CpsProperties {
	
	public static int get() throws OpenstackManagerException {
		return getIntWithDefault(OpenstackPropertiesSingleton.cps(), 
				                 2, 
				                 "server", 
				                 "maximum.compute.instances");
	}

}