package com.dynatrace.android.app;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class LcContext {
    private static volatile LcContext theInstance;
    private LcCallbacks lifecycleCB = new LcCallbacks();

    private LcContext() {
    }

    public static LcContext getInstance() {
        if (theInstance == null) {
            synchronized (LcContext.class) {
                try {
                    if (theInstance == null) {
                        theInstance = new LcContext();
                    }
                } finally {
                }
            }
        }
        return theInstance;
    }

    public LcCallbacks getActivityLcCallbacks() {
        return this.lifecycleCB;
    }

    public boolean isLifecycleInEffect() {
        return false;
    }
}
