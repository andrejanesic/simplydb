package com.andrejanesic.simplydb.config;

import com.andrejanesic.simplydb.core.IComponent;

/**
 * <h1>Configuration component.</h1>
 * <p>Manipulates and stores the process configuration.</p>
 */
public interface IConfig extends IComponent {

    /**
     * <p>Configuration value for the given key.</p>
     *
     * @param key Key to look for.
     * @return Value if found or null.
     */
    String get(String key);

    /**
     * <p>Configuration value for the given key, or default value if not found.</p>
     *
     * @param key Key to look for.
     * @param val Value to return if not found.
     * @return Value if found or default value if not found.
     */
    String get(String key, String val);

    /**
     * <p>Configuration value for the given key, or default value if not found. Alias of <code>get()</code> method.</p>
     *
     * @param key Key to look for.
     * @param val Value to return if not found.
     * @return Value if found or default value if not found.
     */
    default String getOrDefault(String key, String val) {
        return get(key, val);
    }

    /**
     * <p>Sets the configuration value for the given key.</p>
     *
     * @param key Key to set.
     * @param val New value.
     */
    void set(String key, String val);
}
