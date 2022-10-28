package com.andrejanesic.simplydb.storage;

import com.andrejanesic.simplydb.core.IComponent;

import java.util.Map;

/**
 * <h1>Storage component.</h1>
 * <p>Handles operations on permanent memory.</p>
 */
public interface IStorage extends IComponent {

    /**
     * <p>Loads the config file from the given source path.</p>
     *
     * @param path Path to the config file.
     * @return Config keys and values as a map.
     */
    Map<String, String> loadConfig(String path);

    /**
     * <p>Saves the config into a file.</p>
     *
     * @param config Config as a map.
     */
    void saveConfig(Map<String, String> config);
}
