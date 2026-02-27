package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class EncryptedUserIdentifier {

    @InterfaceC1497a
    @InterfaceC1498b("encryptedUserIdentifier")
    private final String mEncryptedUserIdentifier;

    public EncryptedUserIdentifier(String mEncryptedUserIdentifier) {
        j.g(mEncryptedUserIdentifier, "mEncryptedUserIdentifier");
        this.mEncryptedUserIdentifier = mEncryptedUserIdentifier;
    }

    public static /* synthetic */ EncryptedUserIdentifier copy$default(EncryptedUserIdentifier encryptedUserIdentifier, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = encryptedUserIdentifier.mEncryptedUserIdentifier;
        }
        return encryptedUserIdentifier.copy(str);
    }

    public final String component1() {
        return this.mEncryptedUserIdentifier;
    }

    public final EncryptedUserIdentifier copy(String mEncryptedUserIdentifier) {
        j.g(mEncryptedUserIdentifier, "mEncryptedUserIdentifier");
        return new EncryptedUserIdentifier(mEncryptedUserIdentifier);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EncryptedUserIdentifier) && j.b(this.mEncryptedUserIdentifier, ((EncryptedUserIdentifier) obj).mEncryptedUserIdentifier);
    }

    public final String getMEncryptedUserIdentifier() {
        return this.mEncryptedUserIdentifier;
    }

    public int hashCode() {
        return this.mEncryptedUserIdentifier.hashCode();
    }

    public String toString() {
        return s.j("EncryptedUserIdentifier(mEncryptedUserIdentifier=", this.mEncryptedUserIdentifier, ")");
    }
}
