package com.google.protobuf;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;
import s.AbstractC2217b;

/* JADX INFO: loaded from: classes2.dex */
public final class T {
    public static final T c = new T();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f10066b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f10065a = new E();

    public final W a(Class cls) {
        W wM;
        Class cls2;
        Charset charset = AbstractC1207v.f10124a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f10066b;
        W w6 = (W) concurrentHashMap.get(cls);
        if (w6 != null) {
            return w6;
        }
        E e = this.f10065a;
        e.getClass();
        Class cls3 = X.f10072a;
        if (!AbstractC1203q.class.isAssignableFrom(cls) && (cls2 = X.f10072a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        V vMessageInfoFor = ((D) e.f10045a).messageInfoFor(cls);
        if ((vMessageInfoFor.f10071d & 2) == 2) {
            boolean zIsAssignableFrom = AbstractC1203q.class.isAssignableFrom(cls);
            AbstractC1187a abstractC1187a = vMessageInfoFor.f10069a;
            if (zIsAssignableFrom) {
                wM = new N(X.c, AbstractC1197k.f10104a, abstractC1187a);
            } else {
                e0 e0Var = X.f10073b;
                C1196j c1196j = AbstractC1197k.f10105b;
                if (c1196j == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                wM = new N(e0Var, c1196j, abstractC1187a);
            }
        } else if (AbstractC1203q.class.isAssignableFrom(cls)) {
            wM = AbstractC2217b.c(vMessageInfoFor.a()) != 1 ? M.m(vMessageInfoFor, P.f10064b, B.f10042b, X.c, AbstractC1197k.f10104a, J.f10054b) : M.m(vMessageInfoFor, P.f10064b, B.f10042b, X.c, null, J.f10054b);
        } else if (AbstractC2217b.c(vMessageInfoFor.a()) != 1) {
            O o8 = P.f10063a;
            C1211z c1211z = B.f10041a;
            e0 e0Var2 = X.f10073b;
            C1196j c1196j2 = AbstractC1197k.f10105b;
            if (c1196j2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            wM = M.m(vMessageInfoFor, o8, c1211z, e0Var2, c1196j2, J.f10053a);
        } else {
            wM = M.m(vMessageInfoFor, P.f10063a, B.f10041a, X.f10073b, null, J.f10053a);
        }
        W w8 = (W) concurrentHashMap.putIfAbsent(cls, wM);
        return w8 != null ? w8 : wM;
    }
}
