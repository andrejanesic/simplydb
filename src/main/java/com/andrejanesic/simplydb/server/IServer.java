package com.andrejanesic.simplydb.server;

import com.andrejanesic.simplydb.core.IComponent;

/**
 * <h1>Server component interface.</h1>
 * <ul>
 *     <li>Listens for new input requests from external processes via IPC. Parses input. Creates a new Request object
 * from request input and maps process requests to unique IDs.</li>
 *     <li>Listens for new Response objects from the Exec module. Matches Response ID with process request ID. Returns
 * output to process via IPC.</li>
 *     <li>Handles thread locking. Passes commands to the Exec module.</li>
 * </ul>
 */
public interface IServer extends IComponent {

    /**
     * <p>Start listening for requests on the given port.</p>
     *
     * @param port Number of the port to start listening on.
     */
    void listen(int port);
}
