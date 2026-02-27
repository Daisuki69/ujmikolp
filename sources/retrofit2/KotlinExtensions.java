package retrofit2;

import Bj.C0151l;
import Bj.InterfaceC0147j;
import bj.AbstractC1039j;
import bj.C1037h;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import hj.h;
import ij.AbstractC1609c;
import ij.InterfaceC1611e;
import kotlin.KotlinNullPointerException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes5.dex */
public final class KotlinExtensions {

    /* JADX INFO: renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    @InterfaceC1611e(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    public static final class AnonymousClass1 extends AbstractC1609c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC1526a<? super AnonymousClass1> interfaceC1526a) {
            super(interfaceC1526a);
        }

        @Override // ij.AbstractC1607a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(final Call<T> call, InterfaceC1526a<? super T> interfaceC1526a) {
        final C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        c0151l.t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f18162a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t5) {
                j.g(call2, "call");
                j.g(t5, "t");
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(AbstractC1039j.a(t5));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                j.g(call2, "call");
                j.g(response, "response");
                if (!response.isSuccessful()) {
                    InterfaceC0147j interfaceC0147j = c0151l;
                    C1037h.a aVar = C1037h.f9166b;
                    interfaceC0147j.resumeWith(AbstractC1039j.a(new HttpException(response)));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    InterfaceC0147j interfaceC0147j2 = c0151l;
                    C1037h.a aVar2 = C1037h.f9166b;
                    interfaceC0147j2.resumeWith(tBody);
                    return;
                }
                Object objTag = call2.request().tag(Invocation.class);
                j.d(objTag);
                Invocation invocation = (Invocation) objTag;
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null");
                InterfaceC0147j interfaceC0147j3 = c0151l;
                C1037h.a aVar3 = C1037h.f9166b;
                interfaceC0147j3.resumeWith(AbstractC1039j.a(kotlinNullPointerException));
            }
        });
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static final <T> Object awaitNullable(final Call<T> call, InterfaceC1526a<? super T> interfaceC1526a) {
        final C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        c0151l.t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$4$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f18162a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t5) {
                j.g(call2, "call");
                j.g(t5, "t");
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(AbstractC1039j.a(t5));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                j.g(call2, "call");
                j.g(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC0147j interfaceC0147j = c0151l;
                    C1037h.a aVar = C1037h.f9166b;
                    interfaceC0147j.resumeWith(response.body());
                } else {
                    InterfaceC0147j interfaceC0147j2 = c0151l;
                    C1037h.a aVar2 = C1037h.f9166b;
                    interfaceC0147j2.resumeWith(AbstractC1039j.a(new HttpException(response)));
                }
            }
        });
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static final <T> Object awaitResponse(final Call<T> call, InterfaceC1526a<? super Response<T>> interfaceC1526a) {
        final C0151l c0151l = new C0151l(1, h.b(interfaceC1526a));
        c0151l.r();
        c0151l.t(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return Unit.f18162a;
            }

            public final void invoke(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t5) {
                j.g(call2, "call");
                j.g(t5, "t");
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(AbstractC1039j.a(t5));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                j.g(call2, "call");
                j.g(response, "response");
                InterfaceC0147j interfaceC0147j = c0151l;
                C1037h.a aVar = C1037h.f9166b;
                interfaceC0147j.resumeWith(response);
            }
        });
        Object objQ = c0151l.q();
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        return objQ;
    }

    public static final Object awaitUnit(Call<Unit> call, InterfaceC1526a<? super Unit> interfaceC1526a) {
        j.e(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, interfaceC1526a);
    }

    public static final <T> T create(Retrofit retrofit) {
        j.g(retrofit, "<this>");
        j.m();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable r4, gj.InterfaceC1526a<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            hj.a r1 = hj.EnumC1578a.f17050a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2b:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            bj.AbstractC1039j.b(r5)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L38:
            bj.AbstractC1039j.b(r5)
            r0.L$0 = r4
            r0.label = r3
            Ij.e r5 = Bj.U.f603a
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r3.<init>()
            r5.dispatch(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Throwable, gj.a):java.lang.Object");
    }
}
