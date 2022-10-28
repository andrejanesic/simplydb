package com.andrejanesic.simplydb;

import com.andrejanesic.simplydb.config.IConfig;
import com.andrejanesic.simplydb.core.IApp;
import com.andrejanesic.simplydb.errorhandler.IErrorHandler;
import com.andrejanesic.simplydb.server.IServer;

/**
 * Main thread of the database.
 */
public class Main extends IApp {
    public Main(IErrorHandler errorHandler, IConfig config, IServer server) {
        super(errorHandler, config, server);
    }
}
