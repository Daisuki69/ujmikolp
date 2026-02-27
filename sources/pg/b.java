package Pg;

import Ej.C0233k;
import Ej.InterfaceC0230h;
import Ej.InterfaceC0231i;
import Fj.l;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import io.ktor.utils.io.n;
import java.nio.charset.Charset;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements InterfaceC0230h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0233k f5167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Charset f5168b;
    public final /* synthetic */ Wg.a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f5169d;

    public b(C0233k c0233k, Charset charset, Wg.a aVar, n nVar) {
        this.f5167a = c0233k;
        this.f5168b = charset;
        this.c = aVar;
        this.f5169d = nVar;
    }

    @Override // Ej.InterfaceC0230h
    public final Object collect(InterfaceC0231i interfaceC0231i, InterfaceC1526a interfaceC1526a) throws Throwable {
        Object objCollect = this.f5167a.collect(new l(interfaceC0231i, this.f5168b, this.c, this.f5169d), interfaceC1526a);
        return objCollect == EnumC1578a.f17050a ? objCollect : Unit.f18162a;
    }
}
