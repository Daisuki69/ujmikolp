package b1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f8287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ J[] f8288b;

    /* JADX INFO: Fake field, exist only in values array */
    J EF3;

    static {
        J j = new J("MOBILE", 0);
        J j6 = new J("WIFI", 1);
        J j7 = new J("MOBILE_MMS", 2);
        J j9 = new J("MOBILE_SUPL", 3);
        J j10 = new J("MOBILE_DUN", 4);
        J j11 = new J("MOBILE_HIPRI", 5);
        J j12 = new J("WIMAX", 6);
        J j13 = new J("BLUETOOTH", 7);
        J j14 = new J("DUMMY", 8);
        J j15 = new J("ETHERNET", 9);
        J j16 = new J("MOBILE_FOTA", 10);
        J j17 = new J("MOBILE_IMS", 11);
        J j18 = new J("MOBILE_CBS", 12);
        J j19 = new J("WIFI_P2P", 13);
        J j20 = new J("MOBILE_IA", 14);
        J j21 = new J("MOBILE_EMERGENCY", 15);
        J j22 = new J("PROXY", 16);
        J j23 = new J("VPN", 17);
        J j24 = new J("NONE", 18);
        f8288b = new J[]{j, j6, j7, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24};
        SparseArray sparseArray = new SparseArray();
        f8287a = sparseArray;
        sparseArray.put(0, j);
        sparseArray.put(1, j6);
        sparseArray.put(2, j7);
        sparseArray.put(3, j9);
        sparseArray.put(4, j10);
        sparseArray.put(5, j11);
        sparseArray.put(6, j12);
        sparseArray.put(7, j13);
        sparseArray.put(8, j14);
        sparseArray.put(9, j15);
        sparseArray.put(10, j16);
        sparseArray.put(11, j17);
        sparseArray.put(12, j18);
        sparseArray.put(13, j19);
        sparseArray.put(14, j20);
        sparseArray.put(15, j21);
        sparseArray.put(16, j22);
        sparseArray.put(17, j23);
        sparseArray.put(-1, j24);
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) f8288b.clone();
    }
}
