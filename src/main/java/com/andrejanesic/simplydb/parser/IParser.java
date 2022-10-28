package com.andrejanesic.simplydb.parser;

import com.andrejanesic.simplydb.core.IComponent;
import com.andrejanesic.simplydb.queries.IQuery;

/**
 * <h1>Parser component.</h1>
 * <p>Parses incoming input into queries.</p>
 */
public interface IParser extends IComponent {

    /**
     * <p>Parses queries into IQuery templates for execution.</p>
     *
     * @param query Raw string query to be parsed.
     * @return IQuery if valid query, null otherwise.
     */
    IQuery parse(String query);
}
