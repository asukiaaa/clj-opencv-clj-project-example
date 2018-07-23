(ns main
  (:import [org.opencv.core Core Mat]
           [org.opencv.videoio VideoCapture]))

(clojure.lang.RT/loadLibrary Core/NATIVE_LIBRARY_NAME)

(def mat-frame (new Mat))
(def cv-camera (new VideoCapture 0))

(defn -main []
  (prn :hello-opencv Core/VERSION Core/NATIVE_LIBRARY_NAME)
  (.read cv-camera mat-frame)
  (prn :camera-image-size (.cols mat-frame) (.rows mat-frame)))
