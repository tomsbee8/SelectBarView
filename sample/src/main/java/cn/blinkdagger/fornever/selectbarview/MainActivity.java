package cn.blinkdagger.fornever.selectbarview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private SelectBarView mSelectBarView;
    private ViewPager mViewPager;

    String[] mTitles = new String[]{"主页", "搜索", "订阅"};
    Fragment homeFragment, searchFragment, mineFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSelectBarView = findViewById(R.id.main_select_bar);
        mViewPager = findViewById(R.id.main_viewpager);
        mSelectBarView.setItemGroup(mTitles);
        mSelectBarView.setOnItemCheckedChangeListener(new SelectBarView.OnItemCheckedChangeListener() {
            @Override
            public void onItemChecked(int index) {
                if (mViewPager != null) {
                    mViewPager.setCurrentItem(index);
                }
            }
        });
        setupViewPager();
    }

    private void setupViewPager() {
        homeFragment = MainFragment.newInstance(mTitles[0]);
        searchFragment = MainFragment.newInstance(mTitles[1]);
        mineFragment = MainFragment.newInstance(mTitles[2]);

        BaseFragmentAdapter adapter = new BaseFragmentAdapter(getSupportFragmentManager(), new Fragment[]{homeFragment, searchFragment, mineFragment}, mTitles);
        mViewPager.setAdapter(adapter);
        mViewPager.setOffscreenPageLimit(3);
        mViewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        switch (position) {
            case 0:
            case 1:
            case 2:
                mSelectBarView.setItemChecked(position);
                break;
            default:
                break;
        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
