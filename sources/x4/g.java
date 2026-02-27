package x4;

import java.util.regex.Pattern;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements InterfaceC2466c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g[] f20929b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Pattern f20930a;

    /* JADX INFO: Fake field, exist only in values array */
    g EF1;

    static {
        g gVar = new g("TAG_00_GLOBALLY_UNIQUE_IDENTIFIER", 0);
        gVar.f20930a = null;
        gVar.f20930a = Pattern.compile("^[a-zA-Z0-9!@#$&()\\\\-`.+,/\\\"]{1,32}$");
        f20929b = new g[]{gVar};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f20929b.clone();
    }

    @Override // x4.InterfaceC2466c
    public final String getTag() {
        return "00";
    }

    @Override // x4.InterfaceC2466c
    public final boolean m() {
        return true;
    }

    @Override // x4.InterfaceC2466c
    public final Pattern r() {
        return this.f20930a;
    }
}
