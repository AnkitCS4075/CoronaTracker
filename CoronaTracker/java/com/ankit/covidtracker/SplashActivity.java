package com.ankit.covidtracker;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_SCREEN_TIMEOUT = 2000;

//    private String version;
//    private  String appUrl;
//    private FirebaseDatabase firebaseDatabase;
//    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.cardBackground));

//        CheckForUpdate();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_SCREEN_TIMEOUT);


    }

//    private void CheckForUpdate() {
//        try {
//            version = this.getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
////        } catch(Exception e) {
//            firebaseDatabase = FirebaseDatabase.getInstance(); // Initialising firebaseDatabase variable
//            databaseReference = firebaseDatabase.getReference().child("Version").child("versionNumber"); // setting the root
//
//            databaseReference.addListenerForSingleValueEvent(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull DataSnapshot snapshot) {
//                    String versionName = (String) snapshot.getValue();
//
//                    if (!versionName.equals(version)) {
//                        AlertDialog alertDialog = new AlertDialog.Builder(SplashActivity.this).setTitle("New Version Available!")
//                                .setMessage("Please update our app to the latest version for continuous use.")
//                                .setPositiveButton("UPDATE", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//                                DatabaseReference myRef = firebaseDatabase.getInstance().getReference("Version").child("appUrl");
//                                myRef.addListenerForSingleValueEvent(new ValueEventListener() {
//                                    @Override
//                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
//                                        appUrl = snapshot.getValue().toString();
//                                        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(appUrl)));
//                                        finish();
//                                    }
//
//                                    @Override
//                                    public void onCancelled(@NonNull DatabaseError error) {
//
//                                    }
//                                });
//                            }
//                        }).setNegativeButton("EXIT", new DialogInterface.OnClickListener() {
//                                    @Override
//                                    public void onClick(DialogInterface dialog, int which) {
//                                        finish();
//                                    }
//                                }).create();
//
//                        alertDialog.setCancelable(false);
//                        alertDialog.setCanceledOnTouchOutside(false);
//                        alertDialog.show();
//                    }
//                    else {
//
//                        new Handler().postDelayed(new Runnable() {
//                            @Override
//                            public void run() {
//                                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
//                                startActivity(intent);
//                                finish();
//                            }
//                        }, SPLASH_SCREEN_TIMEOUT);
//                    }
//                }
//
//                @Override
//                public void onCancelled(@NonNull DatabaseError error) {
//
//                }
//            });
//
//        } catch(Exception e) {
//            e.printStackTrace();
//        }
//
//    }
}