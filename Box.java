package packer;

/**
 *
 * @author suprina
 */

public class Box {
    
    
    private Manifest contents; //using for contents
    private Customer customer; //using for customers
    private Depot depot;  //using fordepot

    
    // public to 
    Box(Customer customer, Depot depot) {
        this.customer = customer;
        this.depot = depot;
        contents = new Manifest();
    }

 
    
    public void addProduct(Product product) {
        if (canFit(product)) {
            contents.addProduct(product, 1);
        }
    }
    
    
    
    public void addProduct(Product product, int quantity) {
        if (canFit(product,quantity)); {
            contents.addProduct(product, quantity);
        }
    }
   
    public String getLabel() {
        StringBuilder label = new StringBuilder();
        label.append(customer);
        label.append("\n");
        label.append(customer.getClosestAddressTo(depot));
        label.append("\n");
        label.append(contents.toString());
        label.append("\n");
        if (this.isFragile()) {
            label.append("FRAGILE\n");
        }
        return label.toString();
    }
    
    public String toString() {
        return getLabel();
    }
    //creating getweight method of manifest
    public double getWeight() {
        return contents.getWeight();
    }
    
       //     public void addProduct(Product product) {
       //         if (canFit(product)) {
       //             contents.addProduct(product, 1);
       //         }
        //    }
    
    public boolean canFit(Product p) {
        return p.getWeight() < 20;
    }
    
    public boolean canFit(Product p, int quantity) {
        return (p.getWeight() * quantity) < 20; //quantity less then 20
    }
    
    public double remainingCapacity() {
        return 20 - this.getWeight();
    }
    
    public boolean isFragile() {
        return contents.hasFragileItems();
    }
    
    public boolean isHazardous() {
        return false;
    }
}

