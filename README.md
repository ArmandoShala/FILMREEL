<div align="center">

![screenshot](https://user-images.githubusercontent.com/11156050/192218132-4efe0d53-0729-49e2-b36a-85fcae44f5c7.png)

&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub issues](https://img.shields.io/github/issues/ArmandoShala/FILMREEL)](https://GitHub.com/ArmandoShala/FILMREEL/issues/)&nbsp;&nbsp;&nbsp;&nbsp;[![TeamCity (simple build status)](https://img.shields.io/teamcity/http/teamcity.jetbrains.com/s/Kotlin_KotlinPublic_Compiler.svg)](https://teamcity.jetbrains.com/buildConfiguration/Kotlin_KotlinPublic_Compiler?branch=%3Cdefault%3E&buildTypeTab=overview&mode=builds)&nbsp;&nbsp;&nbsp;&nbsp;[![CI](https://github.com/ohmyzsh/ohmyzsh/workflows/CI/badge.svg)](https://github.com/ohmyzsh/ohmyzsh/actions?query=workflow%3ACI)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub license](https://img.shields.io/badge/license-Apache%20License%202.0-blue.svg?style=flat)](https://www.apache.org/licenses/LICENSE-2.0)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub contributors](https://badgen.net/github/contributors/ArmandoShala/FILMREEL)](https://GitHub.com/ArmandoShala/FILMREEL/graphs/contributors/)&nbsp;&nbsp;&nbsp;&nbsp;[![GitHub open-pull-requests](https://badgen.net/github/open-prs/ArmandoShala/FILMREEL)](https://github.com/ArmandoShala/FILMREEL/pulls?q=is%3Aopen)

</div>

<h1>Table of Contents</h1>

<!--ts-->
- [FILMREEL](#filmreel)
  - [Game Details 🔍](#game-details-)
  - [Screenshots 📸](#screenshots-)
- [Documentation 📚 TBD](#documentation--tbd)
  - [Techstack und Tools 🧰](#techstack-und-tools-)
  - [API Reference 🖇️ TBD](#api-reference-️-tbd)
  - [Possible Future Extension 💡](#possible-future-extension-)
- [Security 👮](#security-)
- [Branching Model and Naming 🌿](#branching-modell-and-naming-)
- [Commit Messages 📝](#commit-messages-)
- [Versioning 📌](#versioning-)
- [Acknowledgements 🙏](#acknowledgements-)
- [Authors 🪶](#authors-)
- [Contributing 🤝](#contributing--tbd)
- [Support ⭐](#support-)
- [License 📜](#license-)

<br >

# FILMREEL

**FILMREEL is a mobile app that matches you with someone in your circle of friends to watch movies, allowing you to compete in trivia games about movies.**
You're one swipe away from perfecting your next movie night. What's special about FILMREEL is that you can answer quizzes about trailers during, before or after the movie and thus collect points. Who knows, maybe your next movie night is already secured with your new favorite blockbuster in your personal watchlist. 😉

## Game Details 🔍
FILMREEL can be played with up to two people on one smartphone. Both users see a partial clip of a trailer at the same time and can directly answer questions about the film. The answer selection is separated for both users, with the left side of the answer selection belonging to player 1 and the right side to player 2.

<br >

## Screenshots 📸

| Page                                                                                                                        | Description                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| :-------------------------------------------------------------------------------------------------------------------------- | :------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| ![image](https://user-images.githubusercontent.com/11156050/192164143-dab7bfa6-6209-4faf-a1d8-74e0acadc678.png) Home        | An introduction to the app is presented on the home page. This is to achieve the best possible user experience. It also explains how the app works and allows you to set game preferences, such as genre and number of players. The quiz can be ended after each question                                                                                                                                                                                                                                                                                                                                                                                                       |
| ![image](https://user-images.githubusercontent.com/11156050/192164631-9294bf0b-2ec7-4030-a7ba-271556c92036.png) Quiz        | On the quiz page a short trailer clip of a movie is shown. The users have limited time to watch the short film clip. After that, the timer starts and the quiz duel for this movie clip begins. Below the film section, various questions and corresponding answers are listed, which the players have to decide on as quickly as possible. The faster the answer, the more points you get. After the question has been answered or the timer has run out, the game switches to the scoreboard and the points are displayed as an intermediate score. The person who has collected more points during the game wins the duel. This procedure is similar to the Kahoot procedure |
| ![image](https://user-images.githubusercontent.com/11156050/192164635-e5aae3f7-1b8e-4326-ac2f-9389c3946934.png) Scoreboard  | After each question from the current scoreboard is displayed. Here you can see who is ahead in the race. In addition, the players have the option of viewing further details on the film displayed before, ending the quiz or adding the film to the watchlist by swiping. A right swipe on the scoreboard puts the movie on the watchlist. Swiping left discards the movie. Swipe up to indicate that you have already seen the movie, but still want it on the watchlist. Last but not least, you can swipe down, so that the film is added to the watchlist, but is already marked as watched                                                                                |
| ![image](https://user-images.githubusercontent.com/11156050/192164640-93deafac-f424-434d-8f45-9450f0b8549e.png) Leaderboard | The leaderboard page is displayed as soon as the duel is over. The leaderboard page displays the first-placed person and the corresponding score                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| ![image](https://user-images.githubusercontent.com/11156050/192164643-1e0c7db7-a17f-4f48-9d53-2e1f9b244946.png) Watchlist   | The Watchlist displays all movies that have received a right-swipe. We got this idea from popular dating apps. On the watchlist, details about these movies can be expanded and the people using them can mark whether they have already seen the movie                                                                                                                                                                                                                                                                                                                                                                                                                         |

<br >

# Documentation 📚 TBD
You can find the documentation for the project in the [Wiki](https://linktodocumentation)


## Techstack and Tools 🧰
* [Kotlin](https://kotlinlang.org/)
* [SQLiteDatabase](https://developer.android.com/training/data-storage/sqlite)
* [Material Design](https://material.io/)
* [Figma](https://www.figma.com/)
* [IntelliJ](https://www.jetbrains.com/idea/)
* [Android Development](https://developer.android.com/)
* [GIT LFS](https://git-lfs.github.com/)

<br >

## API Reference 🖇️ TBD

| Parameter | Type     | Description                       | Call                        |
| :-------- | :------- | :-------------------------------- | :-------------------------- |
| `api_key` | `string` | **Required**. Your API key        | `http GET /api/items/${id}` |
| `id`      | `string` | **Required**. Id of item to fetch | `http GET /api/items/${id}` |


## Possible Future Extension 💡
* Pure swipe mode, without a quiz to fill the watchlist.
* Multidevice capability to compete against other participating people
* Multiplayer mode, to compete with several opposing game ends
* Chat function to get in contact with other persons
* Algorithm to match people who have movies on their watchlist that are similar to each other


# Security 👮

If you discover any security related issues, please use the issue tracker instead of sending a mail.

# Branching Model and Naming 🌿
We use a simplyfied version of the [Gitflow](https://www.atlassian.com/de/git/tutorials/comparing-workflows/gitflow-workflow) workflow.

| Name      | Description                                                                                      |
| :-------- | :----------------------------------------------------------------------------------------------- |
| `main`    | The master branch contains the production code and stores the official release history.          |
| `develop` | The develop branch contains pre-production code and serves as an integration branch for features |
| _`feature`_ | Each new feature should reside in its branch, which can be pushed to the central repository for backup/collaboration. Feature branches use the latest develop as their parent branch. When a feature is complete, it gets merged back into develop. Features should never interact directly with the master branch    |

<div align="center">

![screenshot](https://lh3.googleusercontent.com/8dNQyk6EkIvu9UZI-uaGYtQ2R3sqxn0BEbvk6xPiBmswMfcL2iFa6Zy6g0ewpWdTBIo1xQftjaZwMBaF-ODVc3jrIkBR03QsarL6BvtlEQ87KIsSxoxT2nScG6PZwsShuNa8kXM)
</div>

As for the naming of the feature branches, we use the following convention:
GH-`<issue-id>-<issue-namee>[-<short-description>]`

# Commit Messages 📝
The following section is optional, but highly recommended. It is a good practice to write a commit message in the following format:

```
Format:
<type>(<scope>): <subject> [<issue number>]

Example:
feat(Save Button): Implemented save button [MF-1]
```
The following types can be used:
* ci: Changes to our CI configuration files and scripts
* docs: Documentation only changes
* feat: A new feature
* fix: A bug fix
* refactor: A code change that neither fixes a bug nor adds a feature
* style: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
* test: Adding missing tests or correcting existing tests

_For more information, please refer to the [Angular Commit Message Guidelines](https://www.conventionalcommits.org/en/v1.0.0/)_

# Versioning 📌
We make it easy for you to keep track of the versions of our project. For transparency into our release cycle and in striving to maintain backward compatibility, we will be adhering to [Semantic Versioning](http://semver.org/) guidelines whenever possible.

# Acknowledgements 🙏
A big thank you to all the people who have contributed to this project. We are very grateful for your support and help, especially to the open source community.

 - [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
 - [Awesome README](https://github.com/matiassingers/awesome-readme)
 - [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)
 - [Ich danke Gott, meiner Familie und Freunden. Und den Rest verdank ich 5, 6 Leuten.](https://genius.com/4160880)

# Authors 🪶
Build with ❤️ by [@armandoshala](https://www.github.com/armandoshala) (shalaar3), [@landrit](https://www.github.com/landrit) (ahmetlan), and [@omerasipi](https://www.github.com/omerasipi) (asipiome) in Switzerland


# Contributing 🤝 TBD
This project was created for the course "MOBA 1" at the University of Applied Sciences in Zurich.
Since the course is over, we will not be able to maintain this project. However, we will be happy to accept any contributions that you may have.
Feel free to fork or clone this repository as long as you obey the License (Please refer to the license section for more information.)

# Support ⭐
If you like our project, please consider supporting us by giving a ⭐ on our project!

# License 📜
FILMREEL is distributed under the terms of the [Apache License (Version 2.0)](https://www.apache.org/licenses/LICENSE-2.0).
