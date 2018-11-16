(ns fusoya.core
  (:require [ring.adapter.jetty :refer [run-jetty]]
            [ring.util.response :refer [redirect]]
            [environ.core :refer [env]]
            [clojure.pprint :refer [pprint]])
  )

(defn handler [req]
  (pprint req)
  (redirect (str (env :destination-host) (:uri req)) :moved-permanently))

(defn -main [& [port]]
  (let [port (Integer. (or port (env :port) 5000))]
    (run-jetty handler {:port port :join? false})))
