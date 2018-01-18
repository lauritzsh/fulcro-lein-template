(ns translations.es (:require fulcro.i18n #?(:cljs cljs.loader)))

;; This file was generated by Fulcro.

(def translations {
  "|(Deep Thought Hums...)" "(Pensamiento profundos ronquidos...)"
  "|The meaning of {what} is {meaning}." "El significado de {what} es {meaning}"
  "|Ask Deep Thought." "Pregunta a Deep Thought"
  "|Ping the server!" "¡Ping el servidor!"
  "|" ""})

(swap! fulcro.i18n/*loaded-translations* assoc "es" translations)
