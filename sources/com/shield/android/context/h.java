package com.shield.android.context;

import Bj.E;
import Bj.H;
import Bj.U;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.concurrent.ConcurrentMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: de, reason: collision with root package name */
    private final ConcurrentMap<String, Object> f15120de;

    public static final class a extends AbstractC1616j implements Function2<E, InterfaceC1526a<? super ConcurrentMap<String, Object>>, Object> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static long[] f15121d = {165531674, 46960423};
        private int bE;

        public a(InterfaceC1526a<? super a> interfaceC1526a) {
            super(((int) f15121d[0]) ^ 165531672, interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final InterfaceC1526a<Unit> create(Object obj, InterfaceC1526a<?> interfaceC1526a) {
            return h.this.new a(interfaceC1526a);
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((a) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            EnumC1578a enumC1578a = EnumC1578a.f17050a;
            int i = this.bE;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
                return obj;
            }
            AbstractC1039j.b(obj);
            h hVar = h.this;
            this.bE = ((int) f15121d[1]) ^ 46960422;
            Object objC = hVar.c(this);
            return objC == enumC1578a ? enumC1578a : objC;
        }
    }

    public h(ConcurrentMap<String, Object> concurrentMap) {
        if (concurrentMap == null) {
            throw new IllegalArgumentException(f("杙杴杦朷杽杤条杧朼杳東杫朸杻板朻杪杰杪杫朮").toString());
        }
        this.f15120de = concurrentMap;
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            int i4 = cCharAt + 26388;
            int i6 = cCharAt + 26389 + ((~cCharAt) | (-26389));
            sb2.append((char) ((i % 65535) ^ (i6 - (i4 - i6))));
            int i10 = i + 2 + ((~i) | (-2));
            i = ((i + 1) - i10) + i10;
        }
        return sb2.toString();
    }

    public final void a(ConcurrentMap<String, Object> concurrentMap) {
        kotlin.jvm.internal.j.g(concurrentMap, f("杹杴杦"));
        this.f15120de.putAll(concurrentMap);
    }

    public final ConcurrentMap<String, Object> aA() {
        return this.f15120de;
    }

    public final ConcurrentMap<String, Object> az() {
        Ij.e eVar = U.f603a;
        return (ConcurrentMap) H.x(Ij.d.f2362a, new a(null));
    }

    public abstract Object c(InterfaceC1526a<? super ConcurrentMap<String, Object>> interfaceC1526a);
}
