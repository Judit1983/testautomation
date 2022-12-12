Feature: Registration

  Rule: E-mail contains @
    Example: judit1983@gmail.com
      Given E-mail address is valid
      When Registration
      Then go to password

    Example2: judit193.gmail.com

     Given: E-mail Adress is invalid
     When: Entering E-mail address at registration
     Then: Enter a valid E-mail address

  Rule: password contains at least 6 characters and min. 1 special char. And 1 Capital

    Example: Password1’
      Given: Password is valid
      When: Entering password at registration
      Then: Continue registration

    Example2: pass%
    Given: password invalid
    When: Entering password at registration
    Then: Give a password with at least 6 chars

    Example3 : password%
    Given: password invalid
    When: Entering password at registration
    Then: Password contains no capital


    Example3 : Password
    Given: password invalid
    When: Entering password at registration
    Then: Password contains no special character