package loftschool.imagecompetition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List<String> items = new ArrayList<>();

    static {
        items.add("http://i.telegraph.co.uk/multimedia/archive/02778/MUSKsum_2778344b.jpg");
        items.add("http://www.snopes.com/wordpress/wp-content/uploads/2016/02/tesla.jpg");
        items.add("http://s.newsweek.com/sites/www.newsweek.com/files/2015/01/16/elon-musk.jpg");
        items.add("http://media2.s-nbcnews.com/i/MSNBC/Components/Photo/_new/130716-elon-musk-3p.jpg");
        items.add("http://static6.businessinsider.com/image/53974a73eab8ea4f4b457b27/heres-why-elon-musk-is-the-most-impressive-member-of-the-paypal-mafia.jpg");
        items.add("http://i.telegraph.co.uk/multimedia/archive/02778/MUSKsum_2778344b.jpg");
        items.add("http://c1gas2org.wpengine.netdna-cdn.com/files/2014/04/elon-musk-model-s.jpg");
        items.add("http://rack.3.mshcdn.com/media/ZgkyMDE1LzEyLzIyLzIyL2Vsb25tdXNrLmE3ZmFlLmpwZwpwCXRodW1iCTk1MHg1MzQjCmUJanBn/5052d651/91c/elon-musk.jpg");
        items.add("http://www.technobuffalo.com/wp-content/uploads/2015/05/elonmusk.jpg");
        items.add("http://static1.businessinsider.com/image/5194c0f5ecad042305000013/elon-musk-is-borrowing-another-150-million-from-goldman-sachs-to-buy-more-tesla-stock.jpg");
        items.add("https://static-secure.guim.co.uk/sys-images/Observer/Pix/pictures/2015/4/9/1428592853111/Elon-Musk-at-Space-X-head-009.jpg");
        items.add("http://static6.businessinsider.com/image/5522cb3eecad04664b54f8d4/5-things-elon-musk-believed-would-change-the-future-of-humanity-in-1995.jpg");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhotosAdapter photosAdapter = new PhotosAdapter(this, items);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.photos);
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(photosAdapter);
        }

    }
}
