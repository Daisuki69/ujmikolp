package yc;

import android.view.View;
import android.view.ViewGroup;
import bj.AbstractC1039j;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import dOYHB6.tiZVw8.numX49;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1615i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yc.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C2519A extends AbstractC1615i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f21091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21092b;
    public int c;
    public int e;
    public /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f21093g;
    public final /* synthetic */ MayaUserProfileUpdateFragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2519A(ViewGroup viewGroup, MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f21093g = viewGroup;
        this.h = mayaUserProfileUpdateFragment;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        C2519A c2519a = new C2519A(this.f21093g, this.h, interfaceC1526a);
        c2519a.f = obj;
        return c2519a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C2519A) create((yj.k) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        yj.k kVar;
        int childCount;
        int i;
        int i4;
        int i6;
        yj.k kVar2;
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i10 = this.e;
        ViewGroup viewGroup = this.f21093g;
        if (i10 != 0) {
            if (i10 == 1) {
                childCount = this.c;
                i4 = this.f21092b;
                View view = this.f21091a;
                kVar = (yj.k) this.f;
                AbstractC1039j.b(obj);
                if (view instanceof ViewGroup) {
                    List list = MayaUserProfileUpdateFragment.f14261f0;
                    MayaUserProfileUpdateFragment mayaUserProfileUpdateFragment = this.h;
                    mayaUserProfileUpdateFragment.getClass();
                    C2519A c2519a = new C2519A((ViewGroup) view, mayaUserProfileUpdateFragment, null);
                    this.f = kVar;
                    this.f21091a = null;
                    this.f21092b = i4;
                    this.c = childCount;
                    this.e = 2;
                    kVar.getClass();
                    Object objC = kVar.c(yj.l.a(c2519a), this);
                    if (objC != enumC1578a) {
                        objC = Unit.f18162a;
                    }
                    if (objC == enumC1578a) {
                        return enumC1578a;
                    }
                    i6 = i4;
                    kVar2 = kVar;
                }
                i = i4 + 1;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(numX49.tnTj78("bt9bE"));
                }
                childCount = this.c;
                i6 = this.f21092b;
                kVar2 = (yj.k) this.f;
                AbstractC1039j.b(obj);
            }
            kVar = kVar2;
            i4 = i6;
            i = i4 + 1;
        } else {
            AbstractC1039j.b(obj);
            kVar = (yj.k) this.f;
            childCount = viewGroup.getChildCount();
            i = 0;
        }
        if (i >= childCount) {
            return Unit.f18162a;
        }
        View childAt = viewGroup.getChildAt(i);
        kotlin.jvm.internal.j.d(childAt);
        this.f = kVar;
        this.f21091a = childAt;
        this.f21092b = i;
        this.c = childCount;
        this.e = 1;
        kVar.b(this, childAt);
        return enumC1578a;
    }
}
