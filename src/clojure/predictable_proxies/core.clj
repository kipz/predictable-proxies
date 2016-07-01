(ns predictable-proxies.core
  (:gen-class)
  (:import (predictable_proxies StatefulOverlord)))

(def p (proxy [StatefulOverlord] []
         (m1 []
           (println "I'm not sure."))
         (m2 []
           (println "I'm not sure."))))