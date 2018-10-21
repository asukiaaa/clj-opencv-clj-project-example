(ns hello-opencv
  (:import [org.opencv.core Core]))

;(clojure.lang.RT/loadLibrary Core/NATIVE_LIBRARY_NAME)

(defn -main []
  (prn :hello-opencv Core/VERSION Core/NATIVE_LIBRARY_NAME))
