package a5;

import Bj.E;
import android.content.Context;
import bj.AbstractC1039j;
import com.google.android.gms.ads.MobileAds;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: a5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0630b extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f6996a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0630b(Context context, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f6996a = context;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0630b(this.f6996a, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0630b) create((E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        AbstractC1039j.b(obj);
        MobileAds.initialize(this.f6996a, new C0629a());
        return Unit.f18162a;
    }
}
