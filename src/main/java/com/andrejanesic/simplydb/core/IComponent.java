package com.andrejanesic.simplydb.core;

/**
 * <h1>Component interface.</h1>
 * <p>Provides a standardized lifecycle routine for all components.</p>
 */
public interface IComponent {

    /**
     * <p>Called during the initialization stage of the component. Not all app functionality may be available.</p>
     *
     * @return Returns true on graceful exit, false otherwise.
     */
    boolean initialize();

    /**
     * <p>Called in the exiting stage of the process for a graceful shutdown of the component. Not all app functionality
     * may be available.</p>
     *
     * @return Returns true on graceful exit, false otherwise.
     */
    boolean stop();
}
