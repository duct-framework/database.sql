(ns duct.database.sql
  (:require [integrant.core :as ig]))

(derive :duct.database/sql :duct/database)

(defrecord Boundary [spec])

(defmethod ig/init-key :duct.database/sql [_ spec]
  (->Boundary spec))
