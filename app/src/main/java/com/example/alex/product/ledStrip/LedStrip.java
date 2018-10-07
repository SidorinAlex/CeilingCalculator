package com.example.alex.product.ledStrip;

import com.example.alex.product.ceiling.Texture;

/**
 * Created by alex on 01.03.2018.
 */

public final class LedStrip extends LedProduct {


    public LedStrip(Texture texture) {
        setTextColor(texture);
        setUnits("м.п.");
    }

    public LedStrip() {
        setUnits("м.п.");
    }

    public void setTextColor(Texture texture) {
        super.setTexture(texture);
        setColor(texture);
    }


    public void setColor(Texture texture) {

        if (texture.equals(Texture.COLOR)) {
            setMaterialCoast(120);
            setCoastOfWork(50);
            setPrice(450);
            setName("Установка RGB светодиодной ленты");

        }
        if (texture.equals(Texture.BASE)) {
            setMaterialCoast(95);
            setCoastOfWork(50);
            setPrice(400);
            setName("Установка одноцветной светодиодной ленты");
        }
    }
}
