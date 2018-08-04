package com.example.alex.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.product.Product;
import com.example.alex.product.baguette.AluminumBaguette;
import com.example.alex.product.baguette.AluminumBaguetteOnGlue;
import com.example.alex.product.baguette.AluminumSeparator;
import com.example.alex.product.baguette.Angle;
import com.example.alex.product.baguette.Baguette;
import com.example.alex.product.baguette.BendOfTheCloth;
import com.example.alex.product.baguette.FloatingBaguette;
import com.example.alex.product.baguette.PvhBaguette;
import com.example.alex.product.baguette.PvhBaguetteForFabric;
import com.example.alex.product.basicWork.BasicWork;
import com.example.alex.product.basicWork.BypassHeatingPipesAndGas;
import com.example.alex.product.basicWork.InstallationOfCeilingCornices;
import com.example.alex.product.basicWork.InstallationOfChandelier;
import com.example.alex.product.basicWork.InstallationOfElectricalCable;
import com.example.alex.product.basicWork.InstallationOfFabricCeiling;
import com.example.alex.product.basicWork.InstallationOfFireAlarmSystem;
import com.example.alex.product.basicWork.InstallationOfFlexibleEaves;
import com.example.alex.product.basicWork.InstallationOfNicheWithCornice;
import com.example.alex.product.basicWork.InstallationOfSpotlights;
import com.example.alex.product.basicWork.InstallationOfStretchCeilings;
import com.example.alex.product.basicWork.InstallationOfTheControlUnitAndTheRemoteControl;
import com.example.alex.product.basicWork.InstallationOfTheFixingPoint;
import com.example.alex.product.basicWork.InstallationOfTheRadioSwitch;
import com.example.alex.product.basicWork.InstallationOfTheVentilationGrill100mm;
import com.example.alex.product.basicWork.InstallationOfTheVentilationGrill50mm;
import com.example.alex.product.basicWork.SewerPipeBypass;
import com.example.alex.product.ceiling.CTN;
import com.example.alex.product.ceiling.CeilingMaterial;
import com.example.alex.product.ceiling.Descor;
import com.example.alex.product.ceiling.DesignMaterial;
import com.example.alex.product.ceiling.Exclusive;
import com.example.alex.product.ceiling.PolyPlast;
import com.example.alex.product.ceiling.Pongs;
import com.example.alex.product.ceiling.Texture;
import com.example.alex.product.ceilingCornices.CeilingCornice;
import com.example.alex.product.ceilingCornices.CorniceThreeRow2400mm;
import com.example.alex.product.ceilingCornices.CorniceThreeRow2600mm;
import com.example.alex.product.ceilingCornices.CorniceThreeRow3000mm;
import com.example.alex.product.ceilingCornices.CorniceThreeRow3200mm;
import com.example.alex.product.ceilingCornices.CorniceThreeRow3600mm;
import com.example.alex.product.ceilingCornices.CorniceThreeRow4000mm;
import com.example.alex.product.ceilingCornices.FlexibleCornice5000mm;
import com.example.alex.product.ceilingCornices.HoodForBeigeCornice;
import com.example.alex.product.ceilingCornices.HoodForBrownCornice;
import com.example.alex.product.ceilingCornices.HoodForWhiteCornice;
import com.example.alex.product.chandeliers.Chandelier;
import com.example.alex.product.chandeliers.SBL_CL_110W_301_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_18W_160_4K;
import com.example.alex.product.chandeliers.SBL_CL_23W_163_4K;
import com.example.alex.product.chandeliers.SBL_CL_25W_1601_4K;
import com.example.alex.product.chandeliers.SBL_CL_25W_4009_4K;
import com.example.alex.product.chandeliers.SBL_CL_25W_4015_4K;
import com.example.alex.product.chandeliers.SBL_CL_38W_304_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_45W_307_4K;
import com.example.alex.product.chandeliers.SBL_CL_45W_4005_4K;
import com.example.alex.product.chandeliers.SBL_CL_48W_313_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_55W_4003_4K;
import com.example.alex.product.chandeliers.SBL_CL_60W_302_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_65W_305_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_75W_312_4K_White;
import com.example.alex.product.chandeliers.SBL_CL_75W_319_4K_White;
import com.example.alex.product.chandeliers.SebestoimostSBL_CL_42W_310_4K;
import com.example.alex.product.chandeliers.SebestoimostSBL_CL_65W_303_4K_White;
import com.example.alex.product.decorativeInsert.DecorativeInsert;
import com.example.alex.product.design.CurvilinearAdhesion;
import com.example.alex.product.design.Design;
import com.example.alex.product.design.PhotoPrinting;
import com.example.alex.product.design.StraightAdhesion;
import com.example.alex.product.lEDLights.BulbForNovotechLedOdeonG94W;
import com.example.alex.product.lEDLights.BulbMR16GU53_7W_4500K;
import com.example.alex.product.lEDLights.BulbMR16GU53_7W_6000K;
import com.example.alex.product.lEDLights.GX53BlackChrome;
import com.example.alex.product.lEDLights.GX53Chrome;
import com.example.alex.product.lEDLights.GX53Gold;
import com.example.alex.product.lEDLights.GX53white;
import com.example.alex.product.lEDLights.LedLight;
import com.example.alex.product.lEDLights.LedOdeonGX53_5_6W_3000К;
import com.example.alex.product.lEDLights.LedOdeonGX53_5_6W_4500К;
import com.example.alex.product.lEDLights.LedOdeonGX53_5_6W_6000К;
import com.example.alex.product.lEDLights.LedOdeonGX53_7_8W_3000К;
import com.example.alex.product.lEDLights.LedOdeonGX53_7_8W_4500К;
import com.example.alex.product.lEDLights.LedOdeonGX53_7_8W_6000К;
import com.example.alex.product.lEDLights.LedOdeonGX53_9_10W_3000К;
import com.example.alex.product.lEDLights.LedOdeonGX53_9_10W_4500К;
import com.example.alex.product.lEDLights.LedOdeonGX53_9_10W_6000К;
import com.example.alex.product.lEDLights.MR16DL90GU53Chrome;
import com.example.alex.product.lEDLights.MR16DL90GU53Gold;
import com.example.alex.product.lEDLights.MR16DL90GU53White;
import com.example.alex.product.lEDLights.Novotech;
import com.example.alex.product.lEDPanels.AlfaLF401_12W;
import com.example.alex.product.lEDPanels.AlfaLF401_18W;
import com.example.alex.product.lEDPanels.AlfaLF401_6W;
import com.example.alex.product.lEDPanels.AlfaLY301_7W;
import com.example.alex.product.lEDPanels.AlfaLY501_12W;
import com.example.alex.product.lEDPanels.AlfaLY501_18W;
import com.example.alex.product.lEDPanels.AlfaLY501_6W;
import com.example.alex.product.lEDPanels.AlfaX002_LY206_6add2W;
import com.example.alex.product.lEDPanels.FeronAL500_6W;
import com.example.alex.product.lEDPanels.LedPanel;
import com.example.alex.product.lEDPanels.OdeonFNC77W4500K;
import com.example.alex.product.lEDPanels.OdeonFND77W6000K;
import com.example.alex.product.lEDPanels.OdeonFNW77W3000K;
import com.example.alex.product.lEDPanels.RSP7W_3000K;
import com.example.alex.product.lEDPanels.RS_8W_5000K;
import com.example.alex.product.ledStrip.ControllerForLedStrip;
import com.example.alex.product.ledStrip.LedStrip;
import com.example.alex.product.ledStrip.PowerSupplyForLedStrip;
import com.example.alex.product.multilevel.CurvilinearTransitionToAnotherLevelPvh;
import com.example.alex.product.multilevel.CurvilinearTransitionToAnotherLevelWithBackLight;
import com.example.alex.product.multilevel.StraightTransitionToAnotherLevel;
import com.example.alex.product.secondaryWork.CurvedWallSection;
import com.example.alex.product.secondaryWork.HeightOver4Meters;
import com.example.alex.product.secondaryWork.InstallationUsingVacuumCleaner;
import com.example.alex.product.secondaryWork.MountingInHardToReachLocation;
import com.example.alex.product.secondaryWork.MountingOnPorcelainTiles;
import com.example.alex.product.secondaryWork.MountingTheCoarseGrainedElement;
import com.example.alex.product.secondaryWork.MountingToTile;
import com.example.alex.product.secondaryWork.SecondaryWork;
import com.example.alex.product.setTimber.HiddenTimber;
import com.example.alex.product.setTimber.MortgageOfTimber;
import com.example.alex.product.setTimber.OpenTimber;
import com.example.alex.product.setTimber.Timber;
import com.example.alex.util.RequestCode;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Room room = new Room("Заказ");
    Order order = new Order("Адресс не заполнен");
    InstallationOfStretchCeilings installingCeiling = new InstallationOfStretchCeilings();
    InstallationOfFabricCeiling installationOfFabricCeiling = new InstallationOfFabricCeiling();


    CeilingMaterial ceilingMaterial = new PolyPlast(Texture.FROSTED);

    Baguette baguette;
    LedPanel ledPanelForRoom;
    LedLight lampForRoom;
    LedLight bulbForRoom;
    Chandelier chandelierForRoom;
    LedStrip ledStrip;
    DecorativeInsert decorativeInsert = new DecorativeInsert();
    SecondaryWork installationSecondWork;
    Design design;
    Angle angles;
    BypassHeatingPipesAndGas bypassHeatingPipesAndGas;
    SewerPipeBypass sewerPipeBypass;
    InstallationOfTheVentilationGrill50mm installationOfTheVentilationGrill50mm;
    InstallationOfTheVentilationGrill100mm installationOfTheVentilationGrill100mm;
    MountingTheCoarseGrainedElement mountingTheCoarseGrainedElement;
    InstallationOfFireAlarmSystem installationOfFireAlarmSystem;
    InstallationOfTheFixingPoint installationOfTheFixingPoint;

    CorniceThreeRow2400mm corniceThreeRow2400mm;
    CorniceThreeRow2600mm corniceThreeRow2600mm;
    CorniceThreeRow3000mm corniceThreeRow3000mm;
    CorniceThreeRow3200mm corniceThreeRow3200mm;
    CorniceThreeRow3600mm corniceThreeRow3600mm;
    CorniceThreeRow4000mm corniceThreeRow4000mm;
    FlexibleCornice5000mm flexibleCornice5000mm;

    BasicWork installationCornice;
    CeilingCornice cornice;
    CeilingCornice hood;
    Timber timber;
    InstallationOfTheControlUnitAndTheRemoteControl installationOfTheControlUnitAndTheRemoteControl;
    InstallationOfTheRadioSwitch installationOfTheRadioSwitch;
    InstallationUsingVacuumCleaner installationUsingVacuumCleaner;
    HeightOver4Meters heightOver4Meters;






    EditText addressForOrder;
    EditText roomName;

    EditText ceilingMaterialSquare;
    EditText inputQuantityDesign;
    EditText inputBaguette;
    EditText inputInstallation;
    EditText inputCorniceQuantity;

    EditText inputTimberQuantity;
    EditText inputLamp;
    EditText inputLedPanel;
    EditText inputChandelier;

    TextView angleView;
    TextView heatingPipe;
    TextView sewagePipe;
    TextView lattice50;
    TextView lattice100;
    TextView coarseGrainedElement;
    TextView fireAlarm;
    TextView fixingPoint;
    TextView cornice2400;
    TextView cornice2600;
    TextView cornice3000;
    TextView cornice3200;
    TextView cornice3600;
    TextView cornice4000;
    TextView flexibleCornice;


    TextView photoPrintUnitssView;
    TextView adhesionUnitsView;


    LinearLayout pipeAndLatticeCounterLayout;
    LinearLayout latticeAndSignalizationLayout;
    LinearLayout corniceOfTheCompanyLayout;
    LinearLayout cornicesAndTimberLayout;

    LinearLayout roomNameLayout;


    Spinner brandSpiner;
    Spinner textureSpinner;
    Spinner colorSpinner;
    Spinner exclusiveSpinner;
    Spinner designMaterialSpinner;
    Spinner baguetteSpinner;
    Spinner typesOfDesignSpinner;
    Spinner installationSpinner;
    Spinner corniceInstallationSpinner;
    Spinner corniceSpinnerWithHood;
    Spinner corniceSpinnerWithoutHood;
    Spinner hoodSpinner;
    Spinner timberInstallationSpinner;

    Switch colorDecorativeInsertSwitch;
    Switch rgb;
    Switch pipeAndVentSwich;
    Switch latticeAndSignalizationSwich;
    Switch cornicesAndTimberSwitch;
    Switch corniceOfTheCompanySwitch;


