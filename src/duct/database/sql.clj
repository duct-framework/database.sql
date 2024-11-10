(ns duct.database.sql
  (:require [integrant.core :as ig]
            [next.jdbc :as jdbc]))

(defmethod ig/init-key :duct.database/sql [_ db-spec]
  (jdbc/get-datasource db-spec))
