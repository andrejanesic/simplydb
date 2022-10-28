package com.andrejanesic.simplydb.queries;

/**
 * <h1>Query interface.</h1>
 * <p>Template for query routines.</p>
 */
public interface IQuery {

    /**
     * Possible states of the parser. Used for the command heap.
     */
    enum Type {
        SELECT,
        SELECT_LIST,
        FROM,
        TABLE_SOURCE,
        BRACKET_LEFT,
        BRACKET_RIGHT,
    }

    /**
     * <p>Type of the query.</p>
     *
     * @return Type of the query.
     */
    Type getType();
}
