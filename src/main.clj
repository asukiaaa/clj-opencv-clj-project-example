(ns main
  (:import [org.opencv.core Core Mat]
           [org.opencv.videoio VideoCapture]))
(prn org.opencv.core.Core/NATIVE_LIBRARY_NAME)
(prn (System/getProperty "java.library.path"))
;(System/exit 0)

(clojure.lang.RT/loadLibrary org.opencv.core.Core/NATIVE_LIBRARY_NAME)

(def mat-frame (new Mat))
(def cv-camera (new VideoCapture 0))

(defn -main []
  (prn :hello-opencv Core/VERSION Core/NATIVE_LIBRARY_NAME)
  (.read cv-camera mat-frame)
  (prn :camera-image-size (.cols mat-frame) (.rows mat-frame)))
