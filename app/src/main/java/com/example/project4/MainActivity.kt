package com.example.project4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project4.adapter.ShoesAdapter
import com.example.project4.model.Shoes
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainView:RecyclerView =findViewById(R.id.recycler_view)

        var shoesList = ArrayList<Shoes>()
        shoesList.add(Shoes("001",R.drawable.nike,"Nike Superfly 6", "ELite FG", 799))
        shoesList.add(Shoes("002",R.drawable.airvapormax,"Air Vapormax", "Flyknit", 1280))
        shoesList.add(Shoes("003",R.drawable.airjordan,"Air Jordan 14", "Retro Se", 2400))
        shoesList.add(Shoes("004",R.drawable.lebronxvi,"LeBron XYI", "Low EP", 1099))
        shoesList.add(Shoes("005",R.drawable.jordanwhynot,"Jordan Why Not", "Zer0.2 PF", 2699))
        shoesList.add(Shoes("006",R.drawable.lebronxvii,"LeBron XYII", "SB EP", 1280))

        var shoesAdapter = ShoesAdapter(shoesList)

        mainView.layoutManager =GridLayoutManager(this, 2)

        mainView.adapter = shoesAdapter
    }
}
