(ns clj-djl.dataset.functional
  (:require
   [tech.v3.datatype.export-symbols :refer [export-symbols]]))

(export-symbols tech.v3.datatype.functional
                +
                -
                *
                /
                mean
                standard-deviation)

(def std standard-deviation)
