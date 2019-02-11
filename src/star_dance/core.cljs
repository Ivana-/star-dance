(ns star-dance.core
  (:require [reagent.core :as r]
            [star-dance.config :as config]
            [graph-view.core :as graph-view]))

#_(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
    (swap! app-state update-in [:__figwheel_counter] inc))

(defn ^:export init []
  (when config/debug?
    (enable-console-print!)
    (println "dev mode"))
  (r/render [graph-view/main-page] (.getElementById js/document "app")))
