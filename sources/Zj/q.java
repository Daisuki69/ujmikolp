package zj;

import k2.v0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f21494b;
    public static final /* synthetic */ q[] c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21495a;

    static {
        q qVar = new q("IGNORE_CASE", 0, 2, 0, 2, null);
        f21494b = qVar;
        q[] qVarArr = {qVar, new q("MULTILINE", 1, 8, 0, 2, null), new q("LITERAL", 2, 16, 0, 2, null), new q("UNIX_LINES", 3, 1, 0, 2, null), new q("COMMENTS", 4, 4, 0, 2, null), new q("DOT_MATCHES_ALL", 5, 32, 0, 2, null), new q("CANON_EQ", 6, 128, 0, 2, null)};
        c = qVarArr;
        v0.h(qVarArr);
    }

    public q(String str, int i, int i4, int i6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this.f21495a = i4;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) c.clone();
    }
}
