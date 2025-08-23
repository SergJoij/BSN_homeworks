package builder;

public class House {
    private Float square;     // m2
    private Short floors;
    private Short yearOfLR;          // опционально, год последней реставрации
    private String descriptionOfLR;  // опционально, описание последней реставрации

    private House(HouseBuilder houseBuilder){
        this.square = houseBuilder.square;
        this.floors = houseBuilder.floors;
        this.yearOfLR = houseBuilder.yearOfLR;
        this.descriptionOfLR = houseBuilder.descriptionOfLR;
    }

    public Float getSquare() {
        return this.square;
    }


    public Short getFloors() {
        return floors;
    }

    public void setFloors(Short floors) {
        this.floors = floors;
    }

    public void setSquare(Float square){
        this.square = square;
    }

    public static class HouseBuilder{
        private Float square;
        private Short floors;
        private Short yearOfLR;
        private String descriptionOfLR;

        public HouseBuilder(Float square, Short floors){
            this.square = square;
            this.floors = floors;
        }

        public HouseBuilder setYearOfLR(Short yearOfLastReconstruction){
            this.yearOfLR = yearOfLastReconstruction;
            return this;
        }

        public HouseBuilder setDescriptionOfLR(String descriptionOfLastReconstruction){
            this.descriptionOfLR = descriptionOfLastReconstruction;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }

    public String fullInfo() {
        return String.format("Площадь: %f кв.м.\nКоличество этажей: %d\nПоследняя реставрация.\n\tГод: %d\n\t%s\n",
                square, floors, yearOfLR, descriptionOfLR);
    }
}
