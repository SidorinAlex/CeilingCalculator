package com.example.alex.product.ceiling;

/**
 * Created by alex on 26.02.2018.
 */

public final class Exclusive extends CeilingMaterial {

    public Exclusive(Texture texture) {
        setTexture(texture);
        setUnits("м2");
        setGroupName("Натяжные потолки Exclusive");

    }

    @Override
    public void setTexture(Texture texture) {
        super.setTexture(texture);
        setTypeOfExclusive();
    }

    public void setTypeOfExclusive() {
        switch (getTexture()) {
            case SKY:
                setMaterialCoast(184);
                setPrice(400);
                setName("PolyPlast (Бельгия)");
                break;
            case GALAXY:
                setMaterialCoast(184);
                setPrice(400);
                setName("PolyPlast (Бельгия)");
                break;
            case EXCLUSIVE:
                setMaterialCoast(400);
                setPrice(500);
                setName("Exclusive");
                break;
            case VENETIAN_PLASTER:
                setMaterialCoast(77);
                setPrice(350);
                setName("PolyPlast (Бельгия)");
                break;
        }
    }

}


