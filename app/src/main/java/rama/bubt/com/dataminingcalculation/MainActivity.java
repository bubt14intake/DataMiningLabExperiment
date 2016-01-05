package rama.bubt.com.dataminingcalculation;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
         {

             DrawerLayout mDrawerLayout;
             NavigationView mNavigationView;
             FragmentManager mFragmentManager;
             FragmentTransaction mFragmentTransaction;

             @Override
             protected void onCreate(Bundle savedInstanceState) {
                 super.onCreate(savedInstanceState);
                 setContentView(R.layout.activity_main);

                 mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
                 mNavigationView = (NavigationView) findViewById(R.id.shitstuff) ;

                 final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);



                 mFragmentManager = getSupportFragmentManager();
                 mFragmentTransaction = mFragmentManager.beginTransaction();
                 mFragmentTransaction.replace(R.id.containerView,new StandardDVAcivity()).commit();

                 mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                     @Override
                     public boolean onNavigationItemSelected(MenuItem menuItem) {
                         mDrawerLayout.closeDrawers();


                         if (menuItem.getItemId() == R.id.nav_item_standard_deviation) {
                             FragmentTransaction fragmentTransaction = mFragmentManager.beginTransaction();
                             fragmentTransaction.replace(R.id.containerView, new StandardDVAcivity()).commit();
                             toolbar.setTitle(R.string.title_standard_deviation);
                         }

                         if (menuItem.getItemId() == R.id.nav_correlation) {
                             FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                             xfragmentTransaction.replace(R.id.containerView, new CorrelationAcivity()).commit();
                             toolbar.setTitle(R.string.title_correlation_);
                         }
                         if (menuItem.getItemId() == R.id.nav_liner_regrassion) {
                             FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                             xfragmentTransaction.replace(R.id.containerView, new LinerRegressionAcivity()).commit();
                             toolbar.setTitle(R.string.liner_regration);
                         }
                         if (menuItem.getItemId() == R.id.nav_classification) {
                             FragmentTransaction xfragmentTransaction = mFragmentManager.beginTransaction();
                             xfragmentTransaction.replace(R.id.containerView, new ClassificationActivity()).commit();
                             toolbar.setTitle(R.string.title_classification);
                         }
                         return false;
                     }

                 });

                 ActionBarDrawerToggle mDrawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout, toolbar,R.string.app_name,
                         R.string.app_name);

                 mDrawerLayout.setDrawerListener(mDrawerToggle);

                 mDrawerToggle.syncState();



             }
}
