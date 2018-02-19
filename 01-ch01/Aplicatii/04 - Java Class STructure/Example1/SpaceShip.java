public class SpaceShip extends Ship implements Dockable {
    // Data Members:
    public enum ShipType {
        FRIGATE, BATTLESHIP, MINELAYER, ESCORT, DEFENSE
    }
    ShipType shipType = ShipType.BATTLESHIP;
    
    // Constructors:
    public SpaceShip () {
        System.out.println("\nSpaceShip creates with default ship type.");
    }
    
    public SpaceShip (ShipType shipType) {
        System.out.println("\nSpaceSHip created with specified ship type.");
        this.shipType = shipType;
    }
    
    // Methods:
    @Override
    public void dockShip() {
        // To do:
    }
    
    @Override
    public String toString() {
        String shipTypeRefined = this.shipType.name().toLowerCase();
        return "The pirate ship is a " + shipTypeRefined + " ship.";
    }
}