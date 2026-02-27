package f1;

import x2.InterfaceC2456c;

/* JADX INFO: renamed from: f1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1457c implements InterfaceC2456c {
    REASON_UNKNOWN(0),
    MESSAGE_TOO_OLD(1),
    CACHE_FULL(2),
    PAYLOAD_TOO_BIG(3),
    MAX_RETRIES_REACHED(4),
    INVALID_PAYLOD(5),
    SERVER_ERROR(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16694a;

    EnumC1457c(int i4) {
        this.f16694a = i4;
    }

    @Override // x2.InterfaceC2456c
    public final int getNumber() {
        return this.f16694a;
    }
}
