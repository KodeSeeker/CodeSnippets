
//References-
//1-http://meteatamel.wordpress.com/2012/03/21/deadlock-detection-in-java/
//2-http://stackoverflow.com/questions/1102359/programmatic-deadlock-detection-in-java

private static void detectDeadlock() {
    ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
    long[] threadIds = threadBean.findMonitorDeadlockedThreads();
    int deadlockedThreads = threadIds != null? threadIds.length : 0;
    System.out.println("Number of deadlocked threads: " + deadlockedThreads);
}