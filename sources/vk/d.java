package vk;

import qk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f20511b = null;

    public d(int i) {
        boolean z4 = true;
        if (i != 3 && i != 1) {
            z4 = false;
        }
        i.j("Illegal data type for TensorImage: Only FLOAT32 and UINT8 are accepted", z4);
        this.f20510a = i;
    }
}
