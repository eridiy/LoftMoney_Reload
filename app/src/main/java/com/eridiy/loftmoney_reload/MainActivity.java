package com.eridiy.loftmoney_reload;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eridiy.loftmoney_reload.cells.MoneyCellAdapter;
import com.eridiy.loftmoney_reload.cells.MoneyCellAdapterClick;
import com.eridiy.loftmoney_reload.cells.MoneyItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView itemsView;

    private MoneyCellAdapter moneyCellAdapter = new MoneyCellAdapter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureRecyclerView();

        generateMoney();
    }

    private void generateMoney () {
        List<MoneyItem> moneyItems = new ArrayList<>();
        moneyItems.add(new MoneyItem("PS5", "75000Р"));
        moneyItems.add(new MoneyItem("Salary", "300000Р"));

        moneyCellAdapter.setMoneyData(moneyItems);

    }

    private void configureRecyclerView() {
        itemsView = findViewById(R.id.itemsView);
        itemsView.setAdapter(moneyCellAdapter);

        moneyCellAdapter.moneyCellAdapterClick = new MoneyCellAdapterClick() {
            @Override
            public void onCellClick(MoneyItem moneyItem) {
                Toast.makeText(getApplicationContext(), "Cell clicked " + moneyItem.getValue(), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onTitleClick() {
                Toast.makeText(getApplicationContext(), "Title clicked ", Toast.LENGTH_LONG).show();
            }
        };

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext(),
                LinearLayoutManager.VERTICAL, false);

        itemsView.setLayoutManager(layoutManager);
    }
}