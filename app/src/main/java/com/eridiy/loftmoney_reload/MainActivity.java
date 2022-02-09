package com.eridiy.loftmoney_reload;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

// Заранее извиняюсь за вид комментария, думаю дальше такого не будет
// Я так понимаю, что в дальнейшем этот экран станет входом,
// где нужно логиниться. А пока я здесь ничего не делал кроме
// перехода на экран с добавлением позиции, как нужно было в ДЗ.
// Поигрался с цветами и темой и полями ввода. Только ввод суммы пока что целочисленный.
// Локализацию и экраны по ТЗ сделал.
//
// ЗЫ: Андрей, если найдешь в коде лишние строки и несоответствия, то знай -
// это я пытался сразу создать главный экран с тремя вкладками и потом плохо удалил
// этот активити (понял, что сильно замахнулся). Дальше я просто создам новый проект и
// перетащу из этого всё, что хорошо получилось)


    Button enterButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterButton = (Button) findViewById(R.id.enterButton);
        enterButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.enterButton) {
            Intent intent = new Intent(this, ActivityExpenses.class);
            startActivity(intent);
        }
    }
}