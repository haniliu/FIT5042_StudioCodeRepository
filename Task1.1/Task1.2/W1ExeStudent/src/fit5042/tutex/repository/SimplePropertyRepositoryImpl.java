/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fit5042.tutex.repository;
import fit5042.tutex.repository.entities.Property;
import java.util.*;
/**
 * TODO Exercise 1.3 Step 2 Complete this class.
 * 
 * This class implements the PropertyRepository class. You will need to add the keyword
 * "implements" PropertyRepository. 
 * 
 * @author Jian 
 */
public class SimplePropertyRepositoryImpl implements PropertyRepository{
    private ArrayList<Property> properties = new ArrayList<Property>();

    @Override
    public void addProperty(Property property) throws Exception {
        this.properties.add(property);
    
    }

    @Override
    public Property searchPropertyById(int id) throws Exception {
        Property result = null;
        for (Property p : properties){
            if (id == p.getId())
                result = p;
        }
        
        return result;
       
    }

    @Override
    public List<Property> getAllProperties() throws Exception {
        return properties;
    }
    
}
