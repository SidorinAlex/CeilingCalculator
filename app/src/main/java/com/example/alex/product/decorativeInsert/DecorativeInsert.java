package com.example.alex.product.decorativeInsert;

import com.example.alex.product.Product;
import com.example.alex.product.ceiling.Texture;

/**
 * Created by SidorinAlex on 24.06.2018.
 */

public final class DecorativeInsert extends Product {
    public DecorativeInsert(Texture texture) {
        setGroupName("Декоративные вставки");
        setTextColor(texture);
        setUnits("м.п.");
        setCoastOfWork(15);
    }

    public DecorativeInsert() {
        setGroupName("Декоративные вставки");
        setUnits("м.п.");
        setCoastOfWork(15);
    }


    public void setTextColor(Texture texture) {
        super.setTexture(texture);
        setColor(texture);
    }


    public void setColor(Texture texture) {

        if (texture.equals(Texture.BASE)) {
            setMaterialCoast(5.6f);
            setPrice(50);
            setName("Установка белой декоративной вставки");

        }
        if (texture.equals(Texture.COLOR)) {
            setMaterialCoast(20);
            setPrice(100);
            setName("Установка цветной декоративной вставки");
        }
    }
}
