package xj;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ s[] f21015a;

    static {
        s[] sVarArr = {new s("PUBLIC", 0), new s("PROTECTED", 1), new s("INTERNAL", 2), new s("PRIVATE", 3)};
        f21015a = sVarArr;
        v0.h(sVarArr);
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f21015a.clone();
    }
}
