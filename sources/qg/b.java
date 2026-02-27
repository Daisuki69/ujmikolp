package Qg;

import Bg.C0121s;
import Bj.E;
import bj.AbstractC1039j;
import com.google.gson.reflect.TypeToken;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import io.ktor.utils.io.n;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.j;
import xj.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f5370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Charset f5371b;
    public final /* synthetic */ f c;
    public final /* synthetic */ Wg.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar, Charset charset, f fVar, Wg.a aVar, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5370a = nVar;
        this.f5371b = charset;
        this.c = fVar;
        this.e = aVar;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new b(this.f5370a, this.f5371b, this.c, this.e, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        n nVar = this.f5370a;
        j.g(nVar, "<this>");
        InputStreamReader inputStreamReader = new InputStreamReader(new C0121s(nVar, 1), this.f5371b);
        com.google.gson.j jVar = this.c.f5378a;
        Wg.a aVar = this.e;
        j.g(aVar, "<this>");
        F f = aVar.f6434b;
        return jVar.d(inputStreamReader, TypeToken.get(f != null ? y.b(f, false) : X5.f.n(aVar.f6433a)));
    }
}
