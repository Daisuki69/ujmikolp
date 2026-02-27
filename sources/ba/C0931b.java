package ba;

import L9.C0323a;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.paybills.view.activity.impl.MayaPayBillsActivity;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ga.InterfaceC1514a;
import ha.InterfaceC1549b;

/* JADX INFO: renamed from: ba.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0931b implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8573b;

    public /* synthetic */ C0931b(C0323a c0323a, int i) {
        this.f8572a = i;
        this.f8573b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        switch (this.f8572a) {
            case 0:
                BillerTransaction billerTransaction = (BillerTransaction) obj;
                kotlin.jvm.internal.j.g(billerTransaction, numX49.tnTj78("bucY"));
                C0323a c0323a = this.f8573b;
                c0323a.getClass();
                InterfaceC1549b interfaceC1549b = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).f13360K0;
                if (interfaceC1549b != null) {
                    ((MayaPayBillsActivity) interfaceC1549b).g2(billerTransaction, null);
                    return;
                }
                return;
            default:
                Throwable th2 = (Throwable) obj;
                kotlin.jvm.internal.j.g(th2, numX49.tnTj78("bucG"));
                PayMayaError payMayaErrorF = this.f8573b.f(th2, true);
                C0323a c0323a2 = this.f8573b;
                int iMErrorCode = payMayaErrorF.mErrorCode();
                String strMSpiel = payMayaErrorF.mSpiel();
                kotlin.jvm.internal.j.f(strMSpiel, numX49.tnTj78("buc3"));
                c0323a2.u(iMErrorCode, strMSpiel, numX49.tnTj78("bucy"));
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).f13363O0 = false;
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).Z1();
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).R1();
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).Q1();
                TextView textView = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).w0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucA"));
                    throw null;
                }
                textView.setVisibility(8);
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).S1();
                LinearLayoutCompat linearLayoutCompat = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).y0;
                if (linearLayoutCompat == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("buc7"));
                    throw null;
                }
                linearLayoutCompat.setVisibility(0);
                ConstraintLayout constraintLayout = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).f13371z0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucv"));
                    throw null;
                }
        }
    }
}
