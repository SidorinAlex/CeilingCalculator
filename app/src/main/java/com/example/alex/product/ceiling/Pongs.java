package com.example.alex.product.ceiling;

/**
 * Created by alex on 26.02.2018.
 */

public final class Pongs extends CeilingMaterial {

    public Pongs(Texture texture) {
        setTexture(texture);
        setUnits("м2");
        setName("Pongs (Германия)");
        setCoastOfWork(0);
    }


    @Override
    public void setTexture(Texture texture) {
        super.setTexture(texture);
        setMaterialCoastAndPrice();
    }

    public void setMaterialCoastAndPrice() {
        switch (getTexture()) {
            case COLOR_GLOSS:
                setGroupName("Цветные натяжные потолки");
                setMaterialCoast(110);
                setPrice(300);
                break;
            case COLOR_SATIN:
                setGroupName("Цветные натяжные потолки");
                setMaterialCoast(76);
                setPrice(300);
                break;
            case COLOR_FROSTED:
                setGroupName("Цветные натяжные потолки");
                setMaterialCoast(76);
                setPrice(250);
                break;
            case GLOSS:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(90);
                setPrice(250);
                break;
            case SATIN:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(70);
                setPrice(250);
                break;
            case FROSTED:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(70);
                setPrice(200);
                break;

        }
    }
}

