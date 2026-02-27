package com.paymaya.common.utility;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f10414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f10415b;
    public static final G c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final G f10416d;
    public static final G e;
    public static final G f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final G f10417g;
    public static final G h;
    public static final /* synthetic */ G[] i;

    static {
        G g8 = new G("NOT_MATCH", 0);
        f10414a = g8;
        G g10 = new G("MISMATCH", 1);
        f10415b = g10;
        G g11 = new G("PHILSYS_CAPTURE_MISMATCH", 2);
        c = g11;
        G g12 = new G("PHILSYS_UPLOAD_MISMATCH", 3);
        f10416d = g12;
        G g13 = new G("UNPUBLISHED", 4);
        e = g13;
        G g14 = new G("HIGH_AUTO_DETECTED", 5);
        f = g14;
        G g15 = new G("HIGH", 6);
        f10417g = g15;
        G g16 = new G("LOW", 7);
        h = g16;
        i = new G[]{g8, g10, g11, g12, g13, g14, g15, g16};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) i.clone();
    }
}
