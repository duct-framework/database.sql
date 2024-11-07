(ns duct.database.sql
  (:require [integrant.core :as ig]
            [next.jdbc :as jdbc]))

(defrecord Boundary [datasource])

(defmethod ig/init-key :duct.database/sql [_ db-spec]
  (->Boundary (jdbc/get-datasource db-spec)))
