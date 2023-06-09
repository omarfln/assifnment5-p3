import java.util.Objects;

public class Computer {
    private String manufacture;
    private String processor;
    private int ramSize;
    private double processorSpeed;

    Computer(String manufacture, String processor, int ramSize, double processorSpeed){
        this.manufacture=manufacture;
        this.processor=processor;
        this.ramSize=ramSize;
        this.processorSpeed=processorSpeed;

    }

    public int getRamSize(){
        return ramSize;
    }

    public double getProcessorSpeed(){
        return processorSpeed;
    }
    public double computePower(){
        return ramSize * processorSpeed;
    }

    @Override
    public String toString(){
        return "Manufacture: " + manufacture +
                "\t Processor" + processor +
                "\t Ram Size: " + ramSize +
                "\t Processor Speed: "+ processorSpeed +
                "\t Computer power: " + computePower();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Computer otherObj = (Computer) obj;
        return  (this.getProcessorSpeed() == otherObj.getProcessorSpeed()) &&
                this.ramSize == otherObj.getRamSize() &&
                this.processor.equals(otherObj.processor) &&
                this.manufacture.equals(otherObj.manufacture);

    }

    @Override
    public int hashCode(){
        return Objects.hash(processorSpeed, ramSize, processor, manufacture);
    }
}
