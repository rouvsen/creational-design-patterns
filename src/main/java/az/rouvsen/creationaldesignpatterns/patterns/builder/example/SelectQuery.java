package az.rouvsen.creationaldesignpatterns.patterns.builder.example;

// Product
public class SelectQuery {
    private String select;
    private String from;
    private String where;
    private String orderBy;
    private int limit;

    private SelectQuery() {
        this.limit = -1; // Default value for the limit (no limit)
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public static QueryBuilder builder() {
        return new QueryBuilder();
    }

    @Override
    public String toString() {
        StringBuilder query = new StringBuilder();
        query.append("SELECT ").append(select).append(" ")
                .append("FROM ").append(from).append(" ");

        if (where != null) {
            query.append("WHERE ").append(where).append(" ");
        }

        if (orderBy != null) {
            query.append("ORDER BY ").append(orderBy).append(" ");
        }

        if (limit > 0) {
            query.append("LIMIT ").append(limit).append(" ");
        }

        return query.toString().trim();
    }

    // Add your builder class here as a static inner class
    public static class QueryBuilder {

        private final SelectQuery query = new SelectQuery();

        private QueryBuilder(){}

        public QueryBuilder select(String select) {
            query.setSelect(select);
            return this;
        }

        public QueryBuilder from(String from) {
            query.setFrom(from);
            return this;
        }

        public QueryBuilder where(String where) {
            query.setWhere(where);
            return this;
        }

        public QueryBuilder orderBy(String orderBy) {
            query.setOrderBy(orderBy);
            return this;
        }

        public QueryBuilder limit(int limit) {
            query.setLimit(limit);
            return this;
        }

        public SelectQuery build() {
            return this.query;
        }

    }
}