// освещение
    LinearLayout typeOfDesignLayout;
    LinearLayout lightingGroup;
    LinearLayout lampOption;
    LinearLayout ledPanelOption;
    LinearLayout chandelierOption;


    CheckBox ledPanelCheckBox;
    CheckBox lampCheckBox;
    CheckBox chandelierCheckBox;
    CheckBox remoteControlOfLightCheckBox;
    CheckBox radioSwitchCheckBox;
    CheckBox vacuumCleanerCheckBox;
    CheckBox over4MetersCheckBox;
    Spinner lampSpinner;
    Spinner gx53bulbSpinner;
    Spinner mr16bulbSpinner;
    Spinner novotechBulbSpinner;
    Spinner ledPanelSpinner;
    Spinner chandelierSpinner;






    /*
        * адаптер для спинера brandSpinner
        * checkSpinnerBrand устанавливает ссылке на маетриал потолка объект потолка
         */

    AdapterView.OnItemSelectedListener brandItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkSpinnerBrand(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };

    /*
     * адаптер для спиннера выбирающего вид текстуры потолка
     * у него есть метод checkTexture в котором мы задаем нужное нам свойство для материала потолка
     * */

    AdapterView.OnItemSelectedListener textureItemSelectedListener = new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkTexture(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    /*
     * адаптер для спиннера выбирающего вид профиля
     * у него есть метод checkBaguetteSpinner в котором происходит создание нужного нам объекта
     * */
    AdapterView.OnItemSelectedListener baguetteItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkBaguetteSpinner(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };


    /*
    * адаптер для спиннера, устанавливающий цвет тканевого натяжного потолка
    * у него есть метод checkTexture в котором мы задаем нужное нам свойство для материала потолка
     */
    AdapterView.OnItemSelectedListener fabricColorItemSelectedListener = new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkFabricColor(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    /*
        * адаптер для спиннера, устанавливающий  вид эксклюзвного материала
        * у него есть метод checkExclusive в котором мы задаем нужное нам свойство для материала потолка
         */

    AdapterView.OnItemSelectedListener exclusiveItemSelectedListener = new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkExclusive(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };


    AdapterView.OnItemSelectedListener designItemSelectedListener = new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkDesign(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    AdapterView.OnItemSelectedListener typesOfDesignItemSelectedListener = new AdapterView.OnItemSelectedListener() {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkTypesOfDesign(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };


    /*
    * адаптер для спиннера, устанавливающий  вид светильников
    * у него есть метод checkLamp в котором мы делаем видимымм поля отображающие вид лампы для светильника
    * больше этот метод ничего не делает
     */


    AdapterView.OnItemSelectedListener lampItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkLamp(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };


    /*
    * адаптер для спиннера, выирающего вид ледпанелей
    * метод checkLedPanelSpinner присваевает ссылке на лед панель объект нужного вида
     */
    AdapterView.OnItemSelectedListener ledPanelItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkLedPanelSpinner(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };

    /*
    *адаптер для спинера  gx53bulbSpinner, выбирающего вид ламп для светильника GX53
    * checkGx53BulbSpinner должен устанавливать ссылке на лампу для светильника объект
     */
    AdapterView.OnItemSelectedListener gx53BulbItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkGx53BulbSpinner(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };

    /*
      *адаптер для спинера  mr16bulbSpinner, выбирающего вид ламп для светильника GX53
      * ccheckMr16BulbSpinner должен устанавливать ссылке на лампу для светильника объект лампы mr16
       */
    AdapterView.OnItemSelectedListener mr16BulbItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkMr16BulbSpinner(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    };

    /*
      *адаптер для спинера  novotechBulbSpinner, выбирающего вид ламп для светильника GX53
      * checkNovotechBilbSpinner должен устанавливать ссылке на лампу для светильника объект лампы g9
       */
    AdapterView.OnItemSelectedListener novotechBilbItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String value = (String) parent.getItemAtPosition(position);
            checkNovotechBulbSpinner(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };

    /*
     *адаптер для спинера ещё не написан, выбирающего вид ламп для светильника GX53
     * checkChandelier устанавливает ссылке на люстру  объект люстры
      */
    AdapterView.OnItemSelectedListener chandelierItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String value = (String) parent.getItemAtPosition(position);
            checkChandelier(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };


    AdapterView.OnItemSelectedListener installationItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String value = (String) parent.getItemAtPosition(position);
            checkInstallation(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };


    AdapterView.OnItemSelectedListener corniceInstallationItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String value = (String) parent.getItemAtPosition(position);
            checkCorniceInstallationItemSelectedListenervalue(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };


    AdapterView.OnItemSelectedListener corniceHoodItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String value = (String) parent.getItemAtPosition(position);
            checkCorniceHoodItemSelectedListener(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };

    AdapterView.OnItemSelectedListener timberInstallationItemSelectedListener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String value = (String) parent.getItemAtPosition(position);
            checkTimberInstallationItemSelectedListener(value);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
        }
    };


    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // устанавливаем макет


        //addressForOrder = (EditText)findViewById(R.id.addressForOrder);
//        addressForOrder.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN &&
//                        (i == KeyEvent.KEYCODE_ENTER)){
//                    order.setAddress(addressForOrder.getText().toString());
//                    return true;
//                }
//                return false;
//            }
//        });
        // инициализация editText для ввода названия комнаты
//
//        roomName = (EditText) findViewById(R.id.roomName);
//        roomName.setOnKeyListener(new View.OnKeyListener() {
//                                      public boolean onKey(View v, int keyCode, KeyEvent event) {
//                                          if (event.getAction() == KeyEvent.ACTION_DOWN &&
//                                                  (keyCode == KeyEvent.KEYCODE_ENTER)) {
//                                              // сохраняем текст, введенный до нажатия Enter в переменную
//                                              String strRoomName = roomName.getText().toString();
//                                              room.setName(strRoomName);
//                                              //createNewRoomButton();
//                                              order.getRooms().put(room.getName(),room);
//                                              return true;
//                                          }
//                                          return false;
//                                      }
//                                  }
//        );


        ceilingMaterialSquare = (EditText) findViewById(R.id.inputSquare);
        ceilingMaterialSquare.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    // сохраняем текст, введенный до нажатия Enter в переменную
                    try {
                        float flCeilingMaterialSqare = Float.valueOf(ceilingMaterialSquare.getText().toString());
                        addCeiling(ceilingMaterial,flCeilingMaterialSqare);
                        addInstallationCeiling();
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    } catch (NullPointerException e) {
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Объект потолки отсутствует", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                    return true;
                }
                return false;
            }
        });



        /*
        Инициатируе объект EditText для ввода количества м.п. багетта в переменную flInputBaguette
         */

        inputBaguette = (EditText) findViewById(R.id.inputBaguette);
        inputBaguette.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                {
                    if (event.getAction() == KeyEvent.ACTION_DOWN &&
                            (keyCode == KeyEvent.KEYCODE_ENTER)) {
                        try {

                            float flInputBaguette = Float.valueOf(inputBaguette.getText().toString());
                            addBaguette(baguette,flInputBaguette);


                            if (baguette.getName().equals("Установка ПВХ профиля для натяжного потолка") ||
                                    baguette.getName().equals("Установка ПВХ профиля для тканевого потолка") ||
                                    baguette.getName().equals("Установка алюминиевого профиля на клей") ||
                                    baguette.getName().equals("Установка алюминиевого профиля")) {
                                addDecorativeInsert(flInputBaguette);
                            }

                            if (baguette.getName().equals("Установка парящего профиля") ||
                                    baguette.getName().equals("Переход на другой уровень с подсветкой криволинейный (Алюминиевая конструкция)")) {
                                addLedStripAndPowerSupply(flInputBaguette);
                            }
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                            Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                            toast.show();
                        } catch (NullPointerException e) {
                            e.printStackTrace();
                            Toast toast = Toast.makeText(getApplicationContext(), "Объект профиль отсутствует", Toast.LENGTH_SHORT);
                            toast.show();
                        }

                        return true;
                    }
                    return false;
                }
            }
        });

        inputQuantityDesign = (EditText) findViewById(R.id.inputQuantityDesign);
        inputQuantityDesign.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                        float flInputQuantityDesign = Float.valueOf(inputQuantityDesign.getText().toString());
                        addDesign(design, flInputQuantityDesign);
                    }catch (NumberFormatException e) {
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                    return true;
                }
                return false;
            }
        });

         /*
        Инициатируе объект EditText для ввода количества светильников и лампочек  в переменную intInputLamp
         */

        inputLamp = (EditText) findViewById(R.id.inputLamp);
        inputLamp.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                        int intInputLamp = Integer.valueOf(inputLamp.getText().toString());
                        addInstallLamp(intInputLamp);
                        addLedLight(lampForRoom, intInputLamp);
                        addLedLight(bulbForRoom,intInputLamp);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    return true;
                }
                return false;
            }
        });

        /*
        Инициатируе объект EditText для ввода количества лед панелей в переменную intInputLedPanel
         */

        inputLedPanel = (EditText) findViewById(R.id.inputLedPanel);
        inputLedPanel.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                        int intInputLedPanel = Integer.valueOf(inputLedPanel.getText().toString());
                        addInstallLamp(intInputLedPanel);
                        addLedLight(ledPanelForRoom, intInputLedPanel);
                    }  catch (NumberFormatException e) {
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    return true;
                }
                return false;
            }
        });

        /*
        Инициатируе объект EditText для ввода количества люстр в переменную intInputChandelier
         */

        inputChandelier = (EditText) findViewById(R.id.inputChandelier);
        inputChandelier.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                         int intInputChandelier = Integer.valueOf(inputChandelier.getText().toString());
                        addInstallChandelier(intInputChandelier);
                        addChandelier(chandelierForRoom,intInputChandelier);
                    } catch (NumberFormatException e){
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }

                    return true;
                }
                return false;
            }
        });


        inputInstallation = (EditText) findViewById(R.id.inputInstallation);
        inputInstallation.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    try {
                        float flInputInstallation = Float.parseFloat(inputInstallation.getText().toString());
                        addInstallation(installationSecondWork,flInputInstallation);
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    return true;
                }
                return false;
            }
        });

        inputCorniceQuantity = (EditText) findViewById(R.id.inputCorniceQuantity);
        inputCorniceQuantity.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    try {
                        float flInputCornice = Float.parseFloat(inputCorniceQuantity.getText().toString());
                        addInstallationCornices(installationCornice,flInputCornice);
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    return true;
                }
                return false;
            }
        });

        inputTimberQuantity = (EditText) findViewById(R.id.inputTimberQuantity);
        inputTimberQuantity.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN &&
                        (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    try {
                        float flInputTimberQuantity = Float.parseFloat(inputTimberQuantity.getText().toString());
                        addInstallationTimber(timber,flInputTimberQuantity);
                    }catch (NumberFormatException e){
                        e.printStackTrace();
                        Toast toast = Toast.makeText(getApplicationContext(), "Недопустимое значение", Toast.LENGTH_SHORT);
                        toast.show();
                    }
                    return true;
                }
                return false;
            }
        });

        colorDecorativeInsertSwitch = (Switch) findViewById(R.id.insertColorSwitch);

        if (colorDecorativeInsertSwitch != null) {

            colorDecorativeInsertSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        room.getAllProductsInTheRoom().remove(decorativeInsert);
                        decorativeInsert.setTextColor(Texture.COLOR);
                        room.getAllProductsInTheRoom().add(decorativeInsert);

                        Toast.makeText(getApplicationContext(), "Цветнная вставка добаленна", Toast.LENGTH_SHORT).show();
                    } else {
                        room.getAllProductsInTheRoom().remove(decorativeInsert);
                        decorativeInsert.setTextColor(Texture.BASE);
                        room.getAllProductsInTheRoom().add(decorativeInsert);


                        Toast.makeText(getApplicationContext(), "Белая вставка добавленна", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }

        rgb = (Switch) findViewById(R.id.rgbSwitch);

        if (rgb != null) {

            rgb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    ControllerForLedStrip controllerForLedStrip = new ControllerForLedStrip();
                    if (isChecked) {
                        room.getAllProductsInTheRoom().remove(ledStrip);
                        ledStrip.setTextColor(Texture.COLOR);
                        room.getAllProductsInTheRoom().add(ledStrip);
                        room.getAllProductsInTheRoom().add(controllerForLedStrip);
                        Toast.makeText(getApplicationContext(), "RGB лента + контролер добавленны", Toast.LENGTH_SHORT).show();
                    } else {
                        room.getAllProductsInTheRoom().remove(ledStrip);
                        ledStrip.setTextColor(Texture.BASE);
                        room.getAllProductsInTheRoom().add(ledStrip);
                        room.getAllProductsInTheRoom().remove(controllerForLedStrip);
                    }
                }
            });
        }



        typeOfDesignLayout = (LinearLayout) findViewById(R.id.typeOfDesignLayout);


        roomNameLayout = (LinearLayout) findViewById(R.id.RoomNameButtonLayout);


        pipeAndLatticeCounterLayout = (LinearLayout) findViewById(R.id.pipesAndAnglesCounter);
        latticeAndSignalizationLayout = (LinearLayout) findViewById(R.id.latticeAndSignalizationLayout);
        corniceOfTheCompanyLayout = (LinearLayout)findViewById(R.id.corniceOfTheCompanyLayout);


        angleView = (TextView) findViewById(R.id.angle);
        heatingPipe = (TextView) findViewById(R.id.heatingPipe);
        sewagePipe = (TextView) findViewById(R.id.sewagePipe);
        lattice50 = (TextView) findViewById(R.id.lattice50);
        lattice100 = (TextView) findViewById(R.id.lattice100);
        coarseGrainedElement = (TextView) findViewById(R.id.coarseGrainedElement);
        fireAlarm = (TextView) findViewById(R.id.fireAlarm);
        fixingPoint = (TextView) findViewById(R.id.fixingPoint);
        cornice2400 = (TextView) findViewById(R.id.cornice2400);
        cornice2600 = (TextView) findViewById(R.id.cornice2600);
        cornice3000 = (TextView) findViewById(R.id.cornice3000);
        cornice3200 = (TextView) findViewById(R.id.cornice3200);
        cornice3600 = (TextView) findViewById(R.id.cornice3600);
        cornice4000 = (TextView) findViewById(R.id.cornice4000);
        flexibleCornice = (TextView)findViewById(R.id.flexibleCornice);

        photoPrintUnitssView = (TextView) findViewById(R.id.photoPrintUnits);
        adhesionUnitsView = (TextView) findViewById(R.id.adhesionUnits);

        cornicesAndTimberLayout = (LinearLayout) findViewById(R.id.cornicesAndTimberLayout);


        lightingGroup = (LinearLayout) findViewById(R.id.lightingGroup);


        lampOption = (LinearLayout) findViewById(R.id.lampOption);
        ledPanelOption = (LinearLayout) findViewById(R.id.ledPanelOption);
        chandelierOption = (LinearLayout) findViewById(R.id.chandelierOption);

        brandSpiner = (Spinner) findViewById(R.id.ceilingBrandSpinner);
        ArrayAdapter<CharSequence> adapterBrand = ArrayAdapter.createFromResource(this, R.array.ceilingBrand,
                android.R.layout.simple_spinner_item);
        adapterBrand.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        brandSpiner.setAdapter(adapterBrand);
        brandSpiner.setOnItemSelectedListener(brandItemSelectedListener);
        brandSpiner.setSelection(0);

        textureSpinner = (Spinner) findViewById(R.id.textureSpinner);
        ArrayAdapter<CharSequence> adapterTexture = ArrayAdapter.createFromResource(this, R.array.texture,
                android.R.layout.simple_spinner_item);
        adapterBrand.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        textureSpinner.setAdapter(adapterTexture);
        textureSpinner.setOnItemSelectedListener(textureItemSelectedListener);
        textureSpinner.setSelection(0);



        colorSpinner = (Spinner) findViewById(R.id.color);
        ArrayAdapter<CharSequence> adapterColor = ArrayAdapter.createFromResource(this, R.array.color,
                android.R.layout.simple_spinner_item);
        colorSpinner.setAdapter(adapterColor);
        colorSpinner.setOnItemSelectedListener(fabricColorItemSelectedListener);

        exclusiveSpinner = (Spinner) findViewById(R.id.exclusive);
        ArrayAdapter<CharSequence> adapterExclusive = ArrayAdapter.createFromResource(this, R.array.exclusive,
                android.R.layout.simple_spinner_item);
        exclusiveSpinner.setAdapter(adapterExclusive);
        exclusiveSpinner.setOnItemSelectedListener(exclusiveItemSelectedListener);

        designMaterialSpinner = (Spinner) findViewById(R.id.designColor);
        ArrayAdapter<CharSequence> adapterDesign = ArrayAdapter.createFromResource(this, R.array.designColor,
                android.R.layout.simple_spinner_item);
        designMaterialSpinner.setAdapter(adapterDesign);
        designMaterialSpinner.setOnItemSelectedListener(designItemSelectedListener);

        baguetteSpinner = (Spinner) findViewById(R.id.baguetteSpinner);
        ArrayAdapter<CharSequence> adapterBaguette = ArrayAdapter.createFromResource(this, R.array.baguette,
                android.R.layout.simple_spinner_dropdown_item);
        baguetteSpinner.setAdapter(adapterBaguette);
        baguetteSpinner.setSelection(0);
        baguetteSpinner.setOnItemSelectedListener(baguetteItemSelectedListener);

        typesOfDesignSpinner = (Spinner) findViewById(R.id.typesOfDesignSpinner);
        ArrayAdapter<CharSequence> adapterTypesOfDesign = ArrayAdapter.createFromResource(this, R.array.typesOfDesign,
                android.R.layout.simple_spinner_dropdown_item);
        typesOfDesignSpinner.setAdapter(adapterTypesOfDesign);
        typesOfDesignSpinner.setOnItemSelectedListener(typesOfDesignItemSelectedListener);

        installationSpinner = (Spinner) findViewById(R.id.installationSpinner);
        ArrayAdapter<CharSequence> adapterInstallation = ArrayAdapter.createFromResource(this, R.array.installation,
                android.R.layout.simple_spinner_item);
        installationSpinner.setAdapter(adapterInstallation);
        installationSpinner.setSelection(0);
        installationSpinner.setOnItemSelectedListener(installationItemSelectedListener);

        corniceInstallationSpinner = (Spinner) findViewById(R.id.corniceInstallationSpinner);
        ArrayAdapter<CharSequence> adapterCorniceInstallation = ArrayAdapter.createFromResource(this, R.array.installationCornice,
                android.R.layout.simple_spinner_item);
        corniceInstallationSpinner.setAdapter(adapterCorniceInstallation);
        corniceInstallationSpinner.setSelection(0);
        corniceInstallationSpinner.setOnItemSelectedListener(corniceInstallationItemSelectedListener);

        hoodSpinner = (Spinner) findViewById(R.id.hoodSpinner);
        ArrayAdapter<CharSequence> adapterHoodSpinner = ArrayAdapter.createFromResource(this, R.array.hood,
                android.R.layout.simple_spinner_item);
        hoodSpinner.setAdapter(adapterHoodSpinner);
        hoodSpinner.setOnItemSelectedListener(corniceHoodItemSelectedListener);

        timberInstallationSpinner = (Spinner) findViewById(R.id.timberInstallationSpinner);
        ArrayAdapter<CharSequence> adapterTimberInstallationSpinner = ArrayAdapter.createFromResource(this, R.array.installationTimber,
                android.R.layout.simple_spinner_item);
        timberInstallationSpinner.setAdapter(adapterTimberInstallationSpinner);
        timberInstallationSpinner.setOnItemSelectedListener(timberInstallationItemSelectedListener);


        // свич для переключения отображения счётчиков труб и решёток

        pipeAndVentSwich = (Switch) findViewById(R.id.pipe);
        latticeAndSignalizationSwich = (Switch) findViewById(R.id.latticeAndSignalization);
        cornicesAndTimberSwitch = (Switch) findViewById(R.id.visibleCornicesAndTimber);
        corniceOfTheCompanySwitch = (Switch)findViewById(R.id.corniceOfTheCompany);

        remoteControlOfLightCheckBox = (CheckBox) findViewById(R.id.remoteControlOfLight);
        radioSwitchCheckBox = (CheckBox) findViewById(R.id.radioSwitch);
        vacuumCleanerCheckBox = (CheckBox) findViewById(R.id.vacuumCleaner);
        over4MetersCheckBox = (CheckBox) findViewById(R.id.over4Meters);


        chandelierCheckBox = (CheckBox) findViewById(R.id.chandelier);
        lampCheckBox = (CheckBox) findViewById(R.id.lamp);
        ledPanelCheckBox = (CheckBox) findViewById(R.id.ledPanel);

        // освещение, инициализация спинеров светильников панелей и люстр

        lampSpinner = (Spinner) findViewById(R.id.lampSpinner);
        ArrayAdapter<CharSequence> adapterLamp = ArrayAdapter.createFromResource(this, R.array.lamp,
                android.R.layout.simple_spinner_item);
        lampSpinner.setAdapter(adapterLamp);
        lampSpinner.setSelection(0);
        lampSpinner.setOnItemSelectedListener(lampItemSelectedListener);

        ledPanelSpinner = (Spinner) findViewById(R.id.ledPanelSpinner);
        ArrayAdapter<CharSequence> adapterLEDpanel = ArrayAdapter.createFromResource(this, R.array.LEDpanel,
                android.R.layout.simple_spinner_item);
        ledPanelSpinner.setAdapter(adapterLEDpanel);
        ledPanelSpinner.setSelection(0);
        ledPanelSpinner.setOnItemSelectedListener(ledPanelItemSelectedListener);


        gx53bulbSpinner = (Spinner) findViewById(R.id.gx53bilbSpinner);
        ArrayAdapter<CharSequence> adapterGX53bilb = ArrayAdapter.createFromResource(this, R.array.GX53bulb,
                android.R.layout.simple_spinner_item);
        gx53bulbSpinner.setAdapter(adapterGX53bilb);
        gx53bulbSpinner.setOnItemSelectedListener(gx53BulbItemSelectedListener);

        mr16bulbSpinner = (Spinner) findViewById(R.id.mr16bilbSpinner);
        ArrayAdapter<CharSequence> adapterMR16bulb = ArrayAdapter.createFromResource(this, R.array.MR16bulb,
                android.R.layout.simple_spinner_item);
        mr16bulbSpinner.setAdapter(adapterMR16bulb);
        mr16bulbSpinner.setOnItemSelectedListener(mr16BulbItemSelectedListener);

        novotechBulbSpinner = (Spinner) findViewById(R.id.novotechBilbSpinner);
        ArrayAdapter<CharSequence> adapterNovotech = ArrayAdapter.createFromResource(this, R.array.novotech,
                android.R.layout.simple_spinner_item);
        novotechBulbSpinner.setAdapter(adapterNovotech);
        novotechBulbSpinner.setOnItemSelectedListener(novotechBilbItemSelectedListener);

        chandelierSpinner = (Spinner) findViewById(R.id.chandelierSpinner);
        ArrayAdapter<CharSequence> adapterChandelier = ArrayAdapter.createFromResource(this, R.array.chandelier,
                android.R.layout.simple_spinner_item);
        chandelierSpinner.setAdapter(adapterChandelier);
        chandelierSpinner.setOnItemSelectedListener(chandelierItemSelectedListener);


        //ledPanelSpinner = (Spinner) findViewById(R.id.)


        createNewRoomButton(room); // хардкод, нужно будет раскоментировать в установке названия комнаты
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            if (requestCode == RequestCode.REQUEST_CODE_VIEW_LIST) {
                ArrayList<Product> list = (ArrayList<Product>) data.getSerializableExtra("listRoom");
                room.setAllProductsInTheRoom(list);
            }
        } else {
            Toast.makeText(this, "Результаты не сохранены", Toast.LENGTH_LONG);
        }

    }

    private void createNewRoomButton(Room room) {
        Button newButton = new Button(this);
        newButton.setText(room.getName());
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToListActivity();
                // интент на список с переменными комнаты
            }
        });
        roomNameLayout.addView(newButton);
    }

    private void sendDataToListActivity() {
        Intent intent = new Intent(this, ListViewActivity.class);
        intent.putExtra("ThisRoom", room.getAllProductsInTheRoom());

        startActivityForResult(intent, RequestCode.REQUEST_CODE_VIEW_LIST);

    }


    public void showPipeAndAngle(View view) {
        if (pipeAndVentSwich.isChecked()) {
            pipeAndLatticeCounterLayout.setVisibility(View.VISIBLE);
        } else {
            pipeAndLatticeCounterLayout.setVisibility(View.GONE);
        }
    }

    public void showLatticeAndSignalization(View view) {
        if (latticeAndSignalizationSwich.isChecked()) {
            latticeAndSignalizationLayout.setVisibility(View.VISIBLE);
        } else {
            latticeAndSignalizationLayout.setVisibility(View.GONE);
        }
    }

    public void showCorniceOfTheCompany(View view) {
        if (corniceOfTheCompanySwitch.isChecked()) {
            corniceOfTheCompanyLayout.setVisibility(View.VISIBLE);
            hoodSpinner.setSelection(1);

        } else {
            corniceOfTheCompanyLayout.setVisibility(View.GONE);
        }
    }

    public void showCornicesAndTimber(View view) {
        if (cornicesAndTimberSwitch.isChecked()) {
            cornicesAndTimberLayout.setVisibility(View.VISIBLE);
        } else {
            cornicesAndTimberLayout.setVisibility(View.GONE);
        }
    }


    public void installationOfTheControlUnitAndTheRemoteControl(View view) {
        if (remoteControlOfLightCheckBox.isChecked()) {
            installationOfTheControlUnitAndTheRemoteControl =
                    new InstallationOfTheControlUnitAndTheRemoteControl();
            room.putInAllProductsInTheRoom(installationOfTheControlUnitAndTheRemoteControl);
        } else {
            room.getAllProductsInTheRoom().remove(installationOfTheControlUnitAndTheRemoteControl);
        }
    }

    public void installationOFTheRadioSwitch(View view) {
        if (radioSwitchCheckBox.isChecked()) {
            installationOfTheRadioSwitch = new InstallationOfTheRadioSwitch();
            room.putInAllProductsInTheRoom(installationOfTheRadioSwitch);
        } else {
            room.getAllProductsInTheRoom().remove(installationOfTheRadioSwitch);
        }
    }

    public void cleanInstallation(View view) {
        if (vacuumCleanerCheckBox.isChecked()) {
            installationUsingVacuumCleaner =
                    new InstallationUsingVacuumCleaner();
            room.putInAllProductsInTheRoom(installationUsingVacuumCleaner);
        } else {
            room.getAllProductsInTheRoom().remove(installationUsingVacuumCleaner);
        }
    }

    public void installationWithAHeightOfMoreThan4Meters(View view) {
        if (over4MetersCheckBox.isChecked()) {
            heightOver4Meters =
                    new HeightOver4Meters();
            room.putInAllProductsInTheRoom(heightOver4Meters);
        } else {
            room.getAllProductsInTheRoom().remove(heightOver4Meters);
        }
    }
    /*
    метод делает видимым поле настройки светодиодных светильников
     */
    public void setVisibleLampOption(View view) {
        if (lampCheckBox.isChecked()) {
            lampOption.setVisibility(View.VISIBLE);
        } else {
            lampOption.setVisibility(View.GONE);
        }
    }

    /*
    метод делает видимым поле настройки лед панелей
     */

    public void setVisibleLedPanelOption(View view) {
        if (ledPanelCheckBox.isChecked()) {
            ledPanelOption.setVisibility(View.VISIBLE);
        } else {
            ledPanelOption.setVisibility(View.GONE);
        }
    }

