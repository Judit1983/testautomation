Feature: Login
  As a registered user I want to login to the TESCO website
  I want to select the products I want to uy
  So that I can see the list of products and their price I want to buy

  Rule: User can add and remove products from the cart
    Example: judit1983@gmail.com
      Given E-mail address is valid
      When Registration
      Then go to password

    Example2: judit193.gmail.com

    Given: E-mail Adress is invalid
    When: Entering E-mail address at registration
    Then: Enter a valid E-mail address