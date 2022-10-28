package com.andrejanesic.simplydb.config.standard;

import com.andrejanesic.simplydb.config.IConfig;
import com.andrejanesic.simplydb.core.IApp;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Default implementation of the Config component.</h1>
 */
public class ConfigStandard implements IConfig {

    /**
     * Map of config values.
     */
    private Map<String, String> config = new HashMap<>();

    /**
     * Application reference.
     */
    private final IApp app;

    /**
     * Source where the config is loaded from.
     */
    private final String src;

    public ConfigStandard(IApp app, String src) {
        this.app = app;
        this.src = src;
    }

    @Override
    public String get(String key) {
        return this.config.get(key);
    }

    @Override
    public String get(String key, String val) {
        return this.config.getOrDefault(key, val);
    }

    @Override
    public void set(String key, String val) {
        this.config.put(key, val);
    }

    @Override
    public boolean initialize() {
        Map<String, String> configLoaded = app.getStorage().loadConfig(src);
        if (configLoaded == null) {
            app.getErrorHandler().handle(
                    "Storage loaded null config for config handler on path: " + src
            );
            return false;
        }

        // TODO check all keys here for malicious settings

        config = configLoaded;
        return true;
    }

    @Override
    public boolean stop() {
        return false;
    }
}
