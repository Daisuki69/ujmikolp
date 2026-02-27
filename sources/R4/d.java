package R4;

import Bj.C0151l;
import Bj.E;
import O4.k;
import Q6.n;
import android.location.Location;
import bj.AbstractC1039j;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FusedLocationProviderClient f5460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FusedLocationProviderClient fusedLocationProviderClient, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f5460b = fusedLocationProviderClient;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new d(this.f5460b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f5459a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
            return obj;
        }
        AbstractC1039j.b(obj);
        FusedLocationProviderClient fusedLocationProviderClient = this.f5460b;
        this.f5459a = 1;
        C0151l c0151l = new C0151l(1, hj.h.b(this));
        c0151l.r();
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        Task<Location> currentLocation = fusedLocationProviderClient.getCurrentLocation(100, cancellationTokenSource.getToken());
        kotlin.jvm.internal.j.f(currentLocation, "fusedLocationProviderCli…ken\n                    )");
        currentLocation.addOnSuccessListener(new i(new k(c0151l, 1), 0)).addOnFailureListener(new n(c0151l, 3));
        c0151l.t(new k(cancellationTokenSource, 2));
        Object objQ = c0151l.q();
        return objQ == enumC1578a ? enumC1578a : objQ;
    }
}
