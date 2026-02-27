package H2;

import x2.InterfaceC2456c;

/* JADX INFO: loaded from: classes2.dex */
public enum b implements InterfaceC2456c {
    /* JADX INFO: Fake field, exist only in values array */
    UNKNOWN(0),
    DATA_MESSAGE(1),
    /* JADX INFO: Fake field, exist only in values array */
    TOPIC(2),
    DISPLAY_NOTIFICATION(3);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2076a;

    b(int i) {
        this.f2076a = i;
    }

    @Override // x2.InterfaceC2456c
    public final int getNumber() {
        return this.f2076a;
    }
}
