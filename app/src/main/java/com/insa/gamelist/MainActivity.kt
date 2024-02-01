package com.insa.gamelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.insa.gamelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        // TODO : create a game and write its title in logs

        // TODO : build the list of games

        // TODO : display the number of games

        // TODO : display the fisrt game

        // TODO : display the last game

        // TODO : display the game list in alphabetic order

        // TODO : find and display all "Action-Aventure" game

        // TODO : find and display the games launched the 14/05/2021 and the 26/10/2021

        // TODO : display the oldest game launched in the list

        // TODO : display the list of editor

        // TODO : display the last game launched in 2020

        // TODO : display the average year launch for the game list

        // TODO : display the number of game launch on all platforms

    }
}