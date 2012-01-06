(ns test7.core
  [:use [ring.util.response :only (response)]])

(defn -main [& args]
  (println (response { :uri "/foo/bar" })))
