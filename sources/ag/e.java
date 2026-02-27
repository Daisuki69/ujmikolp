package Ag;

import Bj.C0154m0;
import Bj.E;
import Bj.InterfaceC0156n0;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f284b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f284b = iVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new e(this.f284b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f283a;
        i iVar = this.f284b;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                CoroutineContext.Element element = iVar.f291g.get(C0154m0.f630a);
                kotlin.jvm.internal.j.d(element);
                this.f283a = 1;
                if (((InterfaceC0156n0) element).z(this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1039j.b(obj);
            }
            while (it.hasNext()) {
                OkHttpClient okHttpClient = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                okHttpClient.connectionPool().evictAll();
                okHttpClient.dispatcher().executorService().shutdown();
            }
            return Unit.f18162a;
        } finally {
            it = iVar.i.entrySet().iterator();
            while (it.hasNext()) {
                OkHttpClient okHttpClient2 = (OkHttpClient) ((Map.Entry) it.next()).getValue();
                okHttpClient2.connectionPool().evictAll();
                okHttpClient2.dispatcher().executorService().shutdown();
            }
        }
    }
}
