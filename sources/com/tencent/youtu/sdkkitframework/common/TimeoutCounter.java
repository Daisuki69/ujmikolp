package com.tencent.youtu.sdkkitframework.common;

import com.tencent.youtu.sdkkitframework.common.StateEvent;
import com.tencent.youtu.sdkkitframework.framework.YtFSM;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class TimeoutCounter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15825a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15826b = 0;
    public boolean c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15827d = true;
    public String e;

    public TimeoutCounter(String str) {
        this.e = str;
    }

    public void cancel() {
        YtLogger.i("TimeoutCounter", this.e + " cancel");
        this.c = false;
    }

    public boolean checkTimeout() {
        return this.c && this.f15826b > 0 && System.currentTimeMillis() - this.f15825a > this.f15826b;
    }

    public void init(long j, boolean z4) {
        this.f15826b = j;
        this.f15827d = z4;
        YtLogger.i("TimeoutCounter", this.e + " init with " + this.f15826b);
    }

    public boolean isRunning() {
        return this.c && this.f15826b > 0;
    }

    public void reset() {
        YtLogger.i("TimeoutCounter", this.e + " reset");
        this.c = true;
        if (this.f15826b > 0 && this.f15827d) {
            YtFSM.getInstance().sendFSMEvent(new HashMap<String, Object>() { // from class: com.tencent.youtu.sdkkitframework.common.TimeoutCounter.1
                {
                    put(StateEvent.Name.UI_ACTION, StateEvent.ActionValue.TIMEOUT_COUNTDOWN_BEGIN);
                    put(StateEvent.Name.COUNTDOWN_TIME, Long.valueOf(TimeoutCounter.this.f15826b));
                }
            });
        }
        this.f15825a = System.currentTimeMillis();
    }

    public void start() {
        reset();
    }
}
