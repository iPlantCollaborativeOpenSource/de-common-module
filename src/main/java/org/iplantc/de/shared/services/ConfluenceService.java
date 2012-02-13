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

    /**
     * Adds a user comment to a tool description page.
     * 
     * @param toolName the name of the tool which is also the page title
     * @param comment a comment
     * @return the comment ID generated by Confluence
     */
    String addComment(String toolName, String comment);

    /**
     * Removes a user comment from a tool description page.
     * 
     * @param toolName the name of the tool which is also the page title
     * @param commentId the comment ID in Confluence
     */
    void removeComment(String toolName, Long commentId);
}
