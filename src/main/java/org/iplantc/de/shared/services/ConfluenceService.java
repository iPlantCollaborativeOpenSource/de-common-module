package org.iplantc.de.shared.services;

import com.google.gwt.user.client.rpc.RemoteService;

/**
 * A service interface for interfacing with Confluence (synchronous part).
 * 
 * @author hariolf
 * 
 */
public interface ConfluenceService extends RemoteService {

    /**
     * Creates a new page in the iPlant wiki as a child of the "List of Applications" page.
     * 
     * @param toolName the name of the tool which is used as the page title
     * @param description a tool description
     * @return a URL pointing to the new page
     */
    String addPage(String toolName, String description);
}