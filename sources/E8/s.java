package E8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ s[] f1302a;

    static {
        s[] sVarArr = {new s("back_id", 0), new s("DRIVERS_LICENSE", 1), new s("EPHIL_ID", 2), new s("FOREIGN_PASSPORT", 3), new s("IBP_ID", 4), new s("not_id", 5), new s("others", 6), new s("PASSPORT", 7), new s("PH_NATIONAL_ID", 8), new s("PHILHEALTH_ID", 9), new s("POSTAL_ID", 10), new s("PRC_ID", 11), new s("SENIOR_CITIZEN_CARD", 12), new s("SSS_ID", 13), new s("TIN_ID", 14), new s("UMID", 15), new s("EPHIL_BACK", 16), new s("PHILSYS_BACK", 17), new s("PHILSYS_DIGITAL", 18), new s("DRIVERS_BACK", 19)};
        f1302a = sVarArr;
        v0.h(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f1302a.clone();
    }
}
