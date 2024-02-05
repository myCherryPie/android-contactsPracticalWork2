package ru.yandex.practicum.contacts.presentation.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import org.jetbrains.annotations.Nullable;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public class BaseListDiffCallback <S extends ListDiffInterface<S>> extends DiffUtil.ItemCallback<S>{
    @Override
    public boolean areItemsTheSame(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return oldItem.hashCode() == newItem.hashCode();
    }

    @Override
    public boolean areContentsTheSame(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return oldItem.equals(newItem);
    }

    @Nullable
    @Override
    public Object getChangePayload(@NonNull ContactUi oldItem, @NonNull ContactUi newItem) {
        return newItem;
    }
}
