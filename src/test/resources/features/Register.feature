# Autor: Oscar Correa

@stories
Feature: New user registration in Utest
  As a new user, Oscar wants to register on the utest page.

  @scenario1
  Scenario: Oscar's registration on the Utest page
    Given That Oscar wants to register on the Utest page
    When Enter all the required data and necessary permissions
          | dataName | dataLastName | dataEmail                 | dataBirthMonth | dataBirthDay | dataBirthYear | dataCity       | dataPostalCode | dataCountry | dataComputer | dataVersion      | dataLanguage | dataMobile | dataModel      | dataSystem  | dataPassword |
          | Oscar    | Correa       | oscaryu 7889@gmail.com      | January        | 6            | 1999          | Villavicencio  | 500002         | Colombia    | Windows      | Windows 10 Home  |  Spanish     | Motorola   | Moto E7 Plus   | Android 10  | Julian12345, |

    Then He completes the registration successfully on the page
      | DataFinalText                                                           |
      | Welcome to the world's largest community of freelance software testers! |