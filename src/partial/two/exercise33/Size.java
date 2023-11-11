package coco77.exercise33;

public class Size {

    public static final String SIZE_SHIRT[][] = {{"S", "M", "L"}, {"16", "18", "20"}};
    public static String sizeLetter;
    private int size;

    public Size(int size) {
        this.size = size;
    }

    public String getSize() {
        return String.valueOf(size);
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String calculateSizeShrit() {

        int row = Size.SIZE_SHIRT.length;

        for (int i = 0; i < row; i++) {
            int columnt = Size.SIZE_SHIRT[i].length;
            for (int j = 0; j < columnt; j++) {
                if (getSize().equals(SIZE_SHIRT[i][j])) {
                    return SIZE_SHIRT[0][j];
                }
            }
        }
        return "Talla no encontrada";
    }
}
