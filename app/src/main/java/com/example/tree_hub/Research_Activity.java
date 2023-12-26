package com.example.tree_hub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

import android.os.Bundle;

public class Research_Activity extends AppCompatActivity {

Button back;
    ListView list_res;

    String[] resheadline = {
            "Performance metrics for street and park trees",
            "Volunteer- and researcher-collected urban tree inventory data",
            "No Christmas Tree, No Joy In Bethlehem, Birthplace Of Jesus Christ","Is planting trees as good for the Earth as everyone says?","The Benefits and Limits of Urban Tree Planting for Environmental and Human Health"
    };
    String[] resdate = {"JOURNAL OF FORESTRY | 2018", "INTERNATIONAL SOCIETY OF ARBORICULTURE | 2018", "World NEWS| December 25|2023 8:31 am IST","Mike Gaworecki | 13 May 2021","Ecol. Evol.| 08 April 2021"};
    String[] resdetails = {"Tree performance in urban forests is difficult to evaluate, because there is not a unified metric to determine the highest performers. This study set out to evaluate tree performance metrics. ",
            "To assess the potential impact of emerald ash borer on a Minnesota, U.S., community forests, communities were selected in 2009 and 2011 to complete tree surveys or inventories. ",
            "Rony Tabash, who sells crucifixes, statuettes of the Virgin Mary and other religious trinkets in his family's store, was tidying shelves and merchandise to pass the time.",
    "As the world searches for solutions to global climate change, tree planting has become increasingly popular, with ambitious campaigns aiming to plant billions or trillions of trees.","Many of the world’s major cities have implemented tree planting programs based on assumed environmental and social benefits of urban forests. "};
    Integer[] resimageId = {
            R.drawable.pojo01,
            R.drawable.pojo02,
            R.drawable.pojo03,
            R.drawable.pojo04,
            R.drawable.pojo05,


    };

    String[] buttonLinks = {
            "https://academic.oup.com/jof/advance-article/doi/10.1093/jofore/fvy049/5099086",
            "https://www.researchgate.net/publication/323401350_An_analysis_of_agreement_between_volunteer-_and_researcher-collected_urban_tree_inventory_data",
            "https://www.ndtv.com/world-news/worst-christmas-ever-in-birthplace-of-jesus-as-war-empties-bethlehem-4737475","https://news.mongabay.com/2021/05/is-planting-trees-as-good-for-the-earth-as-everyone-says/",
            "https://www.frontiersin.org/articles/10.3389/fevo.2021.603757/full"

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);


        list_res = (ListView) findViewById(R.id.list_res);

        Research_CustomAdapter_01 listAdapter = new Research_CustomAdapter_01(Research_Activity.this, resheadline, resimageId, resdate,  resdetails, buttonLinks);
        list_res.setAdapter(listAdapter);


        list_res.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedHeadline = resheadline[position];

                String selectedDate = resdate[position];
                String selectedDetails = resdetails[position];
                int selectedImageId = resimageId[position];


               list_res.setSelector(R.color.white);

            }
        });
//        back.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Navigate back to the main activity
//                Intent intent = new Intent(Research_Activity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}
