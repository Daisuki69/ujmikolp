package b3;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y f8422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Y f8423b;
    public static final /* synthetic */ Y[] c;

    static {
        Y y7 = new Y("GENERAL", 0);
        f8422a = y7;
        Y y10 = new Y("FALLBACK", 1);
        f8423b = y10;
        Y[] yArr = {y7, y10};
        c = yArr;
        v0.h(yArr);
    }

    public static Y valueOf(String str) {
        return (Y) Enum.valueOf(Y.class, str);
    }

    public static Y[] values() {
        return (Y[]) c.clone();
    }
}
