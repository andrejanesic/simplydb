package com.andrejanesic.simplydb.errorhandler;

/**
 * <h1>Error handling component.</h1>
 */
public interface IErrorHandler {

    /**
     * <p>Handles an application exception.</p>
     *
     * @param e Exception caught.
     */
    void handle(Exception e);

    /**
     * <p>Handles an application exception.</p>
     *
     * @param m Exception message.
     */
    void handle(String m);
}
