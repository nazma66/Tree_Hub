package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.List;

public class Advice_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advice);

        // Create a list of AdviceItems
        List<AdviceItem> adviceItems = new ArrayList<>();
        adviceItems.add(new AdviceItem(R.drawable.img_2, "Step 1: Dig the planting hole.\n", "First, remove the tree container from the container and measure the root ball (the mass of soil and roots that comes out of the container) with the handle of your shovel to estimate the depth to dig."));
        adviceItems.add(new AdviceItem(R.drawable.img_3, "Step 2: Massage the roots.\n", "We have found that this step is key to robust tree performance. Roots should ideally radiate out straight from the center of the root ball. "));
        adviceItems.add(new AdviceItem(R.drawable.img_4, "Step 3: Place the tree in the center of the hole.",
                "The tree has only one chance to be planted properly so make sure the depth and position is correct before filling in the soil. The root flare should lie above the surface."));
        adviceItems.add(new AdviceItem(R.drawable.img_5, "Step 4: Build a soil berm.", "A soil berm is a mound encircling the tree, 10-12 inches from the trunk, which creates a basin or bowl that will hold approximately 10 gallons of water."));
        adviceItems.add(new AdviceItem(R.drawable.img_6, "Step 5: Stake the tree.", "Two ‘lodge pole’ stakes are used to help the young tree grow up straight until the roots are established. In parks and yards three stakes may be used to protect the tree from lawn mowers."));
        adviceItems.add(new AdviceItem(R.drawable.img_7, "Step 6: Tie the tree.", "Ties should be placed at the lowest point on the trunk where the tree can be held straight, generally about 4 feet from the ground. Hold the trunk at the level you plan to tie it; "));
        adviceItems.add(new AdviceItem(R.drawable.img_8, "Step 7: Water the tree thoroughly!", "Fill the basin with water and reinforce the berm if needed. Continue watering (once a week when there has not been a soaking rain) until established."));
        adviceItems.add(new AdviceItem(R.drawable.img_9, "Step 8: Add Mulch.\n", "Cover the soil 2-3 feet around the tree base with 3-5 inches of mulch (composed of wood chips, shredded bark or leaves) to retain moisture, suppress weeds and improve soil composition"));

        GridView gridView = findViewById(R.id.gridView);

        // Pass the list to the adapter
        Advice_Image_Adapter_01 adapter = new Advice_Image_Adapter_01(this, adviceItems);

        gridView.setAdapter(adapter);
    }
}
