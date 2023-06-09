package ru.academits.smolenskaya.converter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ru.academits.smolenskaya.service.ContactValidation;

public class ContactValidationConverter {
    private final Gson gson = new GsonBuilder().create();

    public String convertToJson(ContactValidation contactValidation) {
        return gson.toJson(contactValidation);
    }
}
