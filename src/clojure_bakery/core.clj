(ns clojure-bakery.core
	(:require [clojure.edn :as edn])
  (:gen-class))


(defn fib [n]
	(cond
	 (= n 0) n
	 (= n 1) n
	 :else (+ (fib (- n 1)) (fib (- n 2)))))

(defn -main
  [number]
  (println (fib (edn/read-string number)))
  (println "Hello, World!"))
