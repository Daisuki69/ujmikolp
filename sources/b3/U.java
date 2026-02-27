package b3;

import com.dynatrace.android.agent.Global;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f8412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f8413b;

    public U(i0 timeProvider, k0 uuidGenerator) {
        kotlin.jvm.internal.j.g(timeProvider, "timeProvider");
        kotlin.jvm.internal.j.g(uuidGenerator, "uuidGenerator");
        this.f8412a = timeProvider;
        this.f8413b = uuidGenerator;
    }

    public final C0872L a(C0872L c0872l) {
        String str;
        this.f8413b.getClass();
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.j.f(uuidRandomUUID, "randomUUID(...)");
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        String lowerCase = zj.z.t(string, Global.HYPHEN, "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        return new C0872L(((j0) this.f8412a).a().f8466b, lowerCase, (c0872l == null || (str = c0872l.f8394b) == null) ? lowerCase : str, c0872l != null ? c0872l.c + 1 : 0);
    }
}
