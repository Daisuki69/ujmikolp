package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1200n implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1200n f10112b = new C1200n(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10113a;

    public /* synthetic */ C1200n(int i) {
        this.f10113a = i;
    }

    @Override // com.google.protobuf.K
    public final boolean isSupported(Class cls) {
        switch (this.f10113a) {
            case 0:
                return AbstractC1203q.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }

    @Override // com.google.protobuf.K
    public final V messageInfoFor(Class cls) {
        switch (this.f10113a) {
            case 0:
                if (!AbstractC1203q.class.isAssignableFrom(cls)) {
                    throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
                }
                try {
                    return (V) AbstractC1203q.l(cls.asSubclass(AbstractC1203q.class)).k(3);
                } catch (Exception e) {
                    throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
                }
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }
}
