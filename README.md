## Fall 2022 - Java


### PURPOSE:
You are a QA Engineer at Luma. You have been handed this framework and are responsible for delivering 5 automated
 smoke tests before the next production release for the [Application Under Test (AUT)](https://magento.softwaretestingboard.com/)
#
##### INSTRUCTIONS:
**Step 1** 
- Register an account on the AUT using your email address and a simple password (e.g. - Test123)
- This will be your test account that you can use in this framework to access the application using Selenium

**Step 2**
- Create your own public repository in GitHub and name it with the following format: 

    ```txt
    StudentID_FirstName Selenium HW 1
    ```

**Step 3**
- Once you create your GitHub repo, [click here to add your repo URL](https://docs.google.com/spreadsheets/d/16Go1zZxJlFxctZJylY4u78fj8nwLOrHj9suf4qIE7h8/edit?usp=sharing)

**Step 4**
- Clone this project locally

**Step 5**
- Go to ```src/main/resources/config/config.properties``` and provide your email address and password from step 1 as 
the values for the corresponding fields

    ```properties
    app_user={your_email_address}
    app_password={your_password}
 
**Step 6**
- Open the project and go to the terminal to point your local project/repo to your newly created remote repo
    - First, we want to verify the remote repo your local project is currently pointing to:  
    ```sh
    git remote -v
    ``` 
    - Next, change your project's remote repo:
    ```sh
    git remote set-url origin <your repo URL>
    ```
    - Verify your local repo now points to your remote repo:
    ```sh
    git remote -v
    ```
    - Then commit and push your code to initialize your remote repo:
    ```sh
    git add .
    ```
    ```sh
    git commit -m "Initial Commit"
    ```
    ```sh
    git push -u origin main
    ```
    - For all subsequent pushes:
    ```sh
    git push
    ```
    
#
### IMPORTANT NOTES :
- Try to get your test cases to pass with a 90%+ success rate
- Make sure to implement Page Object Model using Page Factory
- Use explicit & fluent waits
- Think of some critical functionalities to test, such as: 
    - Registration & authentication
    - Item search
    - Adding/modifying/removing items to/from cart
    - Checkout


#### ***Have fun with it!***
