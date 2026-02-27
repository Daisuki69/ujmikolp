package Qg;

import Ej.InterfaceC0230h;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f5373b;
    public final /* synthetic */ Charset c;
    public final /* synthetic */ f e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Charset charset, f fVar, Object obj, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.c = charset;
        this.e = fVar;
        this.f = obj;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        c cVar = new c(this.c, this.e, this.f, interfaceC1526a);
        cVar.f5373b = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((OutputStream) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f5372a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream) this.f5373b, this.c);
            Object obj2 = this.f;
            j.e(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<*>");
            this.f5372a = 1;
            if (f.a(this.e, (InterfaceC0230h) obj2, outputStreamWriter, this) == enumC1578a) {
                return enumC1578a;
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
