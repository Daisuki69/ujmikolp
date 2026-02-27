package vh;

import ch.r;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h[] f20507b;

    static {
        h hVar = new h("COMPLETE", 0);
        f20506a = hVar;
        f20507b = new h[]{hVar};
    }

    public static boolean a(r rVar, Object obj) {
        if (obj == f20506a) {
            rVar.onComplete();
            return true;
        }
        if (obj instanceof C2356g) {
            rVar.onError(((C2356g) obj).f20505a);
            return true;
        }
        if (obj instanceof C2355f) {
            rVar.onSubscribe(((C2355f) obj).f20504a);
            return false;
        }
        rVar.onNext(obj);
        return false;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f20507b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
