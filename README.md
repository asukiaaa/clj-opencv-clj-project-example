# clj-opencv-clj-project-example
Clojure application to use opencv on clj project repository.

# Requirement

## clj command
[clj](https://clojure.org/guides/getting_started) environment.

## OpenCV

### Build OpenCV
```
sudo apt install cmake ant openjdk-8-jdk
mkdir ~/gitprojects
cd ~/gitprojects
git clone https://github.com/opencv/opencv.git opencv_source
cd opencv_source
git checkout tags/3.4.2
mkdir build
cd build
export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/
cmake -D BUILD_SHARED_LIBS=OFF ..
make -j4
```

## Include OpenCV
```
cd [thir project dir]
mkdir lib
cp ~/gitprojects/opencv_source/build/lib/libopencv_java342.so lib/
cp ~/gitprojects/opencv_source/build/bin/opencv-342.jar lib/
```

# Usage
Show version
```
clj -O:local-opencv -m hello-opencv
```

Show width and height of an image from a camera.
```
clj -O:local-opencv -m main
```

# References
- [Maven Repository: OpenPnP OpenCV](https://mvnrepository.com/artifact/org.openpnp/opencv)
- [OpenCV で顔画像認識（ネイティブライブラリを含む Java ライブラリを Leiningen で使う）](http://tnoda-clojure.tumblr.com/post/104179135029/opencv-%E3%81%A7%E9%A1%94%E7%94%BB%E5%83%8F%E8%AA%8D%E8%AD%98%E3%83%8D%E3%82%A4%E3%83%86%E3%82%A3%E3%83%96%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA%E3%82%92%E5%90%AB%E3%82%80-java-%E3%83%A9%E3%82%A4%E3%83%96%E3%83%A9%E3%83%AA%E3%82%92-leiningen)
- [Your First Java Application with OpenCV](https://opencv-java-tutorials.readthedocs.io/en/latest/02-first-java-application-with-opencv.html)
- [How to pass :jvm-opts to clj from terminal?](https://clojureverse.org/t/how-to-pass-jvm-opts-to-clj-from-terminal/1940)
