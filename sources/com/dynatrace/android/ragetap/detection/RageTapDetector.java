package com.dynatrace.android.ragetap.detection;

import We.s;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public class RageTapDetector {
    private static final String LOG_TAG = s.p(new StringBuilder(), Global.LOG_PREFIX, "RageTapDetector");
    private final ScheduledExecutorService executor;
    private final List<RageTapListener> listeners;
    private RageTapRules rules;
    private ScheduledFuture<?> scheduledTask;
    private Session session;
    private final TimeLineProvider timeLineProvider;
    private long timeout;
    private TapData firstTap = null;
    private TapData lastTap = null;
    private int numOfTaps = 0;
    private boolean isInit = false;
    private final Runnable timeoutTask = new Runnable() { // from class: com.dynatrace.android.ragetap.detection.RageTapDetector.1
        @Override // java.lang.Runnable
        public void run() {
            RageTapDetector.this.onTimespanTimeout();
        }
    };

    public RageTapDetector(List<RageTapListener> list, ScheduledExecutorService scheduledExecutorService, TimeLineProvider timeLineProvider) {
        this.listeners = Collections.unmodifiableList(list);
        this.executor = scheduledExecutorService;
        this.timeLineProvider = timeLineProvider;
    }

    private void registerFirstTap(TapData tapData) {
        if (this.session.getSessionStartTime() > tapData.getTapDown().getTimestamp()) {
            if (Global.DEBUG) {
                Utility.zlogD(LOG_TAG, "discard tap because it partially occurred outside of the session");
            }
            reset();
        } else {
            this.firstTap = tapData;
            this.lastTap = tapData;
            this.numOfTaps = 1;
        }
    }

    private void reset() {
        ScheduledFuture<?> scheduledFuture = this.scheduledTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.scheduledTask = null;
        }
        this.firstTap = null;
        this.lastTap = null;
        this.numOfTaps = 0;
    }

    private ScheduledFuture<?> scheduleTimeoutTask() {
        return this.executor.schedule(this.timeoutTask, this.timeout, TimeUnit.MILLISECONDS);
    }

    public synchronized void evaluateAndReset() {
        evaluateAndReset(true);
    }

    public synchronized void onNewSession(Session session) {
        try {
            if (this.isInit) {
                evaluateAndReset(false);
            }
            this.session = session;
            this.rules = new RageTapRules(session.getRageTapConfiguration());
            this.timeout = session.getRageTapConfiguration().getTimespanDifference();
            this.isInit = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void onTapDetected(TapData tapData) {
        try {
            if (this.isInit) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "register tap: " + tapData);
                }
                if (this.rules.exceedsTapDuration(tapData)) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOG_TAG, "tap exceeds click duration");
                    }
                    evaluateAndReset();
                    return;
                }
                if (this.firstTap == null) {
                    registerFirstTap(tapData);
                    return;
                }
                if (this.rules.exceedsTimespanDifference(this.lastTap, tapData)) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOG_TAG, "tap exceeds timespan difference");
                    }
                    evaluateAndReset();
                    registerFirstTap(tapData);
                    return;
                }
                if (this.rules.exceedsDispersionRadius(this.lastTap, tapData)) {
                    if (Global.DEBUG) {
                        Utility.zlogD(LOG_TAG, "tap exceeds dispersion radius");
                    }
                    evaluateAndReset();
                    registerFirstTap(tapData);
                    return;
                }
                this.lastTap = tapData;
                int i = this.numOfTaps + 1;
                this.numOfTaps = i;
                if (this.rules.hasMinimumNumberOfTaps(i)) {
                    ScheduledFuture<?> scheduledFuture = this.scheduledTask;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.scheduledTask = scheduleTimeoutTask();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void onTimespanTimeout() {
        try {
            if (this.firstTap == null) {
                return;
            }
            if (this.rules.exceedsTimespanDifference(this.lastTap, this.timeLineProvider.now())) {
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "timespan difference exceeded");
                }
                evaluateAndReset();
            } else {
                ScheduledFuture<?> scheduledFuture = this.scheduledTask;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.scheduledTask = scheduleTimeoutTask();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void evaluateAndReset(boolean z4) {
        if (this.isInit) {
            if (this.rules.hasMinimumNumberOfTaps(this.numOfTaps)) {
                RageTap rageTap = new RageTap(this.firstTap, this.lastTap, this.numOfTaps);
                if (Global.DEBUG) {
                    Utility.zlogD(LOG_TAG, "rage tap detected: " + rageTap);
                }
                Iterator<RageTapListener> it = this.listeners.iterator();
                while (it.hasNext()) {
                    it.next().onRageTap(this.session, rageTap, z4);
                }
            }
            reset();
        }
    }
}
