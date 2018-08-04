package com.example.alex.product.ceiling;

/**
 * Created by alex on 26.02.2018.
 */

public final class Descor extends CeilingMaterial {

    public Descor(Texture texture) {
        setTexture(texture);
        setGroupName("Тканевые потолки");
        setName("Pongs (Descor)");
    }

    @Override
    public void setTexture(Texture texture) {
        super.setTexture(texture);
        setMaterialCoastAndPrice(texture);
    }

    public void setMaterialCoastAndPrice(Texture texture) {

        switch (getTexture()) {
            case WHITE:
                setMaterialCoast(350);
                setPrice(950);
                break;
            case COLOR:
                setMaterialCoast(450);
                setPrice(1200);
                break;
        }
    }
}
