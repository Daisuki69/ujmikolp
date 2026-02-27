package Qh;

import java.util.ArrayList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class b implements Ch.h, Ch.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ b[] f5383b;

    static {
        b bVar = new b("INSTANCE", 0);
        f5382a = bVar;
        f5383b = new b[]{bVar};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f5383b.clone();
    }

    @Override // Ch.f
    public final Object apply(Object obj) {
        return new ArrayList();
    }

    @Override // Ch.h
    public final Object get() {
        return new ArrayList();
    }
}
