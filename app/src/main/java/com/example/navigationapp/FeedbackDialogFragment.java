package com.example.navigationapp;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

public class FeedbackDialogFragment extends DialogFragment {
    final String[] answers = {"Java", "Python", "C#", "JavaScript"};
    final int[] correctAnswer = {0};
    private final String fullName;
    private final String email;

    public FeedbackDialogFragment(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    @NonNull
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
        return builder
                .setTitle("Информация о заявке")
                .setMessage("ФИО: " + fullName + "\nEmail: " + email)
                .setIcon(R.drawable.outline_info_24)
                .setPositiveButton("Ок", (dialog, which) -> {
                    dialog.dismiss();
                })
                .create();
    }
}