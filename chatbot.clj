(ns testprojet.core
  (:gen-class))

;;All the definition/librairies

(def Positive #{"yeah" "Y" "yes" "OK" "y" "ok" "Yes" "Yeah" "fine" "Fine" "Yep" "yep"})
(def No #{"N" "n" "No" "NO" "no" "Nope" "NOPE" "nope" "nop" "Nop" "NOP"})
(def theactivity #{"walk" "Walk" "WALK" "walks" "WALKS" "Walks" "sport" "SPORT" "Sport" "Sports" "sports" "SPORTS" "skiing" "Skiing" "SKIING" "ski" "SKI" "Ski" "run" "Run" "RUN" "running" "Running" "RUNNING" "dogs" "Dogs" "DOGS" "dog" "Dog" "DOG" "restaurants" "Restaurants" "RESTAURANTS" "restaurant" "Restaurant" "RESTAURANT" "playground" "Playground" "PLAYGROUND" "playgrounds" "Playgrounds" "PLAYGROUNDS" "parking" "Parking" "PARKING" "Parkings" "parkings" "PARKINGS" "biking" "Biking" "BIKING"  "wc" "WC" "Wc" "attraction" "Attraction" "ATTRACTION" "attractions" "Attractions" "ATTRACTIONS" "bike" "Bike" "BIKE" "bikes" "Bikes" "BIKES"})
(def bertramka #{ "bertramka" "BERTRAMKA" "Bertramka"})
(def frantiskanska-zahrada #{"frantiskanska-zahrada" "Frantiskanska-Zahrada" "frantiskanska-Zahrada" "Frantiskanska-zahrada" "FRANTISKANSKA-ZAHRADA" "frantiskanska"  "FRANTISKANSKA" "Frantiskanska" "frantiskanskazahrada" "FRANTISKANSKAZAHARADA" })
(def obora-hvezda #{"obora-hvezda" "Obora-hvezda" "obora-Hvezda" "OBORA-HVEZDA" "obora" "OBORA" "Obora" "hvzeda" "Hvzeda" "HVZEDA" "oborahvzeda" "OBORAHVZEDA" "OBORA HVZEDA" "Oborahvzeda" "obora hvzeda"})
(def kampa #{ "kampa" "KAMPA" "Kampa"})
(def kinskeho-zahrada #{"kinskeho-zahrada" "Kinskeho-zahrada" "kinskeho-Zahrada" "KINSEHO-ZAHRADA" "Kinseho" "kinseho" "KINSEHO" "kinseho zahrada" "Kinseko zahrada" "kinseko Zahrada" "KINSEHO ZAHRADA" "kinsehozahrada" "Kinsehozahrada" "KINSEHOZAHRADA" "kinskeho zahrada" })
(def klamovka #{"klamovka" "Klamovka" "KLAMOVKA"})
(def ladronka #{ "ladronka" "Ladronka" "LADRONKA"})
(def letna #{"letna" "LETNA" "Letna"})
(def petrin #{"petrin" "Petrin" "PETRIN"})
(def stromovka #{"stromovka" "Stromovka" "STROMOVKA"})
(def vysehrad #{ "vysehrad" "Vysehrad" "VYSEHRAD"})
(def riegrovy-sady #{"riegrovy-sady" "Riegrovy-sady" "riegrovy-Sady" "RIEGROVY-SADY" "riegrovy sady" "Riegrovy sady" "riegrovy Sady" "RIEGROVY SADY" "riegrovysady" "Riegrovysady" "RIEGROVYSADY" "riegrovy" "Riegrovy" "RIEGTOVY" "sady" "Sady" "SADY"})
(def exit #{"finish" "Finish" "End" "end" "Exit" "exit" "Stop" "stop" "Bye" "bye" "Quit" "quit" "Leave" "leave"})
(def girl #{"girl" "Girl" "GIRL" "girls" "Girls" "GIRLS" "woman" "Woman" "WOMAN" "womans" "Womans" "WOMANS"})
(def boy #{"boy" "BOY" "Boy" "BOYS" "boys" "Boys" "man" "MEN" "men" "Men" "MAN" "Man"})
(def monster #{"monster" "Monster" "MONSTER" "monsters" "MONSTERS" "Monsters"})
(def top #{"top" "Top" "TOP" "tops" "Tops" "TOPS" "TP" "tp" "Tp"})
(def jgl #{"jungle" "Jungle" "JUNGLE" "jgl" "Jgl" "JGL" "jungles" "Jungles" "JUNGLES" "jgls" "Jgls" "JGLS"})
(def mid #{"mid" "Mid" "MID" "mids" "Mids" "MIDS"})
(def supp #{"supp" "Supp" "SUPP" "sup" "Sup" "SUP" "SUPPS" "Supps" "supps" "support" "SUPPORT" "Support" "Supports" "SUPPORTS" "supports"})
(def again #{"Again" "again" "AGAIN"})




;;All the function I use in the programm
(defn not_understand []
  (println "Can you retry please I didn't understand")
  (ParkActivities))

(defn not_understand2 []
  (println "Can you retry please I didn't understand")
  (ixtalstart))

(defn not_understand3 []
  (println "Can you retry please I didn't understand")
  (deductionixtal1))


(defn not_understand4 []
  (println "Can you retry please I didn't understand")
  (deductionixtal2))





;;The exit function that will end the program
(defn exit-end []
  (println "Do really want to leave ?")
  (let [w (read-line)]
    (cond
      (contains? Positive w) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")
      (contains? No w) (ParkActivities))))

(defn end []
  (println "Do really want to leave ?")
  (let [w (read-line)]
    (cond
      (contains? Positive w) (println "Thanks you and I hope to see you soon")
      (contains? No w) (discusspark))))



(defn exit-end2 []
  (println "Do really want to leave ?")
  (let [r (read-line)]
    (cond
      (contains? Positive r) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")
      (contains? No r) (ixtalstart))))

(defn exit-end3 []
  (println "Do really want to leave ?")
  (let [r (read-line)]
    (cond
      (contains? Positive r) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")
      (contains? No r) (deductionixtal1))))

(defn exit-end4 []
  (println "Do really want to leave ?")
  (let [r (read-line)]
    (cond
      (contains? Positive r) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")
      (contains? No r) (deductionixtal2))))

(defn exit-end5 []
  (println "Do really want to leave ?")
  (let [r (read-line)]
    (cond
      (contains? Positive r) (println "Ok, if you want more information restart the chatbot or, have a good day and I hope I will see you soon !")
      (contains? No r) (deductionixtal3))))




;;Function that will ask wich activity the user wants to do
(defn activity []
  (println "What do you want to do today ?")
  (let  [v (read-line)]
    (cond
      (contains? theactivity v) (println "Ok I recommand you to go at a park to do that")
      (contains? exit v) (exit-end))))


(defn Joke []
  (println "Do you want to do an Iron-man?")
  (def joke (read-line))
  (println "HAHA it was just a joke don't panic"))


;;function that will ask to choose from wich park the user wants more information
(defn  choice_park []
  (println "I know 12 parks in Prague, to have information about a park write the name of the park: 
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

;;This function will return an answer of all the activity for each park
(defn ParkActivities []
  (choice_park)
  (let [c (read-line)]
    (cond
      (contains? bertramka c) (println "So the activities you can do in this park are: walk, biking, parking, attraction like cultural monument, classical music concerts, social events, W. A. ​​Mozart Museum and trams No. 4, 7, 9, 10, 58, 59")
      (contains? frantiskanska-zahrada c) (println "So the activities you can do in this park are: walk, biking, playground, wc, attraction like Church of Our Lady of the Snows and Václavské náměstí trams. No. 3, 9, 14, 24, 51, 52, 54, 55, 56, 58, metro A, B Můstek")
      (contains? obora-hvezda c) (println "So the activities you can do in this park are: walk, biking, skiing, playground, dogs, parking, wc, attraction like memorial trees, nature trail, nature attractions and Nad Markétou, bus no. 179, 184, 191, 510, Libocká - bus no. 179, 510, Vypich, tram no. 15, 22, 25, 57")
      (contains? kampa c) (println "So the activities you can do in this park are: walk, biking, skating, playground, wc, attraction like view of the Vltava, Sovovy Mlýny Gallery, Čertovka, Charles Bridge, Werich House, memorial trees and Hellichova tram no. 12, 20, 22, 23, 57, Újezd ​​tram no. 6, 9, 22, 23, 57, 58, 59")
      (contains? kinskeho-zahrada c) (println "So the activities you can do in this park are: walk, playground, parking, wc, attraction like museum,ornamental lakes, natural attraction - Petrin Rocks and Kobrova - BUS No. 176")
      (contains? klamovka c) (println "So the activities you can do in this park are: walk, biking, sport, dogs, restaurant, playground, wc, attraction like art gallery, historical attractions, music club and Klamovka - BUS No. 149, 191, 217, tram No. 4, 7, 9, 10, 58, 59")
      (contains? ladronka c) (println "So the activities you can do in this park are: walk, biking, parking, skating, restaurant, playground, dogs, wc, attraction like extensive leisure area, music and entertainment events and U Ladronky, Rozýnova, Štefkova BUS No. 191, Vypich BUS No. 108, 174, 180, 191, I3, tram No. 15, 22, 25, 57")
      (contains? letna c) (println "So the activities you can do in this park are: walk, biking, playground, dogs, restaurant, skating, parking, wc, attraction like extensive leisure area, cultural events and Letenské náměstí and Sparta tram no. 1, 8, 15, 25, 26, 51, 56, Čechův most tram no. 12, 17, 53, Chotkovy sady tram no. 18, 20, 57, metro Hradčanská")
      (contains? petrin c) (println "So the activities you can do in this park are: walk, biking, parking, playground, restaurant, skating, wc,attraction like lookout tower, maze, observatory, underground galleries and fruit orchards and Újezd ​​tram no. 6, 9, 12, 20, 22, 23, 57, 58, 59, Hellichova tram no. 12, 20, 22, 23, 57, Pohořelec tram no. 22, 23, Dormitories Strahov BUS No. 143, 149, 217")
      (contains? riegrovy-sady c) (println "So the activities you can do in this park are: walk, biking, dogs, playground, restaurant, sport, wc attraction like view of Prague, classicist lookout tower, three-sided obelisk and Metro Jiřího z Poděbrad, Na Smetance Bus no. 135, Italská and Vinohradská tržnice tram no. 11")
      (contains? stromovka c) (println "So the activities you can do in this park are: walk, biking, skating, sport, parking, playgorund, dogs, restaurant, wc attraction like zoo, botanical gardens, natural attractions, planetarium, exhibition grounds and Výstaviště, tram no. 5, 12, 14, 15, 17, 53, 54, Sibiřské nám., Bus no. 131, by steamer from Rašínov nábř")
      (contains? vysehrad c) (println "So the activities you can do in this park are: walk, biking, parking, sport, playground, wc, attraction like sightseeing, museum, cemetery of famous personalities Slavín, national cultural monument and Vyšehrad - metro C, Podolská vodárna tram no. 3, 16, 17, 21, 52"
      (contains? exit c) (exit-end)
      :else (not_understand)))))

(defn the-exit []
  (ParkActivities)
  (println "If you want to choose only one other park just say xd or if you want to choose more than 1 park restart me.")
  (let [w (read-line)]
    (cond
      (contains? again w) (ParkActivities)
      :else (end))))



(defn ixtalstart []
  (println "So you are interested in champion of ixtal. I will find the champion of ixtal for you")
  (let [u (read-line)]
    (cond
      (contains? Positive u) (println "Ok, if you want more information just continue to use the chatbot")
      (contains? No u) (println "Ok, if you want information about them just restart the chatbot ")
      (contains? exit u) (exit-end2)
      :else (not_understand2))))

;;entre champion de demacia couleur fille mec monstre le poste 


type = (defn deductionixtal1 []
  (ixtalstart)
  (println "Ok, the champion you're thinking of is that a girl, a boy or a monster")
    (let [t (read-line)]
    (cond
      (contains? monster t) (println "Ok, so it's a monster")
      (contains? girl t) (println "Ok, so it's a girl")
      (contains? boy t) (println "Ok, so it's a boy ")
      (contains? exit t) (exit-end3)
      :else (not_understand3))))

(defn deductionixtal2 []
  (println "Ok, the champion you're thinking is on wich way most of the time?")
    (let [s (read-line)]
      (cond
        (contains? top s) ((println "Ok, so it's a top laner") (s) )
        (contains? jgl s) (println "Ok, so it's a jungle")
        (contains? mid s) (println "Ok, so it's a mid laner ")
        (contains? supp s) (println "Ok, so it's a support ")
        (contains? exit s) (exit-end4)
        :else (not_understand4))))



;;;finir type and lane et creer les possibilitees possibles des champions
(defn deductionixtal3 [type, lane]
  (println "Ok, i find your champion: ")
  (cond
      (contains? (type monster ) , (lane jgl)) (println "The champion of ixtal you're thingking of is rengar")
))
;;pbl d'output
;; faire le programme de tree branch qui va essayer de donner la race de d'arbres et c 2 diff discuss

;;Main programm

(defn discusspark []
  (def surname "name")
  (println "Hello ! Welcome to the park discovery chatbot ! What's your name?")
  (def surname (read-line))
  (println (str "Hi  " surname "  nice to meet you"))
  (Joke)
  (activity)
  (the-exit))



(defn disscusixtal []
  (def surname "name")
  (println "Hello ! Welcome to the park discovery chatbot ! What's your name?")
  (def surname (read-line))
  (println (str "Hi  " surname "  nice to meet you"))
  (deductionixtal3 (deductionixtal1) (deductionixtal2)))

  ;;End