package b1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f8285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ I[] f8286b;

    /* JADX INFO: Fake field, exist only in values array */
    I EF5;

    static {
        I i = new I("UNKNOWN_MOBILE_SUBTYPE", 0);
        I i4 = new I("GPRS", 1);
        I i6 = new I("EDGE", 2);
        I i10 = new I("UMTS", 3);
        I i11 = new I("CDMA", 4);
        I i12 = new I("EVDO_0", 5);
        I i13 = new I("EVDO_A", 6);
        I i14 = new I("RTT", 7);
        I i15 = new I("HSDPA", 8);
        I i16 = new I("HSUPA", 9);
        I i17 = new I("HSPA", 10);
        I i18 = new I("IDEN", 11);
        I i19 = new I("EVDO_B", 12);
        I i20 = new I("LTE", 13);
        I i21 = new I("EHRPD", 14);
        I i22 = new I("HSPAP", 15);
        I i23 = new I("GSM", 16);
        I i24 = new I("TD_SCDMA", 17);
        I i25 = new I("IWLAN", 18);
        I i26 = new I("LTE_CA", 19);
        f8286b = new I[]{i, i4, i6, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, new I("COMBINED", 20)};
        SparseArray sparseArray = new SparseArray();
        f8285a = sparseArray;
        sparseArray.put(0, i);
        sparseArray.put(1, i4);
        sparseArray.put(2, i6);
        sparseArray.put(3, i10);
        sparseArray.put(4, i11);
        sparseArray.put(5, i12);
        sparseArray.put(6, i13);
        sparseArray.put(7, i14);
        sparseArray.put(8, i15);
        sparseArray.put(9, i16);
        sparseArray.put(10, i17);
        sparseArray.put(11, i18);
        sparseArray.put(12, i19);
        sparseArray.put(13, i20);
        sparseArray.put(14, i21);
        sparseArray.put(15, i22);
        sparseArray.put(16, i23);
        sparseArray.put(17, i24);
        sparseArray.put(18, i25);
        sparseArray.put(19, i26);
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) f8286b.clone();
    }
}
