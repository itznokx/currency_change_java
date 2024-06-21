## About the Project
This project is a `Currency Changer` developed using [Eclipse IDE](https://www.eclipse.org/downloads/packages/release/2022-09/r),
[TomCat Server](https://tomcat.apache.org/download-10.cgi) and [Currency Freaks API](https://currencyfreaks.com/). Also I tried using `MVC` (Model - View - Controller)
Architecture.
### MVC pattern
First things first, You may have noticed that the project is a simple web app, so the Servlet is a crucial part of it. If You
don't know what is a servlet, I recommend You to see this link: [Servlet](https://www.geeksforgeeks.org/introduction-java-servlets/) :smile: :+1:.

In MVC architecture, the servlet has the `"Controller Role"`. Based on this, the servlet file is in [/src/main/java/controller](https://github.com/itznokx/currency_change_java/tree/main/src/main/java/controller) directory.

Talking about the `Model`, [CurrencyHeader.java](https://github.com/itznokx/currency_change_java/blob/main/src/main/java/model/CurrencyHeader.java) file has the most important functions to make the data entered by the user calculated correctely.

The `View` is basically the [index.jsp](https://github.com/itznokx/currency_change_java/blob/main/WebContent/index.jsp) file
### How to use the API
The [`Currency Freaks API`](https://currencyfreaks.com) has the free option key.

When you get your API key from the Oficial Site, copy to the urlJsonFile class parameter on [`CurrencyHeader.java`](https://github.com/itznokx/currency_change_java/blob/main/src/main/java/model/CurrencyHeader.java) file in [/src/main/java/model](https://github.com/itznokx/currency_change_java/blob/main/src/main/java/model/) directory.
After this, you'll have 1000 "calls" with the free key. Then start the TomCat webserver, run the project and enjoy!

### TODO
- [x] Make the project work in Eclipse
- [ ] Make .war file available
- [ ] Make a good, responsive and modern layout to index.jsp
