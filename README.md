<div align="center">

![screenshot](https://user-images.githubusercontent.com/11156050/192218132-4efe0d53-0729-49e2-b36a-85fcae44f5c7.png)

&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub issues](https://img.shields.io/github/issues/ArmandoShala/FILMREEL)](https://GitHub.com/ArmandoShala/FILMREEL/issues/)&nbsp;&nbsp;&nbsp;&nbsp;[![TeamCity (simple build status)](https://img.shields.io/teamcity/http/teamcity.jetbrains.com/s/Kotlin_KotlinPublic_Compiler.svg)](https://teamcity.jetbrains.com/buildConfiguration/Kotlin_KotlinPublic_Compiler?branch=%3Cdefault%3E&buildTypeTab=overview&mode=builds)&nbsp;&nbsp;&nbsp;&nbsp;[![CI](https://github.com/ohmyzsh/ohmyzsh/workflows/CI/badge.svg)](https://github.com/ohmyzsh/ohmyzsh/actions?query=workflow%3ACI)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub contributors](https://badgen.net/github/contributors/ArmandoShala/FILMREEL)](https://GitHub.com/ArmandoShala/FILMREEL/graphs/contributors/)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub open-pull-requests](https://badgen.net/github/open-prs/ArmandoShala/FILMREEL)](https://github.com/ArmandoShala/FILMREEL/pulls?q=is%3Aopen)

</div>

<h1>Table of Contents</h1>

<!--ts-->
- [FILMREEL](#filmreel)
  - [Game Details 🔍](#game-details-)
  - [Screenshots 📸](#screenshots-)
- [Documentation 📚](#documentation-)
  - [Techstack und Tools 🧰](#techstack-und-tools-)
  - [API Reference 🖇️](#api-reference-️)
  - [Zukünftig mögliche Erweiterungen 💡](#zukünftig-mögliche-erweiterungen-)
- [Security 👮](#security-)
- [Acknowledgements 🙏](#acknowledgements-)
- [Authors 🪶](#authors-)
- [License 📝](#license-)

<br >

# FILMREEL

**FILMREEL ist eine Mobile App, auf der du mit einer Person aus deinem Freundeskreis auf Filme aufmerksam gemacht wirst und euch somit in Quizspiele zu Filmen messen könnt.**
Ihr seid ein Swipe entfernt, um euren nächsten Filmabend zu perfektionieren. Das Spezielle an FILMREEL ist, dass ihr während, vor oder nach dem Film Quizzes zu Trailern beantworten und somit Punkte sammeln könnt. Wer weiss, wohlmöglich ist eurer nächster Filmabend bereits mit euren neuen Lieblingsblockbuster in der persönlichen Watchlist gesichert 😉

## Game Details 🔍
FILMREEL kann mit bis zu zwei spielenden Personen auf einem Smartphone gespielt werden. Beide benutzenden Personen sehen gleichzeitig einen Teilausschnitt eines Trailers und können direkt Fragen zum Film beantworten. Die Antwortauswahl ist für beide benutzenden Personen getrennt, wobei die Linke Seite der Antwortauswahl spielender Person 1 und die rechte Seite spielender Person 2 gehört


<br >

## Screenshots 📸

| Page   | Beschreibung |
| :------------- | :------------- |
| ![image](https://user-images.githubusercontent.com/11156050/192164143-dab7bfa6-6209-4faf-a1d8-74e0acadc678.png) Home | Auf der Home Page wird eine Einführung zu der App präsentiert. Damit soll die bestmögliche User-Experience erreicht werden. Zudem wird aufgeklärt, wie die App funktioniert und man kann Spieleinstellungen treffen, wie z.B Genre und Spieleranzahl. Das Quiz kann nach jeder Frage beendet werden  |
| ![image](https://user-images.githubusercontent.com/11156050/192164631-9294bf0b-2ec7-4030-a7ba-271556c92036.png) Quiz | Auf der Quiz Page wird kurz ein Trailerausschnitt zu einem Film gezeigt. Die Nutzende haben limitierte Zeit, sich den kleinen Filmabschnitt anzuschauen. Danach geht der Timer los und das Quiz-Duell zu diesem Filmabschnitt beginnt. Unterhalb des Filmabschnitts werden diverse Fragen sowie dazugehörige Antworten aufgelistet, für welche sich die Spielende schnellstmöglich entscheiden müssen. Es gilt hier nämlich, je schneller desto mehr Punkte. Nachdem die Frage beantwortet wurde oder der Timer abgelaufen ist, wird zum Scoreboard gewechselt und die Punkte sind als Zwischenstand ersichtlich. Die spielende Person, welche mehr Punkte während des Spielt gesammelt hat, gewinnt dieses Duell. Dieses Verfahren ähnelt dem Verfahren von Kahoot. |
| ![image](https://user-images.githubusercontent.com/11156050/192164635-e5aae3f7-1b8e-4326-ac2f-9389c3946934.png) Scoreboard | Nach jeder Frage wird das aktuelle Scoreboard angezeigt. Hier ist ersichtlich, wer im Rennen vorne liegt. Zusätzlich haben die spielenden Personen die Möglichkeit weitere Details zu dem davor angezeigten Film anzuschauen, das Quiz zu beenden oder durch Swipen den Film auf die Watchlist zu setzen. Durch einen Rechts-Swipe auf dem Scoreboard wird der Film auf die Watchlist gesetzt. Mit einem Links-Swipe wird der Film verworfen. Durch einen Swipe nach oben gibt man an, dass man den Film bereits gesehen hat, aber dennoch auf die Watchlist haben will. Zu guter Letzt kann man nach unten swipen, sodass der Film auf die Watchlist kommt, aber bereits als gesehen markiert wird. |
| ![image](https://user-images.githubusercontent.com/11156050/192164640-93deafac-f424-434d-8f45-9450f0b8549e.png) Leaderboard | Die Leaderboard-Seite wird angezeigt, sobald das Duell zu Ende ist. Auf der Leaderboard Seite wird die erstplatzierte Person und die dazugehörige Punktzahl angezeigt. |
| ![image](https://user-images.githubusercontent.com/11156050/192164643-1e0c7db7-a17f-4f48-9d53-2e1f9b244946.png) Watchlist | Auf der Watchlist werden alle Filme angezeigt, welche einen Rechts-Swipe erhalten haben. Diese Idee haben wir von beliebten Dating-Apps. Auf der Watchlist können Details zu diesen Filmen aufgeklappt werden und die benutzenden Personen können markieren, ob sie den Film bereits gesehen haben. |

<br >

# Documentation 📚
**TBD** Die Dokumentation ist im [entsprechendem Verzeichnis](https://linktodocumentation) zu finden

<br >

## Techstack und Tools 🧰
* [Kotlin](https://kotlinlang.org/)
* [Redis DB](https://redis.io/) _tbd_
* [YouTube-API](https://developers.google.com/youtube/v3) _tbd_
* [Netflix-API](https://rapidapi.com/blog/netflix-api/) _tbd_
* [Material Design](https://material.io/)
* [Figma](https://www.figma.com/)
* [IntelliJ](https://www.jetbrains.com/idea/)
* [Android Development](https://developer.android.com/)

<br >

## API Reference 🖇️

| Parameter | Type     | Description                | Call |
| :-------- | :------- | :------------------------- | :--- |
| `api_key` | `string` | **Required**. Your API key | `http GET /api/items/${id}` |
| `id`      | `string` | **Required**. Id of item to fetch | `http GET /api/items/${id}` |

<br >

## Zukünftig mögliche Erweiterungen 💡
* Reiner Swipemodus, ohne ein Quiz, um die Watchlist zu befüllen
* Multidevicefähigkeit, um gegen andere teilnehmende Personen anzutreten
* Multispielermodus, um mit mehreren gegnerische Spielende anzutreten
* Chatfunktion, um mit anderen Personen in Kontakt zu treten
* Algorithmus, um Personen zusammenzuführen, welche Filme auf der Watchlist haben, welche sich ähneln

<br >


# Security 👮

If you discover any security related issues, please use the issue tracker instead of sending a mail.


# Acknowledgements 🙏

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)
 - Ich danke Gott, meiner Familie und Freunden. Und den Rest verdank ich 5, 6 Leuten.


# Authors 🪶
Build with ❤️ by [@armandoshala](https://www.github.com/armandoshala) (shalaar3), [@landrit](https://www.github.com/landrit) (ahmetlan), and [@omerasipi](https://www.github.com/omerasipi) (asipiome) in Switzerland

# License 📝
FILMREEL is distributed under the terms of the [Apache License (Version 2.0)](https://www.apache.org/licenses/LICENSE-2.0).
