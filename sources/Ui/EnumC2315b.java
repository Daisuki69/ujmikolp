package ui;

import dOYHB6.tiZVw8.numX49;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: ui.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC2315b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumC2315b f20322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumC2315b f20323b;
    public static final EnumC2315b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ EnumC2315b[] f20324d;

    static {
        EnumC2315b enumC2315b = new EnumC2315b(numX49.tnTj78("bHPP"), 0);
        f20322a = enumC2315b;
        EnumC2315b enumC2315b2 = new EnumC2315b(numX49.tnTj78("bHPb"), 1);
        f20323b = enumC2315b2;
        EnumC2315b enumC2315b3 = new EnumC2315b(numX49.tnTj78("bHP2"), 2);
        c = enumC2315b3;
        f20324d = new EnumC2315b[]{enumC2315b, enumC2315b2, enumC2315b3};
    }

    public static EnumC2315b valueOf(String str) {
        return (EnumC2315b) Enum.valueOf(EnumC2315b.class, str);
    }

    public static EnumC2315b[] values() {
        return (EnumC2315b[]) f20324d.clone();
    }
}
