package b1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B f8283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ B[] f8284b;

    /* JADX INFO: Fake field, exist only in values array */
    B EF2;

    static {
        B b8 = new B("NOT_SET", 0);
        B b10 = new B("EVENT_OVERRIDE", 1);
        f8283a = b10;
        f8284b = new B[]{b8, b10};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, b8);
        sparseArray.put(5, b10);
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) f8284b.clone();
    }
}
