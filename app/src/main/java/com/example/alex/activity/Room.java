package com.example.alex.activity;

import com.example.alex.product.Product;
import com.example.alex.product.basicWork.InstallationOfChandelier;
import com.example.alex.product.basicWork.InstallationOfSpotlights;
import com.example.alex.product.basicWork.InstallationOfTheControlUnitAndTheRemoteControl;
import com.example.alex.product.basicWork.InstallationOfTheVentilationGrill100mm;
import com.example.alex.product.basicWork.InstallationOfTheVentilationGrill50mm;
import com.example.alex.product.ceiling.CeilingMaterial;
import com.example.alex.product.chandeliers.Chandelier;
import com.example.alex.product.lEDLights.LedLight;
import com.example.alex.product.lEDPanels.LedPanel;
import com.example.alex.product.ledStrip.ControllerForLedStrip;
import com.example.alex.product.ledStrip.PowerSupplyForLedStrip;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by alex on 04.03.2018.
 */

public class Room implements Serializable {
    private ArrayList<Product> allProductsInTheRoom = new ArrayList<Product>();

    private CeilingMaterial ceilingMaterial;
//    private ArrayList<Baguette> baguettes = new ArrayList<Baguette>(){
//        @Override
//        public boolean add(Baguette baguette) {
//            getAllProductsInTheRoom().put(baguette.getName(),baguette);
//            return super.add(baguette);
//        }
//    };

    private String name;
    private  String address;

    private float perimeter;
    private ArrayList<LedLight> ledLights = new ArrayList<LedLight>() {
        @Override
        public boolean add(LedLight ledLight) {
            getAllProductsInTheRoom().add(ledLight);
            return super.add(ledLight);
        }
    };

    private ArrayList<InstallationOfSpotlights> installationOfSpotlightsArrayList = new ArrayList<InstallationOfSpotlights>() {
        @Override
        public boolean add(InstallationOfSpotlights installationOfSpotlights) {
            getAllProductsInTheRoom().add(installationOfSpotlights);
            return super.add(installationOfSpotlights);
        }
    };

    private ArrayList<LedPanel> ledPanels = new ArrayList<LedPanel>() {
        @Override
        public boolean add(LedPanel ledPanel) {
            getAllProductsInTheRoom().add(ledPanel);
            return super.add(ledPanel);
        }

    };

    private ArrayList<Chandelier> chandeliers = new ArrayList<Chandelier>() {
        @Override
        public boolean add(Chandelier chandelier) {
            getAllProductsInTheRoom().add(chandelier);
            return super.add(chandelier);
        }
    };

    private ArrayList<InstallationOfChandelier> installationOfChandelierArrayList = new ArrayList<InstallationOfChandelier>() {
        @Override
        public boolean add(InstallationOfChandelier installationOfChandelier) {
            getAllProductsInTheRoom().add(installationOfChandelier);
            return super.add(installationOfChandelier);
        }
    };


    private InstallationOfTheVentilationGrill50mm lattice50;
    private InstallationOfTheVentilationGrill100mm lattice100;
    private PowerSupplyForLedStrip powerSupplyForLedStrip;
    private ControllerForLedStrip controllerForLedStrip;
    private InstallationOfTheControlUnitAndTheRemoteControl installationOfTheControlUnitAndTheRemoteControl;


    public Room() {
    }

    public Room(String name) {
        setName(name);
    }

    public ArrayList<Product> getAllProductsInTheRoom() {
        return allProductsInTheRoom;
    }

    public void setAllProductsInTheRoom(ArrayList<Product> allProductsInTheRoom) {
        this.allProductsInTheRoom = allProductsInTheRoom;
    }

    public void putInAllProductsInTheRoom(Product product) {


        Boolean listContainsProduct = false;
        for (Product s : getAllProductsInTheRoom()) {
            if (s.equals(product)) {
                float quantity = s.getQuantity() + product.getQuantity();
                product.setQuantity(quantity);
                getAllProductsInTheRoom().remove(s);
                getAllProductsInTheRoom().add(product);
                listContainsProduct = true;
                break;
            }
        }

        if (!listContainsProduct) {
            getAllProductsInTheRoom().add(product);
        }

    }

