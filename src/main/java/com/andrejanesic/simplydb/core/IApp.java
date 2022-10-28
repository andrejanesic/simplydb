package com.andrejanesic.simplydb.core;

import com.andrejanesic.simplydb.config.IConfig;
import com.andrejanesic.simplydb.errorhandler.IErrorHandler;
import com.andrejanesic.simplydb.server.IServer;
import com.andrejanesic.simplydb.storage.IStorage;

/**
 * <h1>Application framework component.</h1>
 * <p>Unifies all component together. The "glue" between components for communicating.</p>
 */
public abstract class IApp {

    /**
     * Error handler component.
     */
    private final IErrorHandler errorHandler;

    /**
     * Config component.
     */
    private final IConfig config;

    /**
     * Server component.
     */
    private final IServer server;

    /**
     * Storage component.
     */
    private final IStorage storage;

    /**
     * <p>Default constructor. Sets component references without initializing.</p>
     *
     * @param errorHandler Error handler component implementation instance.
     * @param config       Config handler component implementation instance.
     * @param server       Server component implementation instance.
     * @param storage      Storage component implementation instance.
     */
    public IApp(IErrorHandler errorHandler, IConfig config, IServer server, IStorage storage) {
        this.errorHandler = errorHandler;
        this.config = config;
        this.server = server;
        this.storage = storage;
    }

    /**
     * Main application routine.
     */
    public void run() {
        try {
            server.listen(Integer.parseInt(config.get("port")));
        } catch (Exception e) {
            errorHandler.handle(e);
        }
    }

    public IErrorHandler getErrorHandler() {
        return errorHandler;
    }

    public IConfig getConfig() {
        return config;
    }

    public IServer getServer() {
        return server;
    }

    public IStorage getStorage() {
        return storage;
    }
}
