package com.example.anew

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.anew.models.BoardSize
import com.example.anew.utils.EXTRA_SIZE

class CustomActivity : AppCompatActivity() {

    private lateinit var boardSize: BoardSize
    private var imagesRequired = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom)


        //pulling data out from intent and cast it
        boardSize =  intent.getSerializableExtra(EXTRA_SIZE) as BoardSize

        imagesRequired =boardSize.getPairs()

        supportActionBar?.title = "choose the number (0/ $imagesRequired)"

        //setting up back button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    //initializing the home button
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) { //contains android prefix as it was added
            finish()

            return true
        }
        return  super.onOptionsItemSelected(item)
    }


}