/*
    метод делает видимым поле настройки люстр
     */

    public void setVisibleChandelierOption(View view) {
        if (chandelierCheckBox.isChecked()) {
            chandelierOption.setVisibility(View.VISIBLE);
        } else {
            chandelierOption.setVisibility(View.GONE);
        }
    }


    public void checkSpinnerBrand(String value) {
        Log.v("Материал вход", value);
        switch (value) {
            case "CTN":
                textureSpinner.setVisibility(View.VISIBLE);
                colorSpinner.setVisibility(View.GONE);
                exclusiveSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.GONE);
                typeOfDesignLayout.setVisibility(View.GONE);
                ceilingMaterial = new CTN(Texture.FROSTED);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture()
                        + ceilingMaterial.getPrice());
                break;
            case "Pongs":
                textureSpinner.setVisibility(View.VISIBLE);
                colorSpinner.setVisibility(View.GONE);
                exclusiveSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.GONE);
                typeOfDesignLayout.setVisibility(View.GONE);
                ceilingMaterial = new Pongs(Texture.FROSTED);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture());
                break;
            case "Polyplast":
                textureSpinner.setVisibility(View.VISIBLE);
                colorSpinner.setVisibility(View.GONE);
                exclusiveSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.GONE);
                typeOfDesignLayout.setVisibility(View.GONE);
                ceilingMaterial = new PolyPlast(Texture.FROSTED);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture());
                break;
            case "Descor":
                textureSpinner.setVisibility(View.GONE);
                colorSpinner.setVisibility(View.VISIBLE);
                exclusiveSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.GONE);
                typeOfDesignLayout.setVisibility(View.GONE);
                ceilingMaterial = new Descor(Texture.WHITE);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture());
                break;
            case "Exclusive":
                textureSpinner.setVisibility(View.GONE);
                colorSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.GONE);
                exclusiveSpinner.setVisibility(View.VISIBLE);
                typeOfDesignLayout.setVisibility(View.GONE);
                ceilingMaterial = new Exclusive(Texture.EXCLUSIVE);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture());
                break;
            case "Design":
                textureSpinner.setVisibility(View.GONE);
                colorSpinner.setVisibility(View.GONE);
                exclusiveSpinner.setVisibility(View.GONE);
                designMaterialSpinner.setVisibility(View.VISIBLE);
                typeOfDesignLayout.setVisibility(View.VISIBLE);
                ceilingMaterial = new DesignMaterial(Texture.BASE);
                ceilingMaterialSquare.setText("");
                Log.v("Материал", ceilingMaterial.getName() + " " + ceilingMaterial.getTexture());
                break;
        }
    }

    public void checkTexture(String value) {

        switch (value) {
            case "Мат":
                ceilingMaterial.setTexture(Texture.FROSTED);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Глянец":

                ceilingMaterial.setTexture(Texture.GLOSS);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Сатин":

                ceilingMaterial.setTexture(Texture.SATIN);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Цветной мат":
                ceilingMaterial.setTexture(Texture.COLOR_FROSTED);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Цветной глянец":
                ceilingMaterial.setTexture(Texture.COLOR_GLOSS);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Цветной Сатин":
                ceilingMaterial.setTexture(Texture.COLOR_SATIN);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
        }
    }

    public void checkExclusive(String value) {

        switch (value) {
            case "Exclusive":
                break;
            case "PolyPlast (Бел) Венец. штукат.":
                ceilingMaterial.setTexture(Texture.VENETIAN_PLASTER);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "PolyPlast (Бел) Галактика":
                ceilingMaterial.setTexture(Texture.GALAXY);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "PolyPlast (Бел) Небо":
                ceilingMaterial.setTexture(Texture.SKY);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
        }
    }

    public void checkDesign(String value) {
        switch (value) {
            case "Белый глянец/матовый Дизайн+":
                ceilingMaterialSquare.setText("");
                break;
            case "Цветной/фактурный Дизайн+":
                ceilingMaterial.setTexture(Texture.COLOR);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
        }
    }


    public void checkTypesOfDesign(String value) {

        switch (value) {
            case "Фотопечать":
                design = new PhotoPrinting();
                adhesionUnitsView.setVisibility(View.GONE);
                photoPrintUnitssView.setVisibility(View.VISIBLE);
                inputQuantityDesign.setText("");
                break;
            case "Криволинейная спайка":
                design = new CurvilinearAdhesion();
                photoPrintUnitssView.setVisibility(View.GONE);
                adhesionUnitsView.setVisibility(View.VISIBLE);
                inputQuantityDesign.setText("");
                break;
            case "Прямолинейная спайка":
                design = new StraightAdhesion();
                adhesionUnitsView.setVisibility(View.VISIBLE);
                inputQuantityDesign.setText("");
                break;
        }
    }


    public void checkFabricColor(String value) {

        switch (value) {
            case "Белый":
                ceilingMaterial.setTexture(Texture.WHITE);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
            case "Цветной":
                ceilingMaterial.setTexture(Texture.COLOR);
                ceilingMaterialSquare.setText("");
                Log.v("отл Текстура", "" + ceilingMaterial.getTexture());
                break;
        }
    }


    public void checkBaguetteSpinner(String value) {

        switch (value) {
            case "ПВХ профиль":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.VISIBLE);
                baguette = new PvhBaguette();
                inputBaguette.setText("");
                break;
            case "Ткань ПВХ профиль":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.VISIBLE);
                baguette = new PvhBaguetteForFabric();
                inputBaguette.setText("");
                break;
            case "Алюминиевый профиль":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.VISIBLE);
                baguette = new AluminumBaguette();
                inputBaguette.setText("");
                break;
            case "Алюминиевый профиль на клей":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.VISIBLE);
                baguette = new AluminumBaguetteOnGlue();
                inputBaguette.setText("");
                break;
            case "Разделитель алюминиевый":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new AluminumSeparator();
                inputBaguette.setText("");
                break;
            case "Перегиб полотна":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new BendOfTheCloth();
                inputBaguette.setText("");
                break;
            case "Парящий профиль":
                rgb.setVisibility(View.VISIBLE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new FloatingBaguette();
                ledStrip = new LedStrip();
                inputBaguette.setText("");
                break;
            case "Переход на др. уровень криволинейный (ПВХ конструкция)":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new CurvilinearTransitionToAnotherLevelPvh();
                inputBaguette.setText("");
                break;
            case "Переход на др. уровень по прямой (ПВХ конструкция)":
                rgb.setVisibility(View.GONE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new StraightTransitionToAnotherLevel();
                inputBaguette.setText("");
                break;
            case "Переход на другой уровень с подсветкой криволинейный (Алюминиевая конструкция)":
                rgb.setVisibility(View.VISIBLE);
                colorDecorativeInsertSwitch.setVisibility(View.GONE);
                baguette = new CurvilinearTransitionToAnotherLevelWithBackLight();
                ledStrip = new LedStrip();
                inputBaguette.setText("");
                break;
        }
    }


    private void checkInstallation(String value) {
        switch (value) {
            case "Криволинейный участок стены":
                installationSecondWork = new CurvedWallSection();
                inputInstallation.setText("");
                Log.v("отл Установка", "" + installationSecondWork.getName());
                break;
            case "Монтаж в труднодоступном месте":
                installationSecondWork = new MountingInHardToReachLocation();
                inputInstallation.setText("");
                Log.v("отл Установка", "" + installationSecondWork.getName());
                break;
            case "Монтаж по керамограниту":
                installationSecondWork = new MountingOnPorcelainTiles();
                inputInstallation.setText("");
                Log.v("отл Установка", "" + installationSecondWork.getName());
                break;
            case "Монтаж по плитке":
                installationSecondWork = new MountingToTile();
                inputInstallation.setText("");
                Log.v("отл Установка", "" + installationSecondWork.getName());
                break;
        }
    }

    private void checkCorniceInstallationItemSelectedListenervalue(String value) {
        switch (value) {
            case "Установка потолочного карниза":
                installationCornice = new InstallationOfCeilingCornices();
                inputCorniceQuantity.setText("");
                break;
            case "Установка ниши с карнизом (алюминиевый профиль)":
                installationCornice = new InstallationOfNicheWithCornice();
                inputCorniceQuantity.setText("");
                break;
            case "Установка гибкого карниза":
                installationCornice = new InstallationOfFlexibleEaves();
                inputCorniceQuantity.setText("");
                break;
        }
    }


    private void checkCorniceHoodItemSelectedListener(String value) {

        switch (value) {
            case "Клиента":
                break;
            case "Бленда для карниза белая":
                hood = new HoodForWhiteCornice();
                addHood();
                break;
            case "Бленда для карниза бежевая":
                hood = new HoodForBeigeCornice();
                addHood();
                break;
            case "Бленда для карниза коричневая":
                hood = new HoodForBrownCornice();
                addHood();
                break;
        }
    }

    private void checkTimberInstallationItemSelectedListener(String value) {
        switch (value) {
            case "Установка открытого бруса":
                timber = new OpenTimber();
                inputTimberQuantity.setText("");
                break;
            case "Установка скрытого бруса":
                timber = new HiddenTimber();
                inputTimberQuantity.setText("");
                break;
            case "Установка закладная из бруса":
                timber = new MortgageOfTimber();
                inputTimberQuantity.setText("");
                break;
        }
    }
    public void checkLamp(String value) {
        switch (value) {
            case "Клиента":
                gx53bulbSpinner.setVisibility(View.INVISIBLE);
                inputLamp.setText("");
                break;
            case "GX53 Белый":
                gx53bulbSpinner.setVisibility(View.VISIBLE);
                mr16bulbSpinner.setVisibility(View.GONE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new GX53white();
                gx53bulbSpinner.setSelection(1);
                inputLamp.setText("");
                break;
            case "Золото GX53":
                gx53bulbSpinner.setVisibility(View.VISIBLE);
                mr16bulbSpinner.setVisibility(View.GONE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new GX53Gold();
                gx53bulbSpinner.setSelection(1);
                inputLamp.setText("");
                break;
            case "Хром GX53":
                gx53bulbSpinner.setVisibility(View.VISIBLE);
                mr16bulbSpinner.setVisibility(View.GONE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new GX53Chrome();
                gx53bulbSpinner.setSelection(1);
                inputLamp.setText("");
                break;
            case "Чёрный хром GX53":
                gx53bulbSpinner.setVisibility(View.VISIBLE);
                mr16bulbSpinner.setVisibility(View.GONE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new GX53BlackChrome();
                gx53bulbSpinner.setSelection(1);
                inputLamp.setText("");
                break;
            case "MR16 Белый":
                gx53bulbSpinner.setVisibility(View.GONE);
                mr16bulbSpinner.setVisibility(View.VISIBLE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new MR16DL90GU53White();
                mr16bulbSpinner.setSelection(0);
                inputLamp.setText("");
                break;
            case "MR16 Золото":
                gx53bulbSpinner.setVisibility(View.GONE);
                mr16bulbSpinner.setVisibility(View.VISIBLE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new MR16DL90GU53Gold();
                mr16bulbSpinner.setSelection(0);
                inputLamp.setText("");
                break;
            case "MR16 Хром":
                gx53bulbSpinner.setVisibility(View.GONE);
                mr16bulbSpinner.setVisibility(View.VISIBLE);
                novotechBulbSpinner.setVisibility(View.GONE);
                lampForRoom = new MR16DL90GU53Chrome();
                mr16bulbSpinner.setSelection(0);
                inputLamp.setText("");
                break;
            case "Novotech":
                gx53bulbSpinner.setVisibility(View.GONE);
                mr16bulbSpinner.setVisibility(View.GONE);
                novotechBulbSpinner.setVisibility(View.VISIBLE);
                lampForRoom = new Novotech();
                inputLamp.setText("");
                break;
        }
    }

    public void checkLedPanelSpinner(String value) {
        switch (value) {
            case "Клиента":
                ledPanelForRoom = null;
                inputLedPanel.setText("");
                break;
            case "RSP 7W 3000K":
                ledPanelForRoom = new RSP7W_3000K();
                inputLedPanel.setText("");
                break;
            case "RS 8W 5000K":
                ledPanelForRoom = new RS_8W_5000K();
                inputLedPanel.setText("");
                break;
            case "ODEON FND7 7W 6000K":
                ledPanelForRoom = new OdeonFND77W6000K();
                inputLedPanel.setText("");
                break;
            case "ODEON FNW7 7W 4500K":
                ledPanelForRoom = new OdeonFNC77W4500K();
                inputLedPanel.setText("");
                break;
            case "ODEON FNW7 7W 3000K":
                ledPanelForRoom = new OdeonFNW77W3000K();
                inputLedPanel.setText("");
                break;
            case "Альфа LF 401, 6 W":
                ledPanelForRoom = new AlfaLF401_6W();
                inputLedPanel.setText("");
                break;
            case "Альфа LF 401, 12 W":
                ledPanelForRoom = new AlfaLF401_12W();
                inputLedPanel.setText("");
                break;
            case "Альфа LF 401, 18 W":
                ledPanelForRoom = new AlfaLF401_18W();
                inputLedPanel.setText("");
                break;
            case "Альфа LY 301, 7 W":
                ledPanelForRoom = new AlfaLY301_7W();
                inputLedPanel.setText("");
                break;
            case "Альфа LY 501, 6 W":
                ledPanelForRoom = new AlfaLY501_6W();
                inputLedPanel.setText("");
                break;
            case "Альфа LY 501, 12 W":
                ledPanelForRoom = new AlfaLY501_12W();
                inputLedPanel.setText("");
                break;
            case "Альфа LY 501, 18 W":
                ledPanelForRoom = new AlfaLY501_18W();
                inputLedPanel.setText("");
                break;
            case "Альфа X-002, LY 206, 6+2W":
                ledPanelForRoom = new AlfaX002_LY206_6add2W();
                inputLedPanel.setText("");
                break;
            case "Feron AL500 6W":
                ledPanelForRoom = new FeronAL500_6W();
                inputLedPanel.setText("");
                break;
        }
    }

    public void checkChandelier(String value) {
        switch (value) {
            case "Клиента":
                inputChandelier.setText("");
                break;
            case "SBL–CL–48W–313–4K/White":
                chandelierForRoom = new SBL_CL_48W_313_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL–CL-65W-305–4K/White":
                chandelierForRoom = new SBL_CL_65W_305_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-75W-312–4K/White":
                chandelierForRoom = new SBL_CL_75W_312_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-60W-302–4K/White":
                chandelierForRoom = new SBL_CL_60W_302_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-38W-304–4K/White":
                chandelierForRoom = new SBL_CL_38W_304_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-45W-307–4K":
                chandelierForRoom = new SBL_CL_45W_307_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-75W-319–4K/White":
                chandelierForRoom = new SBL_CL_75W_319_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-110W-301-White":
                chandelierForRoom = new SBL_CL_110W_301_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-65W-303–4K/White":
                chandelierForRoom = new SebestoimostSBL_CL_65W_303_4K_White();
                inputChandelier.setText("");
                break;
            case "SBL-CL-42W-310–4K":
                chandelierForRoom = new SebestoimostSBL_CL_42W_310_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-23W-163–4K":
                chandelierForRoom = new SBL_CL_23W_163_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-25W-1601–4K":
                chandelierForRoom = new SBL_CL_25W_1601_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-45W-4005–4K":
                chandelierForRoom = new SBL_CL_45W_4005_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-25W-4015–4K":
                chandelierForRoom = new SBL_CL_25W_4015_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-18W-160–4K":
                chandelierForRoom = new SBL_CL_18W_160_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-55W-4003–4K":
                chandelierForRoom = new SBL_CL_55W_4003_4K();
                inputChandelier.setText("");
                break;
            case "SBL-CL-25W-4009–4K":
                chandelierForRoom = new SBL_CL_25W_4009_4K();
                inputChandelier.setText("");
                break;
        }
    }

    public void checkNovotechBulbSpinner(String value) {

        switch (value) {
            case "Клиента":
                bulbForRoom = null;
                inputLamp.setText("");
                break;
            case "LED ODEON G9 4W":
                bulbForRoom = new BulbForNovotechLedOdeonG94W();
                inputLamp.setText("");
                break;
        }
    }

    public void checkGx53BulbSpinner(String value) {

        switch (value) {
            case "Клиента":
                bulbForRoom = null;
                inputLamp.setText("");
                break;
            case "5–6W 3000К ODEON":
                bulbForRoom = new LedOdeonGX53_5_6W_3000К();
                inputLamp.setText("");
                break;
            case "5–6W 4500К ODEON":
                bulbForRoom = new LedOdeonGX53_5_6W_4500К();
                inputLamp.setText("");
                break;
            case "5–6W 6000К ODEON":
                bulbForRoom = new LedOdeonGX53_5_6W_6000К();
                inputLamp.setText("");
                break;
            case "7–8W 3000К ODEON":
                bulbForRoom = new LedOdeonGX53_7_8W_3000К();
                inputLamp.setText("");
                break;
            case "7–8W 4500К ODEON":
                bulbForRoom = new LedOdeonGX53_7_8W_4500К();
                inputLamp.setText("");
                break;
            case "7–8W 6000К ODEON":
                bulbForRoom = new LedOdeonGX53_7_8W_6000К();
                inputLamp.setText("");
                break;
            case "9–10W 3000К ODEON":
                bulbForRoom = new LedOdeonGX53_9_10W_3000К();
                inputLamp.setText("");
                break;
            case "9–10W 4500К ODEON":
                bulbForRoom = new LedOdeonGX53_9_10W_4500К();
                inputLamp.setText("");
                break;
            case "9–10W 6000К ODEON":
                bulbForRoom = new LedOdeonGX53_9_10W_6000К();
                inputLamp.setText("");
                break;
        }
    }

    public void checkMr16BulbSpinner(String value) {
        switch (value) {
            case "Клиента":
                bulbForRoom = null;
                inputLamp.setText("");
                break;
            case "GU5,3 7W 4500K":
                bulbForRoom = new BulbMR16GU53_7W_4500K();
                inputLamp.setText("");
                break;
            case "GU5,3 7W 6000K":
                bulbForRoom = new BulbMR16GU53_7W_6000K();
                inputLamp.setText("");
                break;
        }
    }


    // методы для вентиляционных труб и решёток

    public void decrementAngle(View view) {
        int angle = Integer.parseInt(angleView.getText().toString());

        if (angle > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(angles);
            angle--;

            if (angle == 0) {
                room.getAllProductsInTheRoom().remove(angles);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(angle);
            }

        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chAngle = String.valueOf(angle);
        angleView.setText(chAngle);
    }

    public void incrementAngle(View view) {
        int angle = Integer.parseInt(angleView.getText().toString());
        if (angle == 0) {
            angles = new Angle();
            angles.setQuantity(++angle);
            room.getAllProductsInTheRoom().add(angles);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(angles);
            room.getAllProductsInTheRoom().get(i).setQuantity(++angle);

        }
        CharSequence chAngle = String.valueOf(angle);
        angleView.setText(chAngle);
    }
    /*
 методо уменьшает количество обводов трубы в объекте рум. Если количество равно 0, переменная обвод в объекте
  рум инициализируеться ссылкой null
 */

    public void decrementHeatingPipe(View v) {
        int pipe = Integer.parseInt(heatingPipe.getText().toString());

        if (pipe > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(bypassHeatingPipesAndGas);
            pipe--;

            if (pipe == 0) {
                room.getAllProductsInTheRoom().remove(bypassHeatingPipesAndGas);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(pipe);
            }

        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chPipe = String.valueOf(pipe);
        heatingPipe.setText(chPipe);
    }


    /*
методо увеличивает  количество решёток вентиляци  в объекте рум. Если количество равно 0, переменная обвод трубы в
объекте рум инициализируется
*/
    public void incrementHeatingPipe(View v) {
        int pipe = Integer.parseInt(heatingPipe.getText().toString());
        if (pipe == 0) {
            bypassHeatingPipesAndGas = new BypassHeatingPipesAndGas();
            bypassHeatingPipesAndGas.setQuantity(++pipe);
            room.getAllProductsInTheRoom().add(bypassHeatingPipesAndGas);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(bypassHeatingPipesAndGas);
            room.getAllProductsInTheRoom().get(i).setQuantity(++pipe);

        }
        CharSequence chPipe = String.valueOf(pipe);
        heatingPipe.setText(chPipe);
    }

    public void decrementSewagePipe(View v) {
        int pipe = Integer.parseInt(sewagePipe.getText().toString());

        if (pipe > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(sewerPipeBypass);
            pipe--;

            if (pipe == 0) {
                room.getAllProductsInTheRoom().remove(sewerPipeBypass);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(pipe);
            }

        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }
        CharSequence chPipe = String.valueOf(pipe);
        sewagePipe.setText(chPipe);
    }

    public void incrementSewagePipe(View v) {
        int pipe = Integer.parseInt(sewagePipe.getText().toString());
        if (pipe == 0) {
            sewerPipeBypass = new SewerPipeBypass();
            sewerPipeBypass.setQuantity(++pipe);
            room.getAllProductsInTheRoom().add(sewerPipeBypass);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(sewerPipeBypass);
            room.getAllProductsInTheRoom().get(i).setQuantity(++pipe);
        }
        CharSequence chPipe = String.valueOf(pipe);
        sewagePipe.setText(chPipe);
    }

    public void decrementLattice50(View v) {

        int lattice50 = Integer.parseInt(this.lattice50.getText().toString());
        if (lattice50 > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheVentilationGrill50mm);
            lattice50--;

            if (lattice50 == 0) {
                room.getAllProductsInTheRoom().remove(installationOfTheVentilationGrill50mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(lattice50);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chLattice = String.valueOf(lattice50);
        this.lattice50.setText(chLattice);
    }

    public void incrementLattice50(View v) {
        int lattice50 = Integer.parseInt(this.lattice50.getText().toString());
        if (lattice50 == 0) {
            installationOfTheVentilationGrill50mm = new InstallationOfTheVentilationGrill50mm();
            installationOfTheVentilationGrill50mm.setQuantity(++lattice50);
            room.getAllProductsInTheRoom().add(installationOfTheVentilationGrill50mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheVentilationGrill50mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++lattice50);

        }
        CharSequence chLattice = String.valueOf(lattice50);
        this.lattice50.setText(chLattice);
    }

    public void decrementLattice100(View v) {
        int lattice100 = Integer.parseInt(this.lattice100.getText().toString());
        if (lattice100 > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheVentilationGrill100mm);
            lattice100--;

            if (lattice100 == 0) {
                room.getAllProductsInTheRoom().remove(installationOfTheVentilationGrill100mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(lattice100);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chLattice = String.valueOf(lattice100);
        this.lattice100.setText(chLattice);
    }

    public void incrementLattice100(View v) {
        int lattice100 = Integer.parseInt(this.lattice100.getText().toString());
        if (lattice100 == 0) {
            installationOfTheVentilationGrill100mm = new InstallationOfTheVentilationGrill100mm();
            installationOfTheVentilationGrill100mm.setQuantity(++lattice100);
            room.getAllProductsInTheRoom().add(installationOfTheVentilationGrill100mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheVentilationGrill100mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++lattice100);

        }
        CharSequence chLattice = String.valueOf(lattice100);
        this.lattice100.setText(chLattice);
    }


    public void decrementCoarseGrainedElement(View view) {
        int coarseGrainedElement = Integer.parseInt(this.coarseGrainedElement.getText().toString());
        if (coarseGrainedElement > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(mountingTheCoarseGrainedElement);
            coarseGrainedElement--;

            if (coarseGrainedElement == 0) {
                room.getAllProductsInTheRoom().remove(mountingTheCoarseGrainedElement);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(coarseGrainedElement);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCoarseGrainedElement = String.valueOf(coarseGrainedElement);
        this.coarseGrainedElement.setText(chCoarseGrainedElement);
    }

    public void incrementCoarseGrainedElement(View view) {
        int coarseGrainedElement = Integer.parseInt(this.coarseGrainedElement.getText().toString());
        if (coarseGrainedElement == 0) {
            mountingTheCoarseGrainedElement = new MountingTheCoarseGrainedElement();
            mountingTheCoarseGrainedElement.setQuantity(++coarseGrainedElement);
            room.getAllProductsInTheRoom().add(mountingTheCoarseGrainedElement);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(mountingTheCoarseGrainedElement);
            room.getAllProductsInTheRoom().get(i).setQuantity(++coarseGrainedElement);

        }
        CharSequence chCoarseGrainedElement = String.valueOf(coarseGrainedElement);
        this.coarseGrainedElement.setText(chCoarseGrainedElement);
    }

    public void decrementFireAlarm(View view) {
        int fireAlarm = Integer.parseInt(this.fireAlarm.getText().toString());
        if (fireAlarm > 0) {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfFireAlarmSystem);
            fireAlarm--;

            if (fireAlarm == 0) {
                room.getAllProductsInTheRoom().remove(installationOfFireAlarmSystem);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(fireAlarm);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chFireAlarm = String.valueOf(fireAlarm);
        this.fireAlarm.setText(chFireAlarm);
    }

    public void incrementFireAlarm(View view) {
        int fireAlarm = Integer.parseInt(this.fireAlarm.getText().toString());
        if (fireAlarm == 0) {
            installationOfFireAlarmSystem = new InstallationOfFireAlarmSystem();
            installationOfFireAlarmSystem.setQuantity(++fireAlarm);
            room.getAllProductsInTheRoom().add(installationOfFireAlarmSystem);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfFireAlarmSystem);
            room.getAllProductsInTheRoom().get(i).setQuantity(++fireAlarm);

        }

        CharSequence chFireAlarm = String.valueOf(fireAlarm);
        this.fireAlarm.setText(chFireAlarm);
    }

    public void decrementFixingPoint(View view) {
        int intFixingPoint = Integer.parseInt(fixingPoint.getText().toString());
        if (intFixingPoint > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheFixingPoint);
            intFixingPoint--;

            if (intFixingPoint == 0) {
                room.getAllProductsInTheRoom().remove(installationOfTheFixingPoint);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intFixingPoint);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chFixingPoint = String.valueOf(intFixingPoint);
        fixingPoint.setText(chFixingPoint);
    }

    public void incrementFixingPoint(View view) {
        int intFixingPoint = Integer.parseInt(fixingPoint.getText().toString());
        if (intFixingPoint == 0) {
            installationOfTheFixingPoint = new InstallationOfTheFixingPoint();
            installationOfTheFixingPoint.setQuantity(++intFixingPoint);
            room.getAllProductsInTheRoom().add(installationOfTheFixingPoint);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(installationOfTheFixingPoint);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intFixingPoint);

        }

        CharSequence chFixingPoint = String.valueOf(intFixingPoint);
        fixingPoint.setText(chFixingPoint);
    }

    public void decrementCornice2400(View view) {
        int intCornice2400 = Integer.parseInt(cornice2400.getText().toString());
        if (intCornice2400 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow2400mm);
            intCornice2400--;

            if (intCornice2400 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow2400mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice2400);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice2400 = String.valueOf(intCornice2400);
        cornice2400.setText(chCornice2400);
    }

    public void incrementCornice2400(View view) {
        int intCornice2400 = Integer.parseInt(cornice2400.getText().toString());
        if (intCornice2400 == 0) {
            corniceThreeRow2400mm = new CorniceThreeRow2400mm();
            corniceThreeRow2400mm.setQuantity(++intCornice2400);
            room.getAllProductsInTheRoom().add(corniceThreeRow2400mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow2400mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice2400);

        }

        CharSequence chCornice2400 = String.valueOf(intCornice2400);
        cornice2400.setText(chCornice2400);
    }

    public void decrementCornice2600(View view) {
        int intCornice2600 = Integer.parseInt(cornice2600.getText().toString());
        if (intCornice2600 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow2600mm);
            intCornice2600--;

            if (intCornice2600 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow2600mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice2600);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice2600 = String.valueOf(intCornice2600);
        cornice2600.setText(chCornice2600);
    }

    public void incrementCornice2600(View view) {
        int intCornice2600 = Integer.parseInt(cornice2600.getText().toString());
        if (intCornice2600 == 0) {
            corniceThreeRow2600mm = new CorniceThreeRow2600mm();
            corniceThreeRow2600mm.setQuantity(++intCornice2600);
            room.getAllProductsInTheRoom().add(corniceThreeRow2600mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow2600mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice2600);

        }

        CharSequence chCornice2600 = String.valueOf(intCornice2600);
        cornice2600.setText(chCornice2600);
    }

    public void decrementCornice3000(View view) {
        int intCornice3000 = Integer.parseInt(cornice3000.getText().toString());
        if (intCornice3000 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3000mm);
            intCornice3000--;

            if (intCornice3000 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow3000mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice3000);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice3000 = String.valueOf(intCornice3000);
        cornice3000.setText(chCornice3000);
    }

    public void incrementCornice3000(View view) {
        int intCornice3000 = Integer.parseInt(cornice3000.getText().toString());
        if (intCornice3000 == 0) {
            corniceThreeRow3000mm = new CorniceThreeRow3000mm();
            corniceThreeRow3000mm.setQuantity(++intCornice3000);
            room.getAllProductsInTheRoom().add(corniceThreeRow3000mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3000mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice3000);

        }

        CharSequence chCornice3000 = String.valueOf(intCornice3000);
        cornice3000.setText(chCornice3000);
    }

    public void decrementCornice3200(View view) {
        int intCornice3200 = Integer.parseInt(cornice3200.getText().toString());
        if (intCornice3200 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3200mm);
            intCornice3200--;

            if (intCornice3200 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow3200mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice3200);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice3200 = String.valueOf(intCornice3200);
        cornice3200.setText(chCornice3200);
    }

    public void incrementCornice3200(View view) {
        int intCornice3200 = Integer.parseInt(cornice3200.getText().toString());
        if (intCornice3200 == 0) {
            corniceThreeRow3200mm = new CorniceThreeRow3200mm();
            corniceThreeRow3200mm.setQuantity(++intCornice3200);
            room.getAllProductsInTheRoom().add(corniceThreeRow3200mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3200mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice3200);

        }

        CharSequence chCornice3200 = String.valueOf(intCornice3200);
        cornice3200.setText(chCornice3200);
    }

    public void decrementCornice3600(View view) {
        int intCornice3600 = Integer.parseInt(cornice3600.getText().toString());
        if (intCornice3600 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3600mm);
            intCornice3600--;

            if (intCornice3600 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow3600mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice3600);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice3600 = String.valueOf(intCornice3600);
        cornice3600.setText(chCornice3600);
    }

    public void incrementCornice3600(View view) {
        int intCornice3600 = Integer.parseInt(cornice3600.getText().toString());
        if (intCornice3600 == 0) {
            corniceThreeRow3600mm = new CorniceThreeRow3600mm();
            corniceThreeRow3600mm.setQuantity(++intCornice3600);
            room.getAllProductsInTheRoom().add(corniceThreeRow3600mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow3600mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice3600);

        }

        CharSequence chCornice3600 = String.valueOf(intCornice3600);
        cornice3600.setText(chCornice3600);
    }

    public void decrementCornice4000(View view) {
        int intCornice4000 = Integer.parseInt(cornice4000.getText().toString());
        if (intCornice4000 > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow4000mm);
            intCornice4000--;

            if (intCornice4000 == 0) {
                room.getAllProductsInTheRoom().remove(corniceThreeRow4000mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intCornice4000);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chCornice4000 = String.valueOf(intCornice4000);
        cornice4000.setText(chCornice4000);
    }

    public void incrementCornice4000(View view) {
        int intCornice4000 = Integer.parseInt(cornice4000.getText().toString());
        if (intCornice4000 == 0) {
            corniceThreeRow4000mm = new CorniceThreeRow4000mm();
            corniceThreeRow4000mm.setQuantity(++intCornice4000);
            room.getAllProductsInTheRoom().add(corniceThreeRow4000mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(corniceThreeRow4000mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intCornice4000);

        }

        CharSequence chCornice4000 = String.valueOf(intCornice4000);
        cornice4000.setText(chCornice4000);
    }

    public void decrementFlexibleCornice(View view) {
        int intFlexibleCornice = Integer.parseInt(flexibleCornice.getText().toString());
        if (intFlexibleCornice > 0) {

            int i = room.getAllProductsInTheRoom().indexOf(flexibleCornice5000mm);
            intFlexibleCornice--;

            if (intFlexibleCornice == 0) {
                room.getAllProductsInTheRoom().remove(flexibleCornice5000mm);
            } else {
                room.getAllProductsInTheRoom().get(i).setQuantity(intFlexibleCornice);
            }
        } else {
            Toast toast = Toast.makeText(this, "меньше нуля", Toast.LENGTH_SHORT);
            toast.show();
        }

        CharSequence chFixingPoint = String.valueOf(intFlexibleCornice);
        flexibleCornice.setText(chFixingPoint);
    }

    public void incrementFlexibleCornice(View view) {
        int intFlexibleCornice = Integer.parseInt(flexibleCornice.getText().toString());
        if (intFlexibleCornice == 0) {
            flexibleCornice5000mm = new FlexibleCornice5000mm();
            flexibleCornice5000mm.setQuantity(++intFlexibleCornice);
            room.getAllProductsInTheRoom().add(flexibleCornice5000mm);
        } else {
            int i = room.getAllProductsInTheRoom().indexOf(flexibleCornice5000mm);
            room.getAllProductsInTheRoom().get(i).setQuantity(++intFlexibleCornice);

        }

        CharSequence chFlexibleCornice = String.valueOf(intFlexibleCornice);
        flexibleCornice.setText(chFlexibleCornice);
    }

    public  void addInstallationCeiling(){
        if (ceilingMaterial.getName().equals("Pongs (Descor)")) {

            if (room.getAllProductsInTheRoom().contains(installationOfFabricCeiling)) {
                int i = room.getAllProductsInTheRoom().indexOf(installationOfFabricCeiling);
                float quantity = room.getAllProductsInTheRoom().get(i).getQuantity();
                quantity = quantity + ceilingMaterial.getQuantity();
                room.getAllProductsInTheRoom().get(i).setQuantity(quantity);
            } else {
                installationOfFabricCeiling.setQuantity(ceilingMaterial.getQuantity());
                room.getAllProductsInTheRoom().add(installationOfFabricCeiling);
            }

        } else {
            if (room.getAllProductsInTheRoom().contains(installingCeiling)) {
                int i = room.getAllProductsInTheRoom().indexOf(installingCeiling);
                float quantity = room.getAllProductsInTheRoom().get(i).getQuantity();
                quantity = quantity + ceilingMaterial.getQuantity();
                room.getAllProductsInTheRoom().get(i).setQuantity(quantity);
            } else {
                installingCeiling.setQuantity(ceilingMaterial.getQuantity());
                room.getAllProductsInTheRoom().add(installingCeiling);
            }
        }
    }


    public void addCeiling(CeilingMaterial ceilingMaterial, float flCeilingMaterialSqare) {
//        CeilingMaterial ceilingMaterial1;
//
        ceilingMaterial.setQuantity(flCeilingMaterialSqare);
        room.putInAllProductsInTheRoom(ceilingMaterial);

//        try {
//            ceilingMaterial1 = (CeilingMaterial) ceilingMaterial.clone();
//            Log.v("отл Текстура clone", "" + ceilingMaterial1.getTexture());
//            room.putInAllProductsInTheRoom(ceilingMaterial1);
//            Log.v("отл Текстура list Main", "" + room.getAllProductsInTheRoom().get(0).getTexture());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }
    }



    public void addBaguette(Baguette baguette, float flInputBaguette) {

//        Baguette baguette1;
//
        baguette.setQuantity(flInputBaguette);
        room.putInAllProductsInTheRoom(baguette);
//        try {
//            baguette1 = (Baguette) baguette.clone();
//            room.putInAllProductsInTheRoom(baguette1);
//            Log.d("Колличество багета " + baguette1.getQuantity(), "переменная вводбагета" + flInputBaguette + " ");
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

    }

    public void addInstallation(SecondaryWork installation, float flInputInstallation) {
        installation.setQuantity(flInputInstallation);
        room.putInAllProductsInTheRoom(installation);
    }

    public void addDesign(Design design, float flInputQuantityDesign) {
//        Design design1;
//        try {
//            design1 = (Design) design.clone();
//            room.putInAllProductsInTheRoom(design1);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }


        design.setQuantity(flInputQuantityDesign);
        room.putInAllProductsInTheRoom(design);
    }

    public void addInstallationCornices(BasicWork installationCornice, float quantity) {

        installationCornice.setQuantity(quantity);
        room.putInAllProductsInTheRoom(installationCornice);

    }

    public void addHood() {
        hood.setQuantity(installationCornice.getQuantity());
        room.putInAllProductsInTheRoom(hood);
    }

    public void addInstallationTimber(Timber timber,float quantity) {

        timber.setQuantity(quantity);
        room.putInAllProductsInTheRoom(timber);

//        Timber timber1;
//        try {
//            timber1 = (Timber) timber.clone();
//            room.putInAllProductsInTheRoom(timber1);
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }

    }

    public  void addLedLight(LedLight ledLight, int quantity) {
        if (ledLight != null) {
            ledLight.setQuantity(quantity);
            room.putInAllProductsInTheRoom(ledLight);
        }
    }

    public  void addLedLight(LedPanel ledPanel, int quantity){
        if (ledPanel != null) {
            ledPanel.setQuantity(quantity);
            room.putInAllProductsInTheRoom(ledPanel);
        }
    }

    /*
метод добавляет новые лед панели  в объект room и сбрасывает editText на ноль
*/
    public void addInstallLamp(int quantity){
        int electricalCableLength = quantity * 2;
        InstallationOfElectricalCable installationOfElectricalCable = new InstallationOfElectricalCable();
        InstallationOfSpotlights installationOfSpotlights = new InstallationOfSpotlights();
        installationOfElectricalCable.setQuantity(electricalCableLength);
        installationOfSpotlights.setQuantity(quantity);

        room.putInAllProductsInTheRoom(installationOfElectricalCable);
        room.putInAllProductsInTheRoom(installationOfSpotlights);
    }
    public void addInstallChandelier(int quantity){
        int electricalCableLength = quantity * 2;
        InstallationOfElectricalCable installationOfElectricalCable = new InstallationOfElectricalCable();
        InstallationOfChandelier installationOfChandelier = new InstallationOfChandelier();
        installationOfElectricalCable.setQuantity(electricalCableLength);
        installationOfChandelier.setQuantity(quantity);

        room.putInAllProductsInTheRoom(installationOfElectricalCable);
        room.putInAllProductsInTheRoom(installationOfChandelier);
    }


    /*
метод добавляет новые люстры  в объект room и сбрасывает editText на ноль
*/
    public void addChandelier(Chandelier chandelier, int quantity) {

        if (chandelier != null) {
            chandelier.setQuantity(quantity);
            room.putInAllProductsInTheRoom(chandelier);
        }
    }


    public void testOrder(View view) {
//String ord = flCeilingMaterialSqare + "  " + flRoomPerimetr;
        //room.setName(strRoomName);
        //room.setSquare(flCeilingMaterialSqare);
        //  ceilingMaterial.setQuantity(flCeilingMaterialSqare);
//        String ord= "В комнате " + room.getName()+ " установлен потолок  " + ceilingMaterial.toString() + " Себестоимость " + ceilingMaterial.getMaterialCoast()
//                +", Стоит " + ceilingMaterial.getPrice() +  room.toString() + room.getName() +room.getSquare() +
//                " периметр  равен " + room.getPerimeter() ;
//        String ord = baguette.getName() + " единицы измерения "+ baguette.getUnits() + "\nВид работ : "+ baguette.getGroupName()+
//                "\nСебестоимость материала "+baguette.getMaterialCoast() + "\nСебестоимость работы " +baguette.getCoastOfWork()+
//                "\nОбщая себестоимость "+baguette.getCoastPrice()+"\nЦена за единицу " + baguette.getPrice() + "\n В количестве "
//                + baguette.getQuantity() + " " + baguette.getUnits() + "\nОбщая Стоимость " + baguette.getTotalPrice()+
//                "\n стоимость всего материала "+baguette.getTotalMaterialCoast()+"\n стоимость всех работ "+baguette.getTotalCoastOfWork();

//        String ord ="Обвод трубы отопления "+ room.getHeatingPipe().getName()+ room.getHeatingPipe().getQuantity() + " шт\n" +
//                "Обвод трубы канализации "+ room.getSewagePipe().getName() + room.getSewagePipe().getQuantity() + " шт\n" +
//                "Установка вент решётки 50 "+ room.getLattice50().getName() + room.getLattice50().getQuantity() + " шт\n" +
//                "Установка вент решётки 100 "+ room.getLattice100().getName() + room.getLattice100().getQuantity() + " шт\n";

//        for (Baguette s : room.getBaguettes()){
//           ord = ord + s.getName() + " " + s.getIntQuantity()+ " \n";
//       }


//        for (Chandelier s : room.getChandeliers()){
//            ord = ord + s.getName() + " " + s.getIntQuantity()+ " \n";
//        }

//        String ord = room.getControllerForLedStrip().getName()+ " В количестве " +
//                room.getControllerForLedStrip().getIntQuantity()+ "\n"+
//                room.getPowerSupplyForLedStrip().getName()+  " В количестве " +
//                room.getPowerSupplyForLedStrip().getIntQuantity()+

//        String ord =
//                room.getLattice50().getGroupName() + ":\n" +
//                room.getLattice50().getName()+  " В количестве " +
//                room.getLattice50().getIntQuantity() + "\n Себестоимость работ " +
//                room.getLattice50().getCoastOfWork() + "\n Себестоимость материала " +
//                room.getLattice50().getMaterialCoast() + "\n Полная себестоимость материала "+
//                room.getLattice50().getTotalMaterialCoast() +  "\n Полная себестоимость работ"+
//                room.getLattice50().getTotalCoastOfWork() + "\n Всего себестоимость " +
//                room.getLattice50().getTotalCoastPrice() + "\n Полная стоимость по прайсу" +
//                room.getLattice50().getTotalPrice() + "\n Едуницы измерения " +
//                room.getLattice50().getUnits() +
//                room.getLattice100().getGroupName() + ":\n" +
//                room.getLattice100().getName()+  " В количестве " +
//                room.getLattice100().getIntQuantity() + "\n Себестоимость работ " +
//                room.getLattice100().getCoastOfWork() + "\n Себестоимость материала " +
//                room.getLattice100().getMaterialCoast() + "\n Полная себестоимость материала "+
//                room.getLattice100().getTotalMaterialCoast() +  "\n Полная себестоимость работ"+
//                room.getLattice100().getTotalCoastOfWork() + "\n Всего себестоимость " +
//                room.getLattice100().getTotalCoastPrice() + "\n Полная стоимость по прайсу" +
//                room.getLattice100().getTotalPrice() + "\n Едуницы измерения " +
//                room.getLattice100().getUnits() +
//                room.getSewagePipe().getGroupName() + ":\n" +
//                room.getSewagePipe().getName() + " В количестве " +
//                room.getSewagePipe().getIntQuantity() + "\n Себестоимость работ " +
//                room.getSewagePipe().getCoastOfWork() + "\n Себестоимость материала " +
//                room.getSewagePipe().getMaterialCoast() + "\n Полная себестоимость материала " +
//                room.getSewagePipe().getTotalMaterialCoast() + "\n Полная себестоимость работ" +
//                room.getSewagePipe().getTotalCoastOfWork() + "\n Всего себестоимость " +
//                room.getSewagePipe().getTotalCoastPrice() + "\n Полная стоимость по прайсу" +
//                room.getSewagePipe().getTotalPrice() + "\n Едуницы измерения " +
//                room.getSewagePipe().getUnits() +
//                room.getHeatingPipe().getGroupName() + ":\n" +
//                room.getHeatingPipe().getName() + " В количестве " +
//                room.getHeatingPipe().getIntQuantity() + "\n Себестоимость работ " +
//                room.getHeatingPipe().getCoastOfWork() + "\n Себестоимость материала " +
//                room.getHeatingPipe().getMaterialCoast() + "\n Полная себестоимость материала " +
//                room.getHeatingPipe().getTotalMaterialCoast() + "\n Полная себестоимость работ" +
//                room.getHeatingPipe().getTotalCoastOfWork() + "\n Всего себестоимость " +
//                room.getHeatingPipe().getTotalCoastPrice() + "\n Полная стоимость по прайсу" +
//                room.getHeatingPipe().getTotalPrice() + "\n Едуницы измерения " +
//                room.getHeatingPipe().getUnits();

        //  String ord = "Проверка профиля \n";

//        for (ArrayMap.Entry<String, Product> pair : room.getAllProductsInTheRoom().entrySet()){
//            ord = ord + pair.getKey() + " " + pair.getValue().toString() + "\n";
//        }
        String ord = "";
        for (Product p : room.getAllProductsInTheRoom()) {
            ord = ord + p.getGroupName() + " " + p.getName() + " " + p.getQuantity() + "\n";
        }
        displayTest(ord);
    }


    public void getPriceMessage() {


    }

    public void displayTest(String mesege) {
        TextView test111 = (TextView) findViewById(R.id.test111);
        test111.setText(mesege);
    }


    // светодиодная лента

    public void addLedStripAndPowerSupply(float length) {

        int quantityPowerSupple = (int) Math.ceil(length / 16);
        PowerSupplyForLedStrip powerSupplyForLedStrip = new PowerSupplyForLedStrip();

        powerSupplyForLedStrip.setQuantity(quantityPowerSupple);
        ledStrip.setQuantity(length);
        ledStrip.setTextColor(Texture.BASE);

        room.getAllProductsInTheRoom().add(ledStrip);
        room.getAllProductsInTheRoom().add(powerSupplyForLedStrip);
    }

    public void addDecorativeInsert(float length) {
        decorativeInsert = new DecorativeInsert(Texture.BASE);
        decorativeInsert.setQuantity(length);

        room.putInAllProductsInTheRoom(decorativeInsert);
    }



    public void addRoomForOrder(View view) {
        order.getRooms().put(room.getName(), room);
    }


    public void clearOrder(View view) {
        roomNameLayout.removeAllViews();
        room = new Room("Заказ");
        createNewRoomButton(room);
        ceilingMaterialSquare.setText("");
        inputQuantityDesign.setText("");
        inputBaguette.setText("");
        inputInstallation.setText("");
        inputCorniceQuantity.setText("");
        inputTimberQuantity.setText("");
        inputLamp.setText("");
        inputLedPanel.setText("");
        inputChandelier.setText("");
        brandSpiner.setSelection(0);
        textureSpinner.setSelection(0);
        colorSpinner.setSelection(0);
        exclusiveSpinner.setSelection(0);
        designMaterialSpinner.setSelection(0);
        baguetteSpinner.setSelection(0);
        typesOfDesignSpinner.setSelection(0);
        installationSpinner.setSelection(0);
        corniceInstallationSpinner.setSelection(0);
        hoodSpinner.setSelection(0);
        timberInstallationSpinner.setSelection(0);
        lampSpinner.setSelection(0);
        gx53bulbSpinner.setSelection(0);
        mr16bulbSpinner.setSelection(0);
        novotechBulbSpinner.setSelection(0);
        ledPanelSpinner.setSelection(0);
        chandelierSpinner.setSelection(0);
        angleView.setText("0");
        heatingPipe.setText("0");
        sewagePipe.setText("0");
        lattice50.setText("0");
        lattice100.setText("0");
        coarseGrainedElement.setText("0");
        fireAlarm.setText("0");
        fixingPoint.setText("0");
        cornice2400.setText("0");
        cornice2600.setText("0");
        cornice3000.setText("0");
        cornice3200.setText("0");
        cornice3600.setText("0");
        cornice4000.setText("0");
        rgb.setChecked(false);
        ledStrip = null;
        colorDecorativeInsertSwitch.setChecked(false);
        pipeAndVentSwich.setChecked(false);
        latticeAndSignalizationSwich.setChecked(false);
        cornicesAndTimberSwitch.setChecked(false);
        corniceOfTheCompanySwitch.setChecked(false);
        ledPanelCheckBox.setChecked(false);
        lampCheckBox.setChecked(false);
        chandelierCheckBox.setChecked(false);
        remoteControlOfLightCheckBox.setChecked(false);
        radioSwitchCheckBox.setChecked(false);
        vacuumCleanerCheckBox.setChecked(false);
        over4MetersCheckBox.setChecked(false);
        lampOption.setVisibility(View.GONE);
        ledPanelOption.setVisibility(View.GONE);
        chandelierOption.setVisibility(View.GONE);
        pipeAndLatticeCounterLayout.setVisibility(View.GONE);
        latticeAndSignalizationLayout.setVisibility(View.GONE);
        corniceOfTheCompanyLayout.setVisibility((View.GONE));
        cornicesAndTimberLayout.setVisibility(View.GONE);
        roomNameLayout.removeAllViews();
        room = new Room("Заказ");
        createNewRoomButton(room);
    }


}
