package fit5042.tutex;

import fit5042.tutex.repository.PropertyRepository;
import fit5042.tutex.repository.PropertyRepositoryFactory;
import fit5042.tutex.repository.entities.Property;
import java.util.Scanner;

/**
 *
 * TODO Exercise 1.3 Step 3 Complete this class. Please refer to tutorial instructions.
 * This is the main driver class. This class contains the main method for Exercise 1A
 * 
 * This program can run without the completion of Exercise 1B.
 * 
 * @author Jian
 */
public class RealEstateAgency {
    private String name;
    private final PropertyRepository propertyRepository;
    
    public RealEstateAgency(String name) throws Exception {
    this.name = name;
    this.propertyRepository = PropertyRepositoryFactory.getInstance();
    }
    
    // Complete the code
    public static void main(String[] args) throws Exception {
        RealEstateAgency real = new RealEstateAgency("Real");
        Property p1 = new Property(1, "24 Boston Ave, Australia", 150, 42.00);
        Property p2 = new Property(2, "25 Boston Ave, Australia", 200, 69.00);
        Property p3 = new Property(3, "26 Boston Ave, Australia", 300, 100.00);
        Property p4 = new Property(4, "27 Boston Ave, Australia", 250, 78.00);
        Property p5 = new Property(5, "28 Boston Ave, Australia", 100, 22.00);
        real.propertyRepository.addProperty(p1);
        real.propertyRepository.addProperty(p2);
        real.propertyRepository.addProperty(p3);
        real.propertyRepository.addProperty(p4);
        real.propertyRepository.addProperty(p5);
        System.out.println("5 Properties added sucessfully");
        System.out.println("************************************************************************");
        System.out.println(p1.getId() + " " + p1.getAddress() + " " + p1.getSize() + "sqm $" + p1.getPrice());
        System.out.println(p2.getId() + " " + p2.getAddress() + " " + p2.getSize() + "sqm $" + p2.getPrice());
        System.out.println(p3.getId() + " " + p3.getAddress() + " " + p3.getSize() + "sqm $" + p3.getPrice());
        System.out.println(p4.getId() + " " + p4.getAddress() + " " + p4.getSize() + "sqm $" + p4.getPrice());
        System.out.println(p5.getId() + " " + p5.getAddress() + " " + p5.getSize() + "sqm $" + p5.getPrice());
        System.out.println("************************************************************************");
        System.out.println("Enter the ID of the property you want to search:");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        Property pro = real.propertyRepository.searchPropertyById(id);
        
        if (pro == null)
        {
            System.out.println("error");
        }else {
            System.out.println(pro.getId() + " " + pro.getAddress() + " " + pro.getSize() + "sqm $" + pro.getPrice());
        }
        
        
    }

    
}
