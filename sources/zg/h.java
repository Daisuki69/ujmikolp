package Zg;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.A;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f6954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, int i, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f6954a = iVar;
        this.f6955b = i;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new h(this.f6954a, this.f6955b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) throws IOException {
        i iVar;
        Mj.b bVar;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        long jL = 0;
        while (true) {
            iVar = this.f6954a;
            long jB = Yg.a.b(iVar.e);
            long j = this.f6955b;
            bVar = iVar.f6956b;
            if (jB >= j || jL < 0) {
                break;
            }
            try {
                jL = bVar.l(iVar.e, Long.MAX_VALUE);
            } catch (EOFException unused) {
                jL = -1;
            }
        }
        if (jL == -1) {
            bVar.close();
            iVar.f.h0();
            iVar.f6957d = new A(null);
        }
        return Unit.f18162a;
    }
}
