## Web protocols
Модель клиент-сервер используется при построении системы обработки информации на основе СУБД, а также почтовые системы

HTTP Hyper Text Transfer Protocol

HTTPs Hyper Text Transfer Protocol secured - Данные передаются в засекреченном виде

SSL/TLS - протокол шифрования данных

Public/Privat Key - подпись цифровым сертификатом

FTP File Transfer Protocol

POP3 SMTP - почтовые протоколы для отправки и получение писем (POP3 - протокол для входящей почты; SMTP - для исходящей почты)

IMAP - почтовые протоколы для отправки

UDP User Datagram Protocol - данные уходят набором данных

**Request (запрос)**
клиента к серверу

Base Line/ Start line: method; URI; protocol

method - что хотим сделать?

URI где мы это хотим сделать

**Reponse (ответ)**
от сервера клиенту

Status code standard

HEADERS: param1: atr1,atr2,atr3 Content-type: image cookeis: last-modified: 14.01.2021 15:49:10 GMT

BODY

**Status code**
1хх Info (101 switching protocols)

2хх Success (200 OK)

3хх Redirect (304 Not Modified)

4хх Client error (404 Not Found)

5хх Server error (500 Internal server error)

Methods
GET - получение ресурса

POST - создание ресурса

PUT - обновление ресурса

DELETE - удаление ресурса

**LOG**
текстовый файл, в котором содержится вся информация о действиях пользователей на сайте, сервисе, сервере. Этот файл часто содержит запросы, вводимые пользователем в поисковой системе. Также учитываются другие показатели. Например, количество посещений, просматриваемые страницы, дата просмотра и так далее

**Sniffer**
тип программного обеспечения, которое анализирует весь входящий и исходящий трафик с компьютера, подключенного к Интернету

**Fiddler**
отладочный прокси-сервер, используемый для регистрации, проверки и изменения трафика HTTP и HTTPS между компьютером и веб-сервером https://www.telerik.com/download/fiddler

[Презентация](https://docs.google.com/presentation/d/1rWmGrN9HM-oam9BbYRaSiWTYcYh0O0lO/edit?usp=drive_link&ouid=116447005932578256378&rtpof=true&sd=true)

**login.feature**

@invalidPassword

Scenario Outline: Login with valid email and invalid password

Given User launches Chrome browser

When User opens ilCarro HomePage

And User clicks on Login link

And User enters valid email and invalid password

| email   | password   |

| <email> | <password> |

And User clicks on Yalla button

Then User verifies Error is displayed

And User quites browser

Examples:

| email         | password    |

| manuel@gm.com | Manuel12344 |

| manuel@gm.com | M123444444! |

| manuel@gm.com | manuel1234! |

| manuel@gm.com | Manuellllllllll! |