package Fg;

import Bj.E;
import M8.T2;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class l extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Charset f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1618b;
    public final /* synthetic */ io.ktor.utils.io.k c;
    public final /* synthetic */ Charset e;
    public final /* synthetic */ StringBuilder f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f1619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(io.ktor.utils.io.k kVar, Charset charset, StringBuilder sb2, d dVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = kVar;
        this.e = charset;
        this.f = sb2;
        this.f1619g = dVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new l(this.c, this.e, this.f, this.f1619g, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        String strC;
        Charset charset;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f1618b;
        d dVar = this.f1619g;
        StringBuilder sb2 = this.f;
        try {
            if (i == 0) {
                AbstractC1039j.b(obj);
                try {
                    io.ktor.utils.io.k kVar = this.c;
                    Charset charset2 = this.e;
                    this.f1617a = charset2;
                    this.f1618b = 1;
                    obj = T2.D(kVar, this);
                    if (obj == enumC1578a) {
                        return enumC1578a;
                    }
                    charset = charset2;
                } catch (Throwable th2) {
                    String string = sb2.toString();
                    kotlin.jvm.internal.j.f(string, "toString(...)");
                    dVar.c(string);
                    dVar.a();
                    throw th2;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                charset = this.f1617a;
                AbstractC1039j.b(obj);
            }
            strC = Yg.a.c((Mj.i) obj, charset, 2);
        } catch (Throwable unused) {
            strC = null;
        }
        if (strC == null) {
            strC = "[request body omitted]";
        }
        sb2.append("BODY START");
        sb2.append('\n');
        sb2.append(strC);
        sb2.append('\n');
        sb2.append("BODY END");
        String string2 = sb2.toString();
        kotlin.jvm.internal.j.f(string2, "toString(...)");
        dVar.c(string2);
        dVar.a();
        return Unit.f18162a;
    }
}
