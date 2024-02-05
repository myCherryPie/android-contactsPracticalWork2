package ru.yandex.practicum.contacts.presentation.base;

import ru.yandex.practicum.contacts.presentation.main.ContactUi;

public interface ListDiffInterface <T> {

    public boolean equals(Object o);

    boolean theSameAs(T t);
}
