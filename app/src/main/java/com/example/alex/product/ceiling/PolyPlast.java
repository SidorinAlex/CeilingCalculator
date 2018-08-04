package com.example.alex.product.ceiling;

/**
 * Created by alex on 25.02.2018.
 */

public final class PolyPlast extends CeilingMaterial {


    public PolyPlast(Texture texture) {
        setTexture(texture);
        setUnits("м2");
        setCoastOfWork(0);
        setName("PolyPlast (Бельгия)");
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
                setPrice(250);
                break;
            case COLOR_SATIN:
                setGroupName("Цветные натяжные потолки");
                setMaterialCoast(76);
                setPrice(250);
                break;
            case COLOR_FROSTED:
                setGroupName("Цветные натяжные потолки");
                setMaterialCoast(76);
                setPrice(200);
                break;
            case GLOSS:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(90);
                setPrice(200);
                break;
            case SATIN:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(70);
                setPrice(200);
                break;
            case FROSTED:
                setGroupName("Белые натяжные потолки");
                setMaterialCoast(70);
                setPrice(150);
                break;
        }
    }
}
