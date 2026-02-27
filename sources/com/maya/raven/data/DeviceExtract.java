package com.maya.raven.data;

import androidx.camera.core.impl.a;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
public final class DeviceExtract {

    @InterfaceC1497a
    @InterfaceC1498b("dcrn")
    private final String dcrn;

    public DeviceExtract(String dcrn) {
        j.g(dcrn, "dcrn");
        this.dcrn = dcrn;
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

    public final DeviceExtract copy(String dcrn) {
        j.g(dcrn, "dcrn");
        return new DeviceExtract(dcrn);
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
        return this.dcrn.hashCode();
    }

    public String toString() {
        return a.n(new StringBuilder("DeviceExtract(dcrn="), this.dcrn, ')');
    }
}
