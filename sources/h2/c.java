package H2;

import x2.InterfaceC2456c;

/* JADX INFO: loaded from: classes2.dex */
public enum c implements InterfaceC2456c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_OS(0),
    ANDROID(1),
    /* JADX INFO: Fake field, exist only in values array */
    IOS(2),
    /* JADX INFO: Fake field, exist only in values array */
    WEB(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2078a;

    c(int i) {
        this.f2078a = i;
    }

    @Override // x2.InterfaceC2456c
    public final int getNumber() {
        return this.f2078a;
    }
}
