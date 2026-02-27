package x4;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public enum d implements InterfaceC2466c {
    f20911d("00", "^[a-zA-Z]{2}$", true),
    e("01", "^.{1,25}$", true),
    f("02", "^.{1,15}$", false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Pattern f20914b;
    public final boolean c;

    d(String str, String str2, boolean z4) {
        this.f20914b = null;
        this.f20913a = str;
        this.c = z4;
        this.f20914b = Pattern.compile(str2);
    }

    @Override // x4.InterfaceC2466c
    public final String getTag() {
        return this.f20913a;
    }

    @Override // x4.InterfaceC2466c
    public final boolean m() {
        return this.c;
    }

    @Override // x4.InterfaceC2466c
    public final Pattern r() {
        return this.f20914b;
    }
}
