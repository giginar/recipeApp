package com.kucukcinar.recipeapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.kucukcinar.recipeapp.R;
import com.kucukcinar.recipeapp.models.InstructionsResponse;

import java.util.List;

public class InstructionAdapter extends RecyclerView.Adapter<InstructionsViewHolder> {
    Context context;
    List<InstructionsResponse> list;

    public InstructionAdapter(Context context, List<InstructionsResponse> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public InstructionsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new InstructionsViewHolder(LayoutInflater.from(context).inflate(R.layout.list_instructions, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull InstructionsViewHolder holder, int position) {
        holder.textView_instructions_name.setText(list.get(position).name);
        holder.recycler_instruction_steps.setHasFixedSize(true);
        holder.recycler_instruction_steps.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false));
        InstructionStepAdapter stepAdapter = new InstructionStepAdapter(context, list.get(position).steps);
        holder.recycler_instruction_steps.setAdapter(stepAdapter);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

class InstructionsViewHolder extends RecyclerView.ViewHolder {
    TextView textView_instructions_name;
    RecyclerView recycler_instruction_steps;
    public InstructionsViewHolder(@NonNull View itemView) {
        super(itemView);
        textView_instructions_name = itemView.findViewById(R.id.textView_instructions_name);
        recycler_instruction_steps = itemView.findViewById(R.id.recycler_instruction_steps);
    }
}
