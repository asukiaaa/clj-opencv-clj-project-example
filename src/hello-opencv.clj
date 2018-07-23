(ns main
  (:import [org.opencv.core Core]))

(defn -main []
  (prn :hello-opencv Core/VERSION))
