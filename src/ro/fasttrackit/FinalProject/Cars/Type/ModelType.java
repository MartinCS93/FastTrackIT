package ro.fasttrackit.FinalProject.Cars.Type;

public enum ModelType {
    POLO("Polo"),
    GOLF("Golf"),
    PASSAT("Passat"),
    TAIGO("Taigo"),
    TROC("T-Roc"),
    TCROSS("T-Cross"),
    TIGUAN("Tiguan"),
    TOAUREG("Touareg");

    private String modelType;

    ModelType(String string) {
        this.modelType = string;
    }

    public String getModelType() {
        return modelType;
    }


}
