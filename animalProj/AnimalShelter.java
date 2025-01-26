public interface AnimalShelter {
    
    /** Maximum number of Cats sheltered */
  public static final int CATSMAX = 30; 
  /** Maximum number of Dogs sheltered */     
  public static final int DOGMAX = 20;    
  /** Maximum number of Reptiles sheltered */   
  public static final int REPTILEMAX = 5;   
	
  /** allAnimals displays all Animals sheltered including those that have
	 *    been adopted.
	 */
  public void allAnimals(); 
	 
  /** available produces a display of all Animals available for adoption.
	 */	  
  public void available();     
	
  /** adopted produces a display of all animals that have been adopted.
	 */
  public void adopted(); 
	
  /** allType produces a display of all animals of a particular type.
	 * @param int representing the type of animal - Cat, Dog, or Reptile
	 * @param boolean indicator of whether to include adopted animals.
	 */
  public void allType(int animalType, boolean adopted); 
	 
  /** adopt changes an animal's status to adopted.
	 * @param int id of the animal to be adopted
	 * @return boolean indicator of success.  False will be returned when the animal's status already
	 *     indicates adopted or the id was not found.
	 */
  public boolean adopt(int id);   
	
  /** accepts an animal into the shelter.
	 * @param Animal object to be added to the shelter
	 * @return boolean indicator of success. False will be returned when the animal can not be accomodated.
	 */ 
  public boolean accept(Animal pet);   
	
  /** accepts an animal into the shelter that was previously sheltered.
	 * @param int id of the animal being returned to the shelter.
	 * @return boolean indicator of success. False will be returned when the animal can not be accomodated.
	 */ 
  public boolean accept(int id);  
}
