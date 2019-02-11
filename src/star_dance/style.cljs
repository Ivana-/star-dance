(ns star-dance.style
  (:require
   [garden.core :as garden]))

(defn style [css] [:style (garden/css css)])
