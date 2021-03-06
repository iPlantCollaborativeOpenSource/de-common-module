/**
 * 
 */
package org.iplantc.de.client.models.deployedComps;

import com.google.web.bindery.autobean.shared.AutoBean.PropertyName;

import java.util.List;

/**
 * @author sriram
 *
 */
public interface DeployedComponentList {

    @PropertyName("components")
    List<DeployedComponent> getDCList();

}
