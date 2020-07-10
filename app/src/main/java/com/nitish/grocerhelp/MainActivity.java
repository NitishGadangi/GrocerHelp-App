package com.nitish.grocerhelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.onesignal.OneSignal;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughActivity;
import com.shashank.sony.fancywalkthroughlib.FancyWalkthroughCard;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FancyWalkthroughActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);



        FancyWalkthroughCard fancywalkthroughCard1 = new FancyWalkthroughCard("Welcome \uD83D\uDC4B", "Ever visited a local grocery store just to realise that all that you want is out of stock right now.",R.drawable.grocer);
        FancyWalkthroughCard fancywalkthroughCard2 = new FancyWalkthroughCard("Grocery Search 🤦‍♂️ ?", "Optimise your supermarket & pharmacy visit during the COVID-19 quarantine. Find everything you need and reduce unnecessary movements to risk areas.",R.drawable.grocer1);
        FancyWalkthroughCard fancywalkthroughCard3 = new FancyWalkthroughCard("GrocerHelp will help you !", "By informing about item availability in their nearest shops, GrocerHelp will reduce your exposure to the virus, eliminating unnecessary movements to risk areas.",R.drawable.grocer2);

        fancywalkthroughCard1.setBackgroundColor(R.color.colorGreenActive);
        fancywalkthroughCard1.setIconLayoutParams(900,600,250,0,0,0);
        fancywalkthroughCard2.setBackgroundColor(R.color.colorGreenActive);
        fancywalkthroughCard2.setIconLayoutParams(900,600,250,0,0,0);
        fancywalkthroughCard3.setBackgroundColor(R.color.colorGreenActive);
        fancywalkthroughCard3.setIconLayoutParams(1000,600,260,0,0,0);

        List<FancyWalkthroughCard> pages = new ArrayList<>();

        pages.add(fancywalkthroughCard1);
        pages.add(fancywalkthroughCard2);
        pages.add(fancywalkthroughCard3);


        for (FancyWalkthroughCard page : pages) {
            page.setTitleColor(R.color.black);
//            fancywalkthroughCard4.setBackgroundColor(R.color.white);
            page.setDescriptionColor(R.color.black);
        }

        setFinishButtonTitle("Lets Begin !");
        showNavigationControls(true);
        setColorBackground(R.color.white);
        //setImageBackground(R.drawable.restaurant);
        setInactiveIndicatorColor(R.color.grey_600);
        setActiveIndicatorColor(R.color.white);
        setOnboardPages(pages);


    }

    @Override
    public void onFinishButtonPressed() {
        startActivity(new Intent(getApplicationContext(),LogIn.class));
    }
}
