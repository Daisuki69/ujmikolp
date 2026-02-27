package io.split.android.client.network;

import g3.InterfaceC1498b;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @InterfaceC1498b("pin")
    private final byte[] f17570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @InterfaceC1498b("algo")
    private final String f17571b;

    public final String a() {
        return this.f17571b;
    }

    public final byte[] b() {
        return this.f17570a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (Arrays.equals(this.f17570a, aVar.f17570a) && Objects.equals(this.f17571b, aVar.f17571b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17570a) + (Objects.hash(this.f17571b) * 31);
    }
}
