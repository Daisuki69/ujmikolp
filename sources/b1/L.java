package b1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L f8289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ L[] f8290b;

    static {
        L l6 = new L("DEFAULT", 0);
        f8289a = l6;
        L l8 = new L("UNMETERED_ONLY", 1);
        L l10 = new L("UNMETERED_OR_DAILY", 2);
        L l11 = new L("FAST_IF_RADIO_AWAKE", 3);
        L l12 = new L("NEVER", 4);
        L l13 = new L("UNRECOGNIZED", 5);
        f8290b = new L[]{l6, l8, l10, l11, l12, l13};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, l6);
        sparseArray.put(1, l8);
        sparseArray.put(2, l10);
        sparseArray.put(3, l11);
        sparseArray.put(4, l12);
        sparseArray.put(-1, l13);
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f8290b.clone();
    }
}
