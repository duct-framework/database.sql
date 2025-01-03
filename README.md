# Duct database.sql [![Build Status](https://github.com/duct-framework/database.sql/actions/workflows/test.yml/badge.svg)](https://github.com/duct-framework/database.sql/actions/workflows/test.yml)

[Integrant][] methods for connecting to a SQL database from the
[Duct][] framework.

For pooled connections, use [database.sql.hikaricp][].

[integrant]: https://github.com/weavejester/integrant
[duct]: https://github.com/duct-framework/duct
[database.sql.hikaricp]: https://github.com/duct-framework/database.sql.hikaricp

## Installation

Add the following dependency to your deps.edn file:

    org.duct-framework/database.sql {:mvn/version "0.4.0"}

Or to your Leiningen project file:

    [org.duct-framework/database.sql "0.4.0"]

## Usage

This library provides an `init-key` method for `:duct.database/sql` that
creates a [DataSource][]. The key takes the same argument map as the
`get-datasource` function from [next.jdbc][].

```edn
{:duct.database/sql {:jdbcUrl "jdbc:sqlite:db/example.sqlite"}}
```

When you write functions against the database, consider using a
protocol and extending the DataSource class. This will allow you to
easily mock or stub out the database using a tool like [Shrubbery][].

[datasource]: https://docs.oracle.com/en/java/javase/17/docs/api/java.sql/javax/sql/DataSource.html
[next.jdbc]: https://github.com/seancorfield/next-jdbc
[shrubbery]: https://github.com/bguthrie/shrubbery

## License

Copyright © 2024 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
