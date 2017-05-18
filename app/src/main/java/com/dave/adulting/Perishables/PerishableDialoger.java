package com.dave.adulting.Perishables;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import com.dave.adulting.R;
import com.google.firebase.database.DatabaseReference;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Dave - Work on 5/16/2017.
 */

class PerishableDialoger {
    public static void addDialog(Context ctx, final PerAddListener listener){
        View diag = ((LayoutInflater)ctx.getSystemService(ctx.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.dialog_add_perishable,null);
        final EditText description = (EditText) diag.findViewById(R.id.perDiaDescription);
        final EditText estimate = (EditText) diag.findViewById(R.id.perDiaEstimate);

        AlertDialog.Builder builder = new AlertDialog.Builder(ctx);
        builder.setView(diag);
        builder.setPositiveButton("OK",null);
        builder.setNegativeButton("Cancel",null);
        final AlertDialog dialog = builder.create();
        dialog.show();

        dialog.getButton(DialogInterface.BUTTON_POSITIVE).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(description.getText().length()==0){
                    description.setError("Required");
                } else {
                    Calendar cal = GregorianCalendar.getInstance();
                    long added = cal.getTime().getTime();
                    cal.add(Calendar.DAY_OF_YEAR,
                            Integer.parseInt(estimate.getText().toString()));
                    listener.addPerishable(new Perishable(
                            description.getText().toString(),
                            cal.getTime().getTime(),
                            added
                    ));
                    dialog.dismiss();
                }

            }
        });
    }

    interface PerAddListener{
        void addPerishable(Perishable per);
    }
}
