package n5;

import Bj.E;
import gj.InterfaceC1526a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: n5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1927d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1928e f18620b;
    public final /* synthetic */ String c;
    public final /* synthetic */ s5.f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1927d(C1928e c1928e, String str, s5.f fVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f18620b = c1928e;
        this.c = str;
        this.e = fVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C1927d(this.f18620b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1927d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r13 == r0) goto L15;
     */
    @Override // ij.AbstractC1607a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            hj.a r0 = hj.EnumC1578a.f17050a
            int r1 = r12.f18619a
            java.lang.String r3 = r12.c
            r2 = 2
            r4 = 1
            n5.e r11 = r12.f18620b
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r2) goto L14
            bj.AbstractC1039j.b(r13)
            goto L5b
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            bj.AbstractC1039j.b(r13)
            goto L2e
        L20:
            bj.AbstractC1039j.b(r13)
            s5.l r13 = r11.f18622b
            r12.f18619a = r4
            java.lang.Object r13 = s5.l.a(r12)
            if (r13 != r0) goto L2e
            goto L5a
        L2e:
            java.util.Map r13 = (java.util.Map) r13
            X4.a r1 = r11.f18621a
            r12.f18619a = r2
            Y4.d r1 = r1.f6527a
            r1.getClass()
            b5.h r2 = new b5.h
            java.lang.String r7 = ""
            r9 = 0
            r4 = 0
            s5.f r5 = r12.e
            r6 = 0
            r10 = 0
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            C7.f r7 = new C7.f
            r4 = 11
            r7.<init>(r3, r5, r4)
            java.lang.String r4 = "12462736"
            r8 = r12
            r5 = r13
            r6 = r2
            r2 = r1
            java.lang.Object r13 = r2.b(r3, r4, r5, r6, r7, r8)
            if (r13 != r0) goto L5b
        L5a:
            return r0
        L5b:
            b5.g r13 = (b5.AbstractC0915g) r13
            boolean r0 = r13 instanceof b5.C0914f
            if (r0 == 0) goto L7b
            b5.f r13 = (b5.C0914f) r13
            com.google.android.gms.ads.nativead.NativeCustomFormatAd r0 = r13.f8524a
            r11.f18624g = r0
            androidx.lifecycle.MutableLiveData r1 = r11.f18623d
            n5.a r2 = new n5.a
            b5.c r13 = r13.f8525b
            java.lang.String r3 = "null cannot be cast to non-null type com.paymaya.adkit.model.InterstitialAdVariables"
            kotlin.jvm.internal.j.e(r13, r3)
            b5.h r13 = (b5.C0916h) r13
            r2.<init>(r0, r13)
            r1.postValue(r2)
            goto L91
        L7b:
            boolean r0 = r13 instanceof b5.C0913e
            if (r0 == 0) goto L94
            androidx.lifecycle.MutableLiveData r0 = r11.f18623d
            n5.b r1 = new n5.b
            b5.e r13 = (b5.C0913e) r13
            b5.a r2 = r13.f8522a
            b5.c r13 = r13.f8523b
            b5.h r13 = (b5.C0916h) r13
            r1.<init>(r3, r2, r13)
            r0.postValue(r1)
        L91:
            kotlin.Unit r13 = kotlin.Unit.f18162a
            return r13
        L94:
            kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.C1927d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
