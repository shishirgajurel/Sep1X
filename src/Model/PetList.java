package Model;

import java.util.ArrayList;
public class PetList
{

  private ArrayList<Pet> pets;

  public PetList()
  {
    pets = new ArrayList<Pet>();
  }
  public void addPet(Pet pet)
  {
    pets.add(pet);
  }
  public Pet getPet(int index)
  {
    return pets.get(index);
  }
  public PetList getPetsByCustomer(Customer customer)
  {
    PetList petList = new PetList();
    for (int i = 0; i < pets.size(); i++)
    {
      if (pets.get(i).getCustomer().equals(customer))
      {
        petList.addPet(pets.get(i));
      }
    }
    return petList;
  }
  public void removePet(Pet pet)
  {
    pets.remove(pet);
  }
}
