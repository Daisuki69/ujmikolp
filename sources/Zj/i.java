package zj;

/* JADX INFO: loaded from: classes11.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f21478d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f21480b;
    public final h c;

    static {
        g gVar = g.f21475a;
        h hVar = h.f21476b;
        f21478d = new i(false, gVar, hVar);
        new i(true, gVar, hVar);
    }

    public i(boolean z4, g bytes, h number) {
        kotlin.jvm.internal.j.g(bytes, "bytes");
        kotlin.jvm.internal.j.g(number, "number");
        this.f21479a = z4;
        this.f21480b = bytes;
        this.c = number;
    }

    public final String toString() {
        StringBuilder sbW = androidx.camera.core.impl.a.w("HexFormat(\n    upperCase = ");
        sbW.append(this.f21479a);
        sbW.append(",\n    bytes = BytesHexFormat(\n");
        this.f21480b.a(sbW, "        ");
        sbW.append('\n');
        sbW.append("    ),");
        sbW.append('\n');
        sbW.append("    number = NumberHexFormat(");
        sbW.append('\n');
        this.c.a(sbW, "        ");
        sbW.append('\n');
        sbW.append("    )");
        sbW.append('\n');
        sbW.append(")");
        return sbW.toString();
    }
}
