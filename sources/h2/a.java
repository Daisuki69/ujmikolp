package H2;

import x2.InterfaceC2456c;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements InterfaceC2456c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN_EVENT(0),
    MESSAGE_DELIVERED(1),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE_OPEN(2);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2073a;

    a(int i) {
        this.f2073a = i;
    }

    @Override // x2.InterfaceC2456c
    public final int getNumber() {
        return this.f2073a;
    }
}
