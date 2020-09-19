(defproject kosa-crux "0.1.0-SNAPSHOT"
  :description "The Pariyatti Library"
  :url "http://github.com/pariyatti/kosa-crux"
  :license {:name "GNU Affero General Public License 3.0"
            :url "https://www.gnu.org/licenses/agpl-3.0.en.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [mount "0.1.16"]
                 [aero "1.1.6"]
                 [bidi "2.1.6"]
                 [ring/ring-core "1.6.3"]
                 [ring/ring-jetty-adapter "1.6.3"]
                 [ring/ring-json "0.5.0"]
                 [org.clojure/data.json "1.0.0"]
                 [juxt/crux-core "20.09-1.11.0-beta"]
                 [juxt/crux-rocksdb "20.09-1.11.0-beta"]]
  :main ^:skip-aot kosa-crux.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
