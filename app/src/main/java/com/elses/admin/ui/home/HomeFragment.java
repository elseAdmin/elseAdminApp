package com.elses.admin.ui.home;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.elses.admin.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private EditText CarSlot1, CarSlot2, CarSlot3, CarSlot4, CarSlot5,
            CarSlot6, CarSlot7, CarSlot8, CarSlot9, CarSlot10;
    private TextView result;

    private DatabaseReference db;
    private HashMap<String, String> slotData;

    private static final String GenericTag = "SlotBooking";

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i(GenericTag,"Car Slots available");
        final View root = inflater.inflate(R.layout.fragment_home, container, false);
        CarSlot1 = root.findViewById(R.id.slot1);
        CarSlot2 = root.findViewById(R.id.slot2);
        CarSlot3 = root.findViewById(R.id.slot3);
        CarSlot4 = root.findViewById(R.id.slot4);
        CarSlot5 = root.findViewById(R.id.slot5);
        CarSlot6 = root.findViewById(R.id.slot6);
        CarSlot7 = root.findViewById(R.id.slot7);
        CarSlot8 = root.findViewById(R.id.slot8);
        CarSlot9 = root.findViewById(R.id.slot9);
        CarSlot10 = root.findViewById(R.id.slot10);
        slotData = new HashMap<>();
        addHashMapData(slotData);
        result = root.findViewById(R.id.text_result);
        return root;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.w(GenericTag, "Calling update value method ");
        updateValue();
    }

    private void addHashMapData(HashMap<String,String> slotData){
        slotData.put("CarSlot1","0");
        slotData.put("CarSlot2","0");
        slotData.put("CarSlot3","0");
        slotData.put("CarSlot4","0");
        slotData.put("CarSlot5","0");
        slotData.put("CarSlot6","0");
        slotData.put("CarSlot7","0");
        slotData.put("CarSlot8","0");
        slotData.put("CarSlot9","0");
        slotData.put("CarSlot10","0");
    }

    private void updateValue(){
        db = FirebaseDatabase.getInstance().getReference();
        db.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot slotSnapshot : dataSnapshot.getChildren()){
                    String snapshotKey = slotSnapshot.getKey();
                    if(slotData.containsKey(snapshotKey)){
                        String slot = slotSnapshot.getValue(String.class);
                        slotData.put(snapshotKey, slot);
                    }
                    Log.i(GenericTag,"Car Slots data " + Arrays.asList(slotData));

                    for(Map.Entry<String, String> slot : slotData.entrySet()){
//                        Log.i(GenericTag,"Car Slots key " + slot.getKey() + " value " + slot.getValue());
                        switch(slot.getKey()){
                            case "CarSlot1" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot1.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot1.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot2" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot2.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot2.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot3" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot3.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot3.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot4" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot4.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot4.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot5" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot5.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot5.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot6" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot6.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot6.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot7" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot7.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot7.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot8" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot8.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot8.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot9" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot9.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot9.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;

                            case "CarSlot10" :
                                if (slot.getValue().equalsIgnoreCase("0")){
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot10.getBackground().mutate();
                                    gradient1.setColor(Color.LTGRAY);
                                }
                                else{
                                    GradientDrawable gradient1 = (GradientDrawable) CarSlot10.getBackground().mutate();
                                    gradient1.setColor(Color.RED);
                                }
                                break;
                        }
                    }

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                Log.w(GenericTag, "Value change listener failed for slots, ", databaseError.toException());
            }
        });
    }
}