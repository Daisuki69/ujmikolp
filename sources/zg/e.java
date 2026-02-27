package Zg;

import Bj.E;
import bj.AbstractC1039j;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.w;
import io.ktor.utils.io.z;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6950b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(w wVar, byte[] bArr, int i, int i4, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f6950b = wVar;
        this.c = bArr;
        this.e = i;
        this.f = i4;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new e(this.f6950b, this.c, this.e, this.f, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f6949a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            int i4 = this.e;
            int i6 = this.f + i4;
            this.f6949a = 1;
            if (z.c(this.f6950b, this.c, i4, i6, this) == enumC1578a) {
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
