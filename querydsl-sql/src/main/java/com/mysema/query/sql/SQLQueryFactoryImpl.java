/*
 * Copyright 2011, Mysema Ltd
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.mysema.query.sql;

import java.sql.Connection;

import javax.inject.Provider;

/**
 * Factory class for query and DML clause creation
 *
 * @author tiwe
 *
 */
public class SQLQueryFactoryImpl extends AbstractSQLQueryFactory<SQLQuery> {

    public SQLQueryFactoryImpl(SQLTemplates templates, Provider<Connection> connection) {
        this(new Configuration(templates), connection);
    }

    public SQLQueryFactoryImpl(Configuration configuration, Provider<Connection> connection) {
        super(configuration, connection);
    }

    public SQLQuery query() {
        return new SQLQuery(connection.get(), configuration);
    }

}
