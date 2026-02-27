package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public K[] f10043a;

    @Override // com.google.protobuf.K
    public final boolean isSupported(Class cls) {
        for (K k8 : this.f10043a) {
            if (k8.isSupported(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.protobuf.K
    public final V messageInfoFor(Class cls) {
        for (K k8 : this.f10043a) {
            if (k8.isSupported(cls)) {
                return k8.messageInfoFor(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
