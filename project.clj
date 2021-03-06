(defproject ntljr "0.1.0"
  :description "wiki-like system with tweet-sized definitions"
  :url "http://github.com/yurizhykin/ntljr"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[prismatic/schema "1.0.3"]
                 ;; [markdown-clj "0.9.78"]
                 [com.novemberain/monger "3.0.1"]
                 ;; [com.stuartsierra/component "0.3.1"]
                 [pandect "0.5.4"]
                 [clj-time "0.11.0"]
                 [compojure "1.4.0"]
                 [hiccup "1.0.5"]
                 [ring "1.4.0"]]
  :main ntljr.main)
