package com.dynatrace.android.agent;

import We.s;
import com.dynatrace.android.agent.util.Utility;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class ConnectionAttemptMonitor {
    private static final long FIFTY_SEVEN_MINUTE = 3420000;
    private static final long ONE_MINUTE = 60000;
    private static final String TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "ConnectionAttemptMonitor");
    private static final long THIRTY_TWO_MINUTE = 1920000;
    private Date currentWhen;
    private long initialConnAttempts;
    private boolean lastConnected;
    private long nextAttemptTime;
    private boolean onceConnected;
    private AtomicBoolean timeToConnect;
    private Timer timer;

    public class AttemptTimer extends TimerTask {
        private AttemptTimer() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            synchronized (ConnectionAttemptMonitor.this) {
                ConnectionAttemptMonitor.this.timeToConnect.set(true);
                ConnectionAttemptMonitor connectionAttemptMonitor = ConnectionAttemptMonitor.this;
                connectionAttemptMonitor.setTimer(connectionAttemptMonitor.getNextAttemptTime());
            }
        }
    }

    public ConnectionAttemptMonitor(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("Connection attempts must be greater than zero");
        }
        this.initialConnAttempts = i + 1;
        this.timeToConnect = new AtomicBoolean(true);
        this.nextAttemptTime = 0L;
        setTimer(getNextAttemptTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Date getNextAttemptTime() {
        Date date = new Date(TimeLineProvider.getSystemTime() + this.nextAttemptTime);
        long j = this.initialConnAttempts - 1;
        this.initialConnAttempts = j;
        if (j > 0) {
            this.nextAttemptTime = 60000L;
            return date;
        }
        if (j == 0) {
            this.nextAttemptTime = 0L;
            return null;
        }
        long j6 = this.nextAttemptTime;
        if (j6 == THIRTY_TWO_MINUTE) {
            this.nextAttemptTime = FIFTY_SEVEN_MINUTE;
            return date;
        }
        if (j6 == FIFTY_SEVEN_MINUTE || j6 <= 0) {
            return null;
        }
        this.nextAttemptTime = j6 * 2;
        return date;
    }

    public synchronized void cancelTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
            this.timer.purge();
            this.timer = null;
        }
    }

    public boolean isTimeToConnect() {
        return this.timeToConnect.getAndSet(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0023, code lost:
    
        if (r6.nextAttemptTime >= com.dynatrace.android.agent.ConnectionAttemptMonitor.FIFTY_SEVEN_MINUTE) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean moreAttemptsAllowed() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.timeToConnect     // Catch: java.lang.Throwable -> L26
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L26
            r1 = 1
            if (r0 == 0) goto Lc
            monitor-exit(r6)
            return r1
        Lc:
            boolean r0 = r6.lastConnected     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            java.util.Timer r0 = r6.timer     // Catch: java.lang.Throwable -> L26
            if (r0 != 0) goto L2b
            long r2 = r6.initialConnAttempts     // Catch: java.lang.Throwable -> L26
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L28
            long r2 = r6.nextAttemptTime     // Catch: java.lang.Throwable -> L26
            r4 = 3420000(0x342f60, double:1.6897045E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L2b
            goto L28
        L26:
            r0 = move-exception
            goto L2d
        L28:
            monitor-exit(r6)
            r0 = 0
            return r0
        L2b:
            monitor-exit(r6)
            return r1
        L2d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L26
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.agent.ConnectionAttemptMonitor.moreAttemptsAllowed():boolean");
    }

    public synchronized void notifyConnectionState(boolean z4, boolean z5) {
        try {
            this.lastConnected = z4;
            this.timeToConnect.set(false);
            if (z4) {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Connection ok notification");
                }
                this.onceConnected = true;
                this.initialConnAttempts = -1L;
                this.nextAttemptTime = 0L;
                cancelTimer();
            } else {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "No connection notification");
                }
                if (this.onceConnected && this.timer == null && this.nextAttemptTime == 0) {
                    this.nextAttemptTime = 60000L;
                    setTimer(getNextAttemptTime());
                } else if (z5 && this.timer == null) {
                    setTimer(getNextAttemptTime());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void notifyStateTooManyRequests(int i) {
        try {
            this.lastConnected = false;
            this.timeToConnect.set(false);
            if (this.onceConnected && this.timer == null && this.nextAttemptTime == 0) {
                this.nextAttemptTime = 60000L;
            }
            if (this.timer != null || getNextAttemptTime() != null) {
                setTimer(new Date(TimeLineProvider.getSystemTime() + ((long) (i * 1000))));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean reconnAttemptInProgress() {
        return this.onceConnected && !this.lastConnected && this.nextAttemptTime > 0;
    }

    public synchronized void restartTimer() {
        setTimer(this.currentWhen);
    }

    public synchronized void setTimer(Date date) {
        cancelTimer();
        this.currentWhen = date;
        if (date != null) {
            String str = TAG;
            Timer timer = new Timer(str);
            this.timer = timer;
            try {
                timer.schedule(new AttemptTimer(), this.currentWhen);
                if (Global.DEBUG) {
                    Utility.zlogD(str, "Connection attempt is scheduled for " + this.currentWhen);
                }
            } catch (Exception e) {
                if (Global.DEBUG) {
                    Utility.zlogD(TAG, "Failed to schedule a connection attempt ... " + e.toString());
                }
            }
        }
    }

    public synchronized void stop() {
        try {
            this.lastConnected = false;
            this.timeToConnect.set(false);
            if (Global.DEBUG) {
                Utility.zlogD(TAG, "Connection stop notification");
            }
            cancelTimer();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
