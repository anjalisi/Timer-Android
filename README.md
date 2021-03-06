# Timer-Android
It is a timer app, with a very beautiful UI. It has a slider, through which you can set your own timer. <br>
It ranges from 0:00 to 30:00. The sound of a horn marks the setting off of the Timer.
<br>
The **MainActivity.java** is placed under <br>
```
https://github.com/anjalisi/Timer-Android/tree/master/app/src/main/java/com/example/timerapp
```

# Install Pre-requisites

1. Download the Android IDE: Android Studio (you may need to install java by following the prompts)
  a. Optional: Install the Android SDK: ``` brew install android-sdk ``` , Select the SDK that ```brew``` logged out back in the previous command
2. Open this project with in Android Studio IDE
3. The IDE will complain about *"Gradle sync failed".* Just follow what it says.
4. Once the IDE stops giving suggestions go to **Tools -> Android -> SDK Manager** and do what the SDK Manager says.
5. Once the SDK Manager stops giving suggestions, use it to install the Google Repository and the Android Support Repository.

# How do you use this repository?
Clone or download this repo<br>
```
https://github.com/anjalisi/Timer-Android
```
After that you can simply take the files and paste it in the required folders. Et Voila !

# Setup Virtual Device
## Running on a virtual device
1. Open the AVD Manager (***Tools -> Android -> AVD Manager***).
2. Create a new Virtual Device. The size/model doesn't matter that much
3. Select a system image that has both a _x86_64 ABI and Google Play Services_.
4. Finish and Click Play!
