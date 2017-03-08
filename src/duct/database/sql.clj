(ns duct.database.sql
  (:require [integrant.core :as ig]))

(defrecord Boundary [spec])

(defmethod ig/init-key :duct.database/sql [_ spec]
  (->Boundary spec))
