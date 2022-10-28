package com.andrejanesic.simplydb.queries;

/**
 * <h1>Right bracket ")" in a query.</h1>
 */
public class QueryBracketRight implements IQuery {

    @Override
    public Type getType() {
        return Type.BRACKET_RIGHT;
    }
}
