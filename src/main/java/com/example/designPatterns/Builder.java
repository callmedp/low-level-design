package com.example.designPatterns;

import java.util.Optional;

public class Builder {

    public static class Build {

        private String protocol;
        private String hostname;
        private String port;
        private String pathParams;
        private String queryParams;


        public Build protocol(String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Build hostname(String hostname) {
            this.hostname = hostname;
            return this;
        }

        public Build port(String port) {
            this.port = port;
            return this;
        }

        public Build pathParams(String pathParams) {
            this.pathParams = pathParams;
            return this;
        }

        public Build queryParams(String queryParams) {
            this.queryParams = queryParams;
            return this;
        }

        public Builder build() {
            return new Builder(this);
        }

    }

    private String port;
    private String hostname;
    private String protocol;
    private String pathParams;
    private String queryParams;

    private Builder(Build build) {
        this.port = build.port;
        this.hostname = build.hostname;
        this.protocol = build.protocol;
        this.pathParams = build.pathParams;
        this.queryParams = build.queryParams;
    }

    private String notNull(String field) {
        return Optional.ofNullable(field).orElse("");
    }

    @Override
    public String toString() {
        return notNull(this.protocol) + notNull(this.hostname) + notNull(this.port) + notNull(this.pathParams) + notNull(this.queryParams);
    }
}
