(ns duct.database.sql-test
  (:require [clojure.test :refer [deftest is]]
            [duct.database.sql :as sql]
            [integrant.core :as ig]))

(deftest integrant-key-test
  (let [spec {:jdbcUrl "jdbc:sqlite:"}
        impl (:duct.database/sql (ig/init {:duct.database/sql spec}))]
    (is (instance? javax.sql.DataSource impl))))
