package jh;

import java.util.HashSet;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: jh.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1683b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1683b f17810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1683b[] f17811b;

    static {
        EnumC1683b enumC1683b = new EnumC1683b("INSTANCE", 0);
        f17810a = enumC1683b;
        f17811b = new EnumC1683b[]{enumC1683b};
    }

    public static EnumC1683b valueOf(String str) {
        return (EnumC1683b) Enum.valueOf(EnumC1683b.class, str);
    }

    public static EnumC1683b[] values() {
        return (EnumC1683b[]) f17811b.clone();
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new HashSet();
    }
}
