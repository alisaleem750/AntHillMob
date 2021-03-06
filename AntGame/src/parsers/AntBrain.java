package parsers;

import instructions.Instruction;

/**
 * Class representing an ant's brain. 
 * Consists of an an array of Instruction objects.
 */
public class AntBrain {
    
    private String name;
    private Instruction[] antbrain;
    
    /**
     * Constructor.
     * receives output from the AntBrainParser as input.
     * @param name Name of the AntBrain.
     * @param ab Array of instructions which constitutes the antbrain.
     */
    public AntBrain(String name, Instruction[] ab) {
        this.name = name;
        this.antbrain = ab;
    }
    
    /**
     * Get the Name of the antbrain.
     * @return the name of the antbrain.
     */
    public String getNameRaw(){
        return name;
    }
    
    /**
     * Get the Name of the antbrain without whitespace / newline.
     * @return the name of the antbrain. For file name in saving.
     */
    public String getName(){
        String s = name.trim();
        return s.substring(1);
    }
    
    /**
     * Gets the Instruction for the state.
     * @param state Current state of Ant.
     * @return Instruction to be carried out.
     */
    public Instruction getInstructionAt(int state) {
        return antbrain[state];
    }
    
    /**
     * Get the Instruction array for the AntBrain
     * @return Instruction array that constitutes the antbrain.
     */
    public Instruction[] getInstructionArray(){
        return this.antbrain;
    }
}
