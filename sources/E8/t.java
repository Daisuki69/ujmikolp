package E8;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ t[] f1303a;

    static {
        t[] tVarArr = {new t("BRIGHT", 0), new t("CROPPED", 1), new t("DAMAGED_ID", 2), new t("DARK", 3), new t("GOOD_QUALITY", 4), new t("MORE_THAN_ONE", 5), new t("NO_FACE", 6), new t("NOT_FLAT", 7), new t("NOT_LIVE", 8), new t("PAPER", 9), new t("SHADOWS", 10), new t("TAMPERED_ID", 11)};
        f1303a = tVarArr;
        v0.h(tVarArr);
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f1303a.clone();
    }
}
