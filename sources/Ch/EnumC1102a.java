package ch;

import dOYHB6.tiZVw8.numX49;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ch.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC1102a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC1102a f9365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC1102a[] f9366b;

    static {
        EnumC1102a enumC1102a = new EnumC1102a(numX49.tnTj78("bt8k"), 0);
        f9365a = enumC1102a;
        f9366b = new EnumC1102a[]{enumC1102a, new EnumC1102a(numX49.tnTj78("bt8B"), 1), new EnumC1102a(numX49.tnTj78("bt8u"), 2), new EnumC1102a(numX49.tnTj78("bt8V"), 3), new EnumC1102a(numX49.tnTj78("bt8S"), 4)};
    }

    public static EnumC1102a valueOf(String str) {
        return (EnumC1102a) Enum.valueOf(EnumC1102a.class, str);
    }

    public static EnumC1102a[] values() {
        return (EnumC1102a[]) f9366b.clone();
    }
}
