package W0;

import k2.v0;
import kotlin.NoWhenBranchMatchedException;
import p3.C2011b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2011b f6178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d f6179b;
    public static final d c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f6180d;
    public static final d e;
    public static final /* synthetic */ d[] f;

    static {
        d dVar = new d("PHONES", 0);
        f6179b = dVar;
        d dVar2 = new d("EMAILS", 1);
        c = dVar2;
        d dVar3 = new d("STRUCTURED_NAME", 2);
        f6180d = dVar3;
        d dVar4 = new d("ORGANIZATION", 3);
        e = dVar4;
        d[] dVarArr = {dVar, dVar2, dVar3, dVar4};
        f = dVarArr;
        v0.h(dVarArr);
        f6178a = new C2011b(16);
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f.clone();
    }

    public final String[] a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return new String[]{"vnd.android.cursor.item/phone_v2"};
        }
        if (iOrdinal == 1) {
            return new String[]{"vnd.android.cursor.item/email_v2"};
        }
        if (iOrdinal == 2) {
            return new String[]{"vnd.android.cursor.item/name"};
        }
        if (iOrdinal == 3) {
            return new String[]{"vnd.android.cursor.item/organization"};
        }
        throw new NoWhenBranchMatchedException();
    }
}
