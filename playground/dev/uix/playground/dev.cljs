(ns uix.playground.dev
  (:require [uix.dev]))

(uix.dev/init-fast-refresh!)

(defn ^:dev/after-load refresh []
  (uix.dev/refresh!))
