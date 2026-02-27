package S4;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import k2.v0;
import p3.C2011b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2011b f5666b;
    public static final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f5667d;
    public static final c e;
    public static final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f5668g;
    public static final c h;
    public static final c i;
    public static final /* synthetic */ c[] j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5669a;

    static {
        c cVar = new c("Contact", 0, 1);
        c = cVar;
        c cVar2 = new c("Calendar", 1, 2);
        f5667d = cVar2;
        c cVar3 = new c("Audio", 2, 3);
        e = cVar3;
        c cVar4 = new c("Video", 3, 4);
        f = cVar4;
        c cVar5 = new c("Photo", 4, 5);
        f5668g = cVar5;
        c cVar6 = new c("Camera", 5, 6);
        h = cVar6;
        c cVar7 = new c(RtspHeaders.LOCATION, 6, 7);
        i = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c("Media", 7, 8), new c("None", 8, 9)};
        j = cVarArr;
        v0.h(cVarArr);
        f5666b = new C2011b(14);
    }

    public c(String str, int i4, int i6) {
        this.f5669a = i6;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) j.clone();
    }
}