    public CeilingMaterial getCeilingMaterial() {
        return ceilingMaterial;
    }

    public void setCeilingMaterial(CeilingMaterial ceilingMaterial) {
        // getAllProductsInTheRoom().put(ceilingMaterial.getName(),ceilingMaterial);
        this.ceilingMaterial = ceilingMaterial;
    }

    //public ArrayList<Baguette> getBaguettes() {
    //   return baguettes;
    //  }

    // public void setBaguettes(ArrayList<Baguette> baguettes) {
    //      this.baguettes = baguettes;
    //   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(float perimeter) {
        this.perimeter = perimeter;
    }

    public ArrayList<LedLight> getLedLights() {
        return ledLights;
    }

    public ArrayList<LedPanel> getLedPanels() {
        return ledPanels;
    }

    public ArrayList<Chandelier> getChandeliers() {
        return chandeliers;
    }

    public ArrayList<InstallationOfSpotlights> getInstallationOfSpotlightsArrayList() {
        return installationOfSpotlightsArrayList;
    }

    public ArrayList<InstallationOfChandelier> getInstallationOfChandelierArrayList() {
        return installationOfChandelierArrayList;
    }


//    public BypassHeatingPipesAndGas getHeatingPipe() {
//        return heatingPipe;
//    }
//
//    public void setHeatingPipe(BypassHeatingPipesAndGas heatingPipe) {
//        //getAllProductsInTheRoom().put(heatingPipe.getName(),heatingPipe);
//        this.heatingPipe = heatingPipe;
//    }
//
//    public SewerPipeBypass getSewagePipe() {
//        return sewagePipe;
//    }

//    public void setSewagePipe(SewerPipeBypass sewagePipe) {
//       getAllProductsInTheRoom().add(sewagePipe);
//
//    }

    public InstallationOfTheVentilationGrill50mm getLattice50() {
        InstallationOfTheVentilationGrill50mm prod = new InstallationOfTheVentilationGrill50mm();

        for (Product p : getAllProductsInTheRoom()) {
            if (p.equals(prod)) {
                return (InstallationOfTheVentilationGrill50mm) p;
            }
        }
        return null;
    }

    public void setLattice50(InstallationOfTheVentilationGrill50mm lattice50) {
        getAllProductsInTheRoom().add(lattice50);
    }

    public InstallationOfTheVentilationGrill100mm getLattice100() {
        return lattice100;
    }

    public void setLattice100(InstallationOfTheVentilationGrill100mm lattice100) {
        this.lattice100 = lattice100;
    }


    public PowerSupplyForLedStrip getPowerSupplyForLedStrip() {
        return powerSupplyForLedStrip;
    }

    public void setPowerSupplyForLedStrip(PowerSupplyForLedStrip powerSupplyForLedStrip) {
        this.powerSupplyForLedStrip = powerSupplyForLedStrip;
    }

    public ControllerForLedStrip getControllerForLedStrip() {
        return controllerForLedStrip;
    }

    public void setControllerForLedStrip(ControllerForLedStrip controllerForLedStrip) {
        this.controllerForLedStrip = controllerForLedStrip;
    }

    @Override
    public String toString() {

        String strBaguettes = "";

//        for (Baguette b:baguettes) {
//            strBaguettes = strBaguettes + " " + b.getName() + " в количестве " + b.getQuantity() + " метров стоит " + b.getTotalPrice();
//        }

        return strBaguettes;


//        return name + ":/n" +
//                "ceilingMaterials=" + ceilingMaterial.toString() + " в количестве " + ceilingMaterial.getQuantity()
//                + " метров стоит " + ceilingMaterial.getTotalPrice() + "/n"+
//                strBaguettes;
    }
}
