# Duct database.sql

[![Build Status](https://travis-ci.org/duct-framework/database.sql.svg?branch=master)](https://travis-ci.org/duct-framework/database.sql)

[Integrant][] methods for connecting to a SQL database from the
[Duct][] framework.

For pooled connections, use [database.sql.hikaricp][].

[integrant]: https://github.com/weavejester/integrant
[duct]: https://github.com/duct-framework/duct
[database.sql.hikaricp]: https://github.com/duct-framework/database.sql.hikaricp

## Installation

To install, add the following to your project `:dependencies`:

    [duct/database.sql "0.1.0-SNAPSHOT"]

## Usage

This library provides two things: a `Boundary` record that holds a
database spec, and a multimethod for `:duct.database/sql` that
initiates a database spec into the `Boundary`.

When you write functions against the database, consider using a
protocol and extending the `Boundary` record. This will allow you to
easily mock or stub out the database using a tool like [Shrubbery][].

[shrubbery]: https://github.com/bguthrie/shrubbery

## License

Copyright © 2017 James Reeves

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
