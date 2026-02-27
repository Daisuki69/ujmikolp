package Oi;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f4832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f4833b;
    public static final /* synthetic */ c[] c;

    static {
        c cVar = new c("EVENTS_QUEUED", 0);
        f4832a = cVar;
        c cVar2 = new c("EVENTS_DROPPED", 1);
        f4833b = cVar2;
        c = new c[]{cVar, cVar2};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) c.clone();
    }
}
