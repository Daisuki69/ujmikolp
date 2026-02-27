package B4;

import Bj.E;
import Bj.H;
import Bj.U;
import Cj.d;
import Gj.m;
import Ij.e;
import android.os.Build;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;
import pg.r;
import pg.t;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f344b;
    public final /* synthetic */ t c;
    public final /* synthetic */ c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, t tVar, c cVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f344b = rVar;
        this.c = tVar;
        this.e = cVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new b(this.f344b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f343a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            String str = this.f344b.f19112a;
            boolean zB = j.b(str, "getPlatformVersion");
            t tVar = this.c;
            if (zB) {
                tVar.success("Android " + Build.VERSION.RELEASE);
            } else if (j.b(str, "collect")) {
                e eVar = U.f603a;
                d dVar = m.f2024a;
                a aVar = new a(this.e, tVar, null);
                this.f343a = 1;
                if (H.C(aVar, dVar, this) == enumC1578a) {
                    return enumC1578a;
                }
            } else {
                tVar.notImplemented();
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        return Unit.f18162a;
    }
}
