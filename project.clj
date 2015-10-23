(defproject project-euler "0.1.0-SNAPSHOT"
  :description "Chris Kozak's Solutions to Project Euler Problems"
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :plugins [[lein-midje "3.1.3"]]
  :profiles {:dev {:dependencies [[midje "1.7.0"]]}}
  :aliases {"unit-test" ["midje" "recruitment-service.unit.*"]})
