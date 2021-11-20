(ns test.core
  (:gen-class))



(def myPositif #{"yeah" "Y" "yes" "OK" "y" "ok" "Yes" "Yeah" "fine" "Fine" "Yep" "yep"})
(def Negatif #{"no" "Nah" "nah" "n" "No" "nope" "nop" "Nope" "Nop" "nay"})
(def park #{"parking" "car" "driving" "drive"})
(def sport #{"sports" "sport" "exercise" "training"})
(def children #{"playground" "child" "children" "family" "son" "daughter"})
(def transport #{"how to go" "going" "transports" "transport"})
(def walk #{" walk" "run" " running" "walking" "hike"})
(def interest #{"what can I do" "activities" "attractions" "interests" "tourism"})
(def bertramka #{:a "Bertramka" :b "bertramka" :c "12"})
(def frantiskanska-zahrada #{:a "11" :b "Frantiskanska Zahrada" :c "frantiskanska zahrada" :d "Frantiskanska zahrada" :e "frantiskanska Zahrada"})
(def obora-hvezda #{:a "10" :b "Obora Hvezda" :c "obora hvezda" :d "Obora hvezda" :e "obora Hvezda"})
(def kampa #{:an "9" :b "Kampa" :c "kampa"})
(def kinskeho-zahrada #{:a "8" :b "Kinskeho Zahrada" :c "kinskeho zahrada"})
(def klamovka #{:a "7" :b "Klamovka" :c "klamovka"})
(def ladronka #{:a "6" :b "Ladronka" :c "ladronka"})
(def letna #{:a "5" :b "Letna" :c "letna"})
(def petrin #{:a "4" :b "Petrin" :c "petrin"})
(def riegrovy-sady #{:a "3" :b "Riegrovy Sady" :c "riegrovy sady" :d "Riegrovy sady"})
(def stromovka #{:a "2" :b "Stromovka" :c "stromovka"})
(def vysehrad #{:a "1" :b "Vysehrad" :c "vysehrad"})
(def exit #{"finish" "Finish" "End" "end" "Exit" "exit" "Stop" "stop" "Bye" "bye" "Quit" "quit" "Leave" "leave"})



(defn not_understand []
  (println "Can you retry please I didn't understand"))



(defn exit-end []
  (println "Do really want to leave ?")
  (let [z (read-line)]
    (cond
      (contains? myPositif z) (println "Ok, have a good day and I hope I will see you soon !"))))

(defn activity []
  (println "What do you want to do today ?")
  (let  [a (read-line)]
    (cond
      (contains? myPositif a) (println "Ok I recommand you to go at a park to do that")
      (contains? exit a) (exit-end))))


(defn joke []
  (println "Do you want to do an Iron-man?")
  (def joke (read-line))
  (println "HAHA it was just a joke don't panic")

;;A Implementer en plus simple
(defn  choice_park []
   (println "I know 12 parks in Prague: 
                     1) Vysehrad
                     2) Stromovka  
                     3) Riegrovy Sady 
                     4) Petrin 
                     5) Letna  
                     6) Ladronka 
                     7) Klamovka   
                     8) Kinskeho Zahrada 
                     9) Kampa  
                    10) Obora Hvezda 
                    11) Frantiskanska Zahrada
                    12) Bertramka"))








(defn discuss_park[]
  (def surname "name")
  (println "Hello ! Welcome to the park discovery chatbot ! What's your name?")
  (def surname (read-line))
  (println (str "Hi  " surname "  nice to meet you"))
  (joke)
  (activity)
  (choice_park))
