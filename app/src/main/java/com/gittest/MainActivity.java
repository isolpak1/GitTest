package com.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    //1 - Create a Project and upload it to Github
    //Complete Tutorial is followed from here,
    //https://www.londonappdeveloper.com/how-to-use-git-hub-with-android-studio/
    //pdf is downloaded and present at Project/Shayan/

    //2 - Download New Project from Github into Another PC
    //https://www.londonappdeveloper.com/how-to-clone-a-github-project-on-android-studio/
    //pdf is downloaded and present at Project/Shayan/
    //Since it is not working therefore try this
    /*Tutorial : http://stackoverflow.com/questions/31752042/how-can-i-import-android-studio-project-from-github
        1 - Create Folder "GitClone"
        2 - Right Click on Folder, Select Git Bash Here
        3 - Write git remote add origin https://github.com/isolpak1/GitTest
        4 - Create new file settings.gradle
        5 - Edit file and add include ':app'
        6 - Open Android Studio, go to File, Import Project
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
