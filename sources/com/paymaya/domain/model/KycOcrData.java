package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class KycOcrData {

    @InterfaceC1497a
    @InterfaceC1498b("expiry")
    private final String expiry;

    @InterfaceC1497a
    @InterfaceC1498b("number")
    private final String number;

    /* JADX WARN: Multi-variable type inference failed */
    public KycOcrData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KycOcrData copy$default(KycOcrData kycOcrData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycOcrData.number;
        }
        if ((i & 2) != 0) {
            str2 = kycOcrData.expiry;
        }
        return kycOcrData.copy(str, str2);
    }

    public final String component1() {
        return this.number;
    }

    public final String component2() {
        return this.expiry;
    }

    public final KycOcrData copy(String str, String str2) {
        return new KycOcrData(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycOcrData)) {
            return false;
        }
        KycOcrData kycOcrData = (KycOcrData) obj;
        return j.b(this.number, kycOcrData.number) && j.b(this.expiry, kycOcrData.expiry);
    }

    public final String getExpiry() {
        return this.expiry;
    }

    public final String getNumber() {
        return this.number;
    }

    public int hashCode() {
        String str = this.number;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expiry;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return s.l("KycOcrData(number=", this.number, ", expiry=", this.expiry, ")");
    }

    public KycOcrData(String str, String str2) {
        this.number = str;
        this.expiry = str2;
    }

    public /* synthetic */ KycOcrData(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
