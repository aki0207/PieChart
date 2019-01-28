package com.example.piechart;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sample_pie_chart_view);

        PieChartView pieChartView = (PieChartView) findViewById(R.id.pie_chart);

        List<PieChartView.PieceDataHolder> pieceDataHolders = new ArrayList<>();
        pieceDataHolders.add(new PieChartView.PieceDataHolder(1,Color.RED, "天才，１"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(5, Color.GREEN, "凡才，２"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(3, Color.BLUE, "あほ，３"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(5, Color.YELLOW, "無能，４"));
        /*pieceDataHolders.add(new PieChartView.PieceDataHolder(0, 0xFF11AA33, "小京，５"));
        pieceDataHolders.add(new PieChartView.PieceDataHolder(0, Color.BLUE, "花花，６"));*/


        pieChartView.setData(pieceDataHolders);

    }
}
