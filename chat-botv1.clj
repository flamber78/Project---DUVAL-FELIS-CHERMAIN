;; crée des def pour chaques park, 2 types des phrases pour oui et non critere park
;; synonymes
(def vysehrad{
    :"wc": true,
   : "attractions": "sightseeing, museum, cemetery of famous personalities Slavín, national cultural monument",
   : "biking": true,
   : "skating": false,
   : "sports": true,
   :"playground": true,
    :"transportation": "Vyšehrad - metro C, Podolská vodárna tram no. 3, 16, 17, 21, 52",
    :"parking": true})

(def stromovka{
    :"wc": true,
    :"attractions": "zoo, botanical gardens, natural attractions, planetarium, exhibition grounds",
   : "attractions": "zoo, botanical gardens, natural attractions, planetarium, exhibition grounds",
   :"biking": true,
    :"skating": true,
    :"sports": true,
    :"playground": true,
   : "dogs": true,
    :"transportation": "Výstaviště, tram no. 5, 12, 14, 15, 17, 53, 54, Sibiřské nám., Bus no. 131, by steamer from Rašínov nábř.",
    :"parking": true,
   : "restaurant": true})

(def riegrovy-sady{
    :"wc": true,
    :"attractions": "view of Prague, classicist lookout tower, three-sided obelisk",
    :"biking": true,
    :"skating": true,
    :"sports": true,
    :"playground": true,
    :"dogs": true,
    :"transportation": "Metro Jiřího z Poděbrad, Na Smetance Bus no. 135, Italská and Vinohradská tržnice tram no. 11",
    :"parking": false,
    :"restaurant": true})

(def petrin{
    :"wc": true,
    :"attractions": "lookout tower, maze, observatory, underground galleries and fruit orchards",
    :"biking": true,
    :"skating": true,
    :"sports": false,
    :"playground": true,
    :"transportation": "Újezd ​​tram no. 6, 9, 12, 20, 22, 23, 57, 58, 59, Hellichova tram no. 12, 20, 22, 23, 57, Pohořelec tram no. 22, 23, Dormitories Strahov BUS No. 143, 149, 217",
    :"parking": true,
    :"restaurant": true})

(def letna{
    :"wc": true,
    :"attractions": "extensive leisure area, cultural events",
    :"biking": true,
    :"skating": true,
    :"sports": "777 789 140",
    :"playground": true,
    :"dogs": true,
    :"transportation": "Letenské náměstí and Sparta tram no. 1, 8, 15, 25, 26, 51, 56, Čechův most tram no. 12, 17, 53, Chotkovy sady tram no. 18, 20, 57, metro Hradčanská",
    :"parking": true,
    :"restaurant": true})

(def ladronka{
    :"wc": true,
    :"attractions": "extensive leisure area, music and entertainment events",
    :"biking": true,
    :"skating": true,
    :"sports": false,
    :"playground": true,
    :"dogs": true,
    :"transportation": "U Ladronky, Rozýnova, Štefkova BUS No. 191, Vypich BUS No. 108, 174, 180, 191, I3, tram No. 15, 22, 25, 57",
    :"parking": true,
    :"restaurant": true})

(def klamovka{
    :"wc": true,
    :"attractions": "art gallery, historical attractions, music club, garden restaurant.",
    :"biking": true,
    :"skating": false,
    :"sports": true,
    :"dogs": true,
    :"playground": true,
    :"transportation": "Klamovka - BUS No. 149, 191, 217, tram No. 4, 7, 9, 10, 58, 59",
    :"parking": false,
    :"restaurant": true})

(def kinskeho-zahrada{
    :"wc": true,
    :"attractions": "museum,ornamental lakes, natural attraction - Petrin Rocks.",
    :"biking": false,
    :"skating": false,
    :"sports": false,
    :"playground": true,
    :"transportation": "Kobrova - BUS No. 176",
    :"parking": true})

(def kampa{
    :"wc": true,
    :"attractions": "view of the Vltava, Sovovy Mlýny Gallery, Čertovka, Charles Bridge, Werich House, memorial trees.",
    :"biking": true,
    :"skating": true,
    :"sports": false,
    :"playground": true,
    :"transportation": "Hellichova tram no. 12, 20, 22, 23, 57, Újezd ​​tram no. 6, 9, 22, 23, 57, 58, 59",
    :"parking": false})

