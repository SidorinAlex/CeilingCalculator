package com.example.alex.product.ceiling;

/**
 * Created by alex on 25.02.2018.
 */

public enum Texture {
    BASE("нет текстуры"), WHITE("белый"), COLOR("цветной"),
    GLOSS("белый глянцевый"), FROSTED("белый матовый"), SATIN("белый сатиновый"),
    COLOR_GLOSS("цветной глянцевый"), COLOR_FROSTED("цветной матовый"), COLOR_SATIN("цветной сатиновый"),
    EXCLUSIVE(""), VENETIAN_PLASTER("Венец. штукат."), GALAXY("Галактика"), SKY("Небо"), FABRIC("Ткань");

    private String value;

    Texture(String value) {
        this.value = value;
    }

    public static Texture getEnum(String value) {
        for (Texture v : values())
            if (v.getValue().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return this.getValue();
    }
}

