package com.andrejanesic.simplydb.queries;

/**
 * <h1>Select query.</h1>
 */
public class QuerySelect implements IQuery {

    /**
     * Select list for the query.
     */
    private QuerySelectList selectList;

    public QuerySelect(QuerySelectList selectList) {
        this.selectList = selectList;
    }

    public QuerySelectList getSelectList() {
        return selectList;
    }

    public void setSelectList(QuerySelectList selectList) {
        this.selectList = selectList;
    }

    @Override
    public Type getType() {
        return Type.SELECT;
    }
}
