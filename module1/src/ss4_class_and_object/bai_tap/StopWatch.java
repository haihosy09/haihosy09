package ss4_class_and_object.bai_tap;

public class StopWatch {
    private long startTime;
    private long endTime;

    // Constructor không tham số
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    // Getter cho startTime
    public long getStartTime() {
        return startTime;
    }

    // Getter cho endTime
    public long getEndTime() {
        return endTime;
    }

    // Phương thức start: Reset startTime
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    // Phương thức stop: Gán endTime bằng thời gian hiện tại
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    // Phương thức getElapsedTime: Trả về thời gian đã trôi qua (ms)
    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

}



