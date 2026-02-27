package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1202p implements Q {
    static {
        if (C1195i.f10100a == null) {
            synchronized (C1195i.class) {
                try {
                    if (C1195i.f10100a == null) {
                        Class cls = AbstractC1194h.f10098a;
                        C1195i c1195i = null;
                        if (cls != null) {
                            try {
                                c1195i = (C1195i) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c1195i == null) {
                            c1195i = C1195i.f10101b;
                        }
                        C1195i.f10100a = c1195i;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
