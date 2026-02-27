package Bg;

import M8.T2;
import Ng.C0496d;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.Serializable;
import java.nio.charset.Charset;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class J extends AbstractC1616j implements qj.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Kg.c f481b;
    public /* synthetic */ io.ktor.utils.io.n c;
    public /* synthetic */ Wg.a e;
    public final /* synthetic */ Charset f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(Charset charset, InterfaceC1526a interfaceC1526a) {
        super(5, interfaceC1526a);
        this.f = charset;
    }

    @Override // qj.p
    public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
        J j = new J(this.f, (InterfaceC1526a) serializable);
        j.f481b = (Kg.c) obj2;
        j.c = (io.ktor.utils.io.n) obj3;
        j.e = (Wg.a) obj4;
        return j.invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        Kg.c cVar;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f480a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            Kg.c cVar2 = this.f481b;
            io.ktor.utils.io.n nVar = this.c;
            if (!this.e.f6433a.equals(kotlin.jvm.internal.z.a(String.class))) {
                return null;
            }
            this.f481b = cVar2;
            this.c = null;
            this.f480a = 1;
            Object objD = T2.D(nVar, this);
            if (objD == enumC1578a) {
                return enumC1578a;
            }
            cVar = cVar2;
            obj = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = this.f481b;
            AbstractC1039j.b(obj);
        }
        Mj.i iVar = (Mj.i) obj;
        xg.b bVarB = cVar.b();
        ok.b bVar = L.f483a;
        C0496d c0496dG = S1.s.g(bVarB.d());
        Charset charsetB = c0496dG != null ? T2.b(c0496dG) : null;
        if (charsetB == null) {
            charsetB = this.f;
        }
        L.f483a.g("Reading response body for " + bVarB.c().getUrl() + " as String with charset " + charsetB);
        return Yg.a.c(iVar, charsetB, 2);
    }
}
