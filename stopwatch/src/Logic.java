import java.util.Date;
//Этот класс планировался чтобы оградить пользовательский класс вью, от самой логики секундомера.
public class Logic {
    private long startTime;
    private long pauseTime;
    private long resumeTime;
    private long stopTime;
    private long resTime;
    private long timeFromStartToPause;
    private long timeFromPauseToResume;
    private long timeFromResumeToPause;

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public double getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(long pauseTime) {
        this.pauseTime = pauseTime;
    }

    public double getResumeTime() {
        return resumeTime;
    }

    public double getResTime() {
        return resTime;
    }

    public void setResTime(long resTime) {
        this.resTime = resTime;
    }

    public double getTimeFromStartToPause() {
        return timeFromStartToPause;
    }

    public void setTimeFromStartToPause(long timeFromStartToPause) {
        this.timeFromStartToPause = timeFromStartToPause;
    }

    public double getTimeFromPauseToResume() {
        return timeFromPauseToResume;
    }

    public void setTimeFromPauseToResume(long timeFromPauseToResume) {
        this.timeFromPauseToResume = timeFromPauseToResume;
    }

    public double getTimeFromResumeToPause() {
        return timeFromResumeToPause;
    }

    public void setTimeFromResumeToPause(long timeFromResumeToPause) {
        this.timeFromResumeToPause = timeFromResumeToPause;
    }

    public void setResumeTime(long resumeTime) {
        this.resumeTime = resumeTime;
    }

    public double getStopTime() {
        return stopTime;
    }

    public void setStopTime(long stopTime) {
        this.stopTime = stopTime;
    }

    public Logic() {
        this.startTime = 0;
        this.pauseTime = 0;
        this.resumeTime = 0;
        this.stopTime = 0;
    }
    public long start(){
        return startTime = System.currentTimeMillis();
    }
    public long pause(){
        pauseTime = System.currentTimeMillis();

        if (resumeTime <= startTime) {
            timeFromStartToPause = pauseTime - startTime;
            return resTime = resTime + timeFromStartToPause;
        }
        else {
            timeFromResumeToPause = pauseTime - resumeTime;
            resTime = resTime + timeFromResumeToPause;
            return resumeTime = 0;
        }

    }
    public long resume(){
        if (pauseTime > resumeTime)
            resumeTime = System.currentTimeMillis();
        return resumeTime;

    }
    public long stop(){
        stopTime = System.currentTimeMillis();

        return resTime = resTime + (stopTime - resumeTime);
    }
}
