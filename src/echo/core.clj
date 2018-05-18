(ns echo.core
  (:require [ring.adapter.jetty :as jetty]
            [clojure.pprint :as pprint])
  (:gen-class))


(defn handler [request]
  (let [s (with-out-str (pprint/pprint (conj request {:body (slurp (:body request))})))]
    {:status 200
     :header {"Content-Type" "text/plain"}
     :body   s}))

(defn -main []
  (jetty/run-jetty handler {:port 3000}))

