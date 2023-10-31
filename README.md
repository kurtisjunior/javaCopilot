# Bowl Creator Kata

Java version 17 or higher is required to run this project.

Once you have project cloned on your machine, install the dependencies using

```bash
./gradlew build
```

To run the tests, use

```bash
./gradlew test
```

To run the application, use

```bash
./gradlew run
```

For broader instructions on CoPilot setup, see the [root README](../../README.md).

## Detailed setup

### Prerequisites:
Before installing Gradle, ensure you have a JDK installed with a version compatible with the Gradle version you wish to install. You can verify this by running:

```bash
java -version
```

### Installing on macOS using Homebrew:
If you have Homebrew installed on your machine, installing Gradle is as simple as:

```bash
brew install gradle
```

### Installing on Linux using SDKMAN!:
If you use SDKMAN!, it provides an easy way to manage parallel versions of multiple Software Development Kits on most Unix-based systems:

```bash
sdk install gradle
```

### Installing manually:

1. Download the latest Gradle distribution from the [Official Gradle](https://gradle.org/releases/) website.
2. Unzip the Gradle download to the directory you wish to install Gradle, e.g., ~/gradle (you can place it wherever you like).
3. Configure your system environment PATH variable to include the bin directory of the unzipped location:

    * For Linux/Unix/macOS:
    ```bash
    export PATH=$PATH:/path-to-gradle/gradle-x.x/bin
    ```
    * For Windows: Add the path C:\path-to-gradle\gradle-x.x\bin to your PATH environment variable.

To verify your installation, run the following command in your terminal:

```bash
gradle -v
```

This should display the version of Gradle you've installed.

### Upgrading Gradle:
If you've used a package manager (like Homebrew or SDKMAN!), updating Gradle is as simple as using the upgrade command provided by the package manager.

If you've installed manually, you'll need to download and replace the existing installation with a newer version of Gradle.

## Kata Instructions

In short, you'll be creating a a Buddha Bowl generator that mixes ingredients which work well together:

- Mix a random Buddha Bowl from the following list of ingredients: 
    - Whole grains: [Brown Rice, Wheat, Oats, ...]
    - Plant protein: [Kidney Beans, Chickpeas, Tofu, ...]
    - Leafy Greens: [Kale, Green Salad, Arugula, Chinese Cabbae, Pak Choi...]
    - Vegetables: [Tomato, Cucumber, Bell Pepper, Mushrooms, ...]
    - Seeds and nuts: [Sesame, Walnuts, Hazelnuts, ...]
    - Dressing: [Tahini Lemon, Balsamic, Yogurt, Soy sauce with rice vinegar, ...]

- Some ingredients do not work well with others. For example: 
    - Tofu and Yogurt dressing
    - Oats and Mushrooms
    - Kale and Wheat
    - Hazelnuts and Tahini Lemon dressing
    Make sure these are not ever grouped together. 

- Some ingredients have tags, for example: Brown Rice, Tofu, Pak Choi have an "asian" tag. A bowl counts as "asian" if it has more than two asian ingredients in it. Make sure to label it as such

- Some ingredients cannot go into asian bowls: Oats, Chickpeas, Hazelnuts, Yogurt dressing, Spaghetti. Make sure asian bowls do not contain those.

- Repeat for other tags such as "low carb", "italian", "regional" depending on your choice

Congratulations! You will never have to think about lunch again!
