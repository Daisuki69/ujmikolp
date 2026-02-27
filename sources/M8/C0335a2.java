package M8;

import N5.C0473p0;
import android.widget.FrameLayout;
import androidx.navigation.ViewKt;
import bj.AbstractC1039j;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSimpleCaptureV3Fragment;
import gj.InterfaceC1526a;
import hj.EnumC1578a;
import ij.AbstractC1616j;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: M8.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0335a2 extends AbstractC1616j implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MayaKycSimpleCaptureV3Fragment f3266b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0335a2(MayaKycSimpleCaptureV3Fragment mayaKycSimpleCaptureV3Fragment, InterfaceC1526a interfaceC1526a) {
        super(2, interfaceC1526a);
        this.f3266b = mayaKycSimpleCaptureV3Fragment;
    }

    @Override // ij.AbstractC1607a
    public final InterfaceC1526a create(Object obj, InterfaceC1526a interfaceC1526a) {
        return new C0335a2(this.f3266b, interfaceC1526a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C0335a2) create((Bj.E) obj, (InterfaceC1526a) obj2)).invokeSuspend(Unit.f18162a);
    }

    @Override // ij.AbstractC1607a
    public final Object invokeSuspend(Object obj) {
        EnumC1578a enumC1578a = EnumC1578a.f17050a;
        int i = this.f3265a;
        if (i == 0) {
            AbstractC1039j.b(obj);
            this.f3265a = 1;
            if (Bj.O.b(400L, this) == enumC1578a) {
                return enumC1578a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1039j.b(obj);
        }
        List list = MayaKycSimpleCaptureV3Fragment.f12596h0;
        FrameLayout frameLayout = ((C0473p0) this.f3266b.G1()).f4176a;
        kotlin.jvm.internal.j.f(frameLayout, "getRoot(...)");
        ViewKt.findNavController(frameLayout).popBackStack();
        return Unit.f18162a;
    }
}
