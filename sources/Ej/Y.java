package Ej;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f1426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y f1427b;
    public static final Y c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ Y[] f1428d;

    static {
        Y y7 = new Y("START", 0);
        f1426a = y7;
        Y y10 = new Y("STOP", 1);
        f1427b = y10;
        Y y11 = new Y("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = y11;
        Y[] yArr = {y7, y10, y11};
        f1428d = yArr;
        v0.h(yArr);
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) f1428d.clone();
    }
}
