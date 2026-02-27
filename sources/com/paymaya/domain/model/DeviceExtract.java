package com.paymaya.domain.model;

import We.s;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class DeviceExtract {

    @InterfaceC1497a
    @InterfaceC1498b("dcrn")
    private final String dcrn;

    public DeviceExtract(String str) {
        this.dcrn = str;
    }

    public static /* synthetic */ DeviceExtract copy$default(DeviceExtract deviceExtract, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceExtract.dcrn;
        }
        return deviceExtract.copy(str);
    }

    public final String component1() {
        return this.dcrn;
    }

    public final DeviceExtract copy(String str) {
        return new DeviceExtract(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceExtract) && j.b(this.dcrn, ((DeviceExtract) obj).dcrn);
    }

    public final String getDcrn() {
        return this.dcrn;
    }

    public int hashCode() {
        String str = this.dcrn;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return s.j("DeviceExtract(dcrn=", this.dcrn, ")");
    }
}
