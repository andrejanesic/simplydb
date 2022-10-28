package com.andrejanesic.simplydb.queries;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <h1>Select list query.</h1>
 */
public class QuerySelectList implements IQuery {

    /**
     * Set of columns for the select list.
     */
    private Set<String> columns;

    public QuerySelectList(Set<String> columns) {
        this.columns = columns;
    }

    public QuerySelectList() {
        this(new HashSet<>());
    }

    @Override
    public Type getType() {
        return Type.SELECT_LIST;
    }

    public Set<String> getColumns() {
        return columns;
    }

    public void setColumns(Set<String> columns) {
        this.columns = columns;
    }

    /**
     * <p>Adds all passed columns to the query.</p>
     *
     * @param columns Column names to add.
     */
    public void addColumns(String... columns) {
        this.columns.addAll(Arrays.asList(columns));
    }

}