(def obora-hvezda{
    :"wc": true,
    :"attractions": "memorial trees, nature trail, nature attractions",
    :"biking": true,
    :"skiing": true,
    :"skating": false,
    :"sports": false,
    :"playground": true,
    :"dogs": true,
    :"transportation": "Nad Markétou, bus no. 179, 184, 191, 510, Libocká - bus no. 179, 510, Vypich, tram no. 15, 22, 25, 57",
    :"parking": true})

(def frantiskanska-zahrada{
    :"wc": true,
    :"attractions": "Church of Our Lady of the Snows",
    :"biking": true,
    :"skating": false,
    :"sports": false,
    :"playground": true,
   :"dogs": false,
    :"transportation": "Václavské náměstí trams. No. 3, 9, 14, 24, 51, 52, 54, 55, 56, 58, metro A, B Můstek",
   : "parking": false})

(def bertramak{
    :"walk" true,
    : "attractions": "cultural monument, classical music concerts, social events, W. A. ​​Mozart Museum",
     :"biking": true,
     :"skating": false,
     :"sports": false,
     :"playground": false,
     :"transportation": "trams No. 4, 7, 9, 10, 58, 59.",
     :"parking": true})


(def pos #{"yes" "Y" "yep" "y" "ok" "OK" "Yeah" "Yes" "fine"})
(def neg #{"no" "Nah" "nah" "n" "No" "nope" "nop" "Nope" "Nop" "nay"})
(def park #{"parking" "car" "driving" "drive"})
(def sport #{"sports" "sport" "exercise" "training"})
(def children #{"playground" "child" "children" "family" "son" "daughter"})
(def transport #{"how to go" "going" "transports" "transport"})
(def walk #{ " walk" "run" " running" "walking" "hike" })
(def interest #{"what can I do" "activities" "attractions" "interests" "tourism"})
(def bertramka #{"Bertramka","bertramka", "12"})
(def frantiskanska-zahrada #{"11", "Frantiskanska Zahrada","frantiskanska zahrada","Frantiskanska zahrada", "frantiskanska Zahrada"})
(def obora-hvezda #{"10", "Obora Hvezda","obora hvezda","Obora hvezda", "obora Hvezda"})
(def kampa #{"9", "Kampa","kampa"})
(def kinskeho-zahrada #{"8", "Kinskeho Zahrada","kinskeho zahrada"})
(def klamovka #{"7", "Klamovka","klamovka"})
(def ladronka #{"6", "Ladronka","ladronka"})
(def letna #{"5", "Letna","letna"})
(def petrin #{"4","Petrin","petrin"})
(def riegrovy-sady #{"3","Riegrovy Sady","riegrovy sady","Riegrovy sady"})
(def stromovka #{"2", "Stromovka","stromovka"})
(def vysehrad #{"1", "Vysehrad","vysehrad"})
 

(defn park_discus[] 
  (def name "name")
  (println "Hello ! Welcome to the park discovery chatbot ! What's your name?")
  (def name (read-line))
  (println(str "Hi  " name "  nice to meet you") )
  (def activity "activity")
  (println "What do you want to do today?")
  (if 
   ( insertion_contains sport, park, walk))
  (def activity (read-line))
  (println (str "So you want to (do)  " activity "  I can recommend you to go in a park to do that"))
  (def choice_park "choice_park"
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
12) Bertramka"
)
 (def choice_park (read-line)) 
  (println "Write the number or the name of the park you want to have more information about it "")Write the number or the name of the park you want  ")
  
(System/exit0);;c l'exit)


  (defn insertion_contains ("insertion_contains")
    [str synonyms]
    (def littlestr (string/lower-case str))
    (def result 0)
    (doseq [key synonyms]
      (if (string/incldes? lowerstr key)
      (def result (+ result 1))) nil))
 (if (> result 0) true false))
 
 (defn wich_park ("wich_park")
   contains insertion_contains)
 []
 (def)

  (let [name (read-line)]
    (cond
      (contains? pos x) (print "OK THX")
      (contains? neg x) (print "NOP SRY  BYE")
      :else (notunderstand hello)))
 