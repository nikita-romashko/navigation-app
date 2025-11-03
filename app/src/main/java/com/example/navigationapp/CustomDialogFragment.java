package com.example.navigationapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class CustomDialogFragment extends DialogFragment {
    final String[] answers = {"Java", "Python", "C#", "JavaScript"};
    final int[] correctAnswer = {0};

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Выберите правильный ответ")
                .setIcon(R.drawable.test_icon)
                .setSingleChoiceItems(answers, -1, (dialog, which) -> {
                    if (which == correctAnswer[0]) {
                        Toast.makeText(getActivity(), "Правильно! ✅", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(getActivity(), "Неправильно! ❌", Toast.LENGTH_SHORT).show();
                    }
                    dialog.dismiss();
                })
                .setNegativeButton("Отмена", (dialog, which) -> {
                    dialog.dismiss();
                })
                .create();
    }
}