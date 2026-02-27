package com.paymaya.common.utility;

import k2.v0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class V {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final V f10446b;
    public static final V c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final V f10447d;
    public static final V e;
    public static final V f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ V[] f10448g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y f10449a;

    static {
        V v7 = new V("P2P_SEND_MONEY", 0, Y.f10455a);
        f10446b = v7;
        V v8 = new V("P2P_BANK_TRANSFER", 1, Y.f10456b);
        c = v8;
        V v10 = new V("P2M_OFF_US", 2, Y.f10457d);
        f10447d = v10;
        V v11 = new V("P2M_ON_US", 3, Y.c);
        e = v11;
        V v12 = new V("P2B", 4, Y.e);
        f = v12;
        V[] vArr = {v7, v8, v10, v11, v12};
        f10448g = vArr;
        v0.h(vArr);
    }

    public V(String str, int i, Y y7) {
        this.f10449a = y7;
    }

    public static V valueOf(String str) {
        return (V) Enum.valueOf(V.class, str);
    }

    public static V[] values() {
        return (V[]) f10448g.clone();
    }
}
