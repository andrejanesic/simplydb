package com.andrejanesic.simplydb.queries;

/**
 * <h1>Left bracket "(" in a query.</h1>
 */
public class QueryBracketLeft implements IQuery {

    @Override
    public Type getType() {
        return Type.BRACKET_LEFT;
    }
}
