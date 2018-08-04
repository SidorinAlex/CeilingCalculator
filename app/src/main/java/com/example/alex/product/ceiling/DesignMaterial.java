package com.example.alex.product.ceiling;

/**
 * Created by SidorinAlex on 30.06.2018.
 */

public final class DesignMaterial extends CeilingMaterial {

    public DesignMaterial(Texture texture) {
        setTexture(texture);
        setUnits("м2");
        setCoastOfWork(0);
    }

    public void setTexture(Texture texture) {
        super.setTexture(texture);
        setMaterialCoastAndPrice();
    }

    public void setMaterialCoastAndPrice() {

        switch (getTexture()) {
            case COLOR:
                setGroupName("Цветные натяжные потолки");
                setName("Цветной/фактурный Дизайн+");
                setMaterialCoast(250);
                setPrice(500);
                break;
            case BASE:
                setGroupName("Белые натяжные потолки");
                setName("Белый глянец/матовый Дизайн+");
                setMaterialCoast(130);
                setPrice(350);
                break;

        }
    }
}
