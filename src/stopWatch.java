import java.util.Date;

public class stopWatch {
    private double startTime;
    private double endTime;
    public stopWatch(){
    }
    public stopWatch(double startTime, double endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public void start(){

        this.startTime =  System.currentTimeMillis();
    }
    public void stop() {
        this.endTime =  System.currentTimeMillis();
    }
    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
    public double getStartTime() {
        return startTime;
    }
    public double getEndTime() {
        return endTime;
    }
}
