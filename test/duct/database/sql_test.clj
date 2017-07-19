(ns duct.database.sql-test
  (:require [clojure.test :refer :all]
            [duct.database.sql :as sql]
            [integrant.core :as ig]))

(deftest key-derive-test
  (is (isa? :duct.database/sql :duct/database)))

(deftest integrant-key-test
  (let [spec {:connection-uri "jdbc:sqlite:"}
        impl (:duct.database/sql (ig/init {:duct.database/sql spec}))]
    (is (instance? duct.database.sql.Boundary impl))
    (is (= (:spec impl) spec))))
