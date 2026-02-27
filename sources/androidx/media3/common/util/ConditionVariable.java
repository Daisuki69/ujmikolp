package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() throws InterruptedException {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z4 = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z4 = true;
            }
        }
        if (z4) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z4;
        z4 = this.isOpen;
        this.isOpen = false;
        return z4;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j) throws InterruptedException {
        if (j <= 0) {
            return this.isOpen;
        }
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long j6 = j + jElapsedRealtime;
        if (j6 < jElapsedRealtime) {
            block();
        } else {
            while (!this.isOpen && jElapsedRealtime < j6) {
                wait(j6 - jElapsedRealtime);
                jElapsedRealtime = this.clock.elapsedRealtime();
            }
        }
        return this.isOpen;
    }
}
