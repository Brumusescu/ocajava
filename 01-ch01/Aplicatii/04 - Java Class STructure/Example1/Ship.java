public class Ship implements Dockable{
    private String shipType;
    
    public String getShipType () {
        return this.shipType;
    }
    
    public void setShipType (String shipType) {
        this.shipType = shipType;
    }
    
    public void dockShip() {
        // To do:
    }
    
    public String toString() {
        return "The pirate ship is a " + shipType + " ship.";
    }
}