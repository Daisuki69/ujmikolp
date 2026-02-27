package ba;

import L9.C0323a;
import android.content.Intent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaBillersCategoryFragment;
import dOYHB6.tiZVw8.numX49;
import ga.InterfaceC1514a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ba.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0936g implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323a f8583b;

    public /* synthetic */ C0936g(C0323a c0323a, int i) {
        this.f8582a = i;
        this.f8583b = c0323a;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        Intent intent;
        switch (this.f8582a) {
            case 0:
                List list = (List) obj;
                C0323a c0323a = this.f8583b;
                List listY = list != null ? C1110A.y(list) : C1112C.f9377a;
                c0323a.getClass();
                kotlin.jvm.internal.j.g(listY, numX49.tnTj78("bucLd"));
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).f13363O0 = false;
                boolean zIsEmpty = listY.isEmpty();
                String strTnTj78 = numX49.tnTj78("bucLi");
                if (zIsEmpty) {
                    ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).Z1();
                    ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).R1();
                    LinearLayout linearLayout = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).f13369v0;
                    if (linearLayout == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLE"));
                        throw null;
                    }
                    linearLayout.setVisibility(0);
                    TextView textView = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).w0;
                    if (textView == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    textView.setVisibility(0);
                    ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).S1();
                } else {
                    MayaBillersCategoryFragment mayaBillersCategoryFragment = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get());
                    mayaBillersCategoryFragment.getClass();
                    ea.k kVar = mayaBillersCategoryFragment.f13362M0;
                    if (kVar == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLt"));
                        throw null;
                    }
                    kVar.submitList(listY);
                    RecyclerView recyclerView = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).u0;
                    if (recyclerView == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLQ"));
                        throw null;
                    }
                    recyclerView.setVisibility(0);
                    ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).Q1();
                    TextView textView2 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).w0;
                    if (textView2 == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    textView2.setVisibility(0);
                    TextView textView3 = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).t0;
                    if (textView3 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLO"));
                        throw null;
                    }
                    textView3.setVisibility(0);
                }
                LinearLayoutCompat linearLayoutCompat = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).f13370x0;
                if (linearLayoutCompat == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLH"));
                    throw null;
                }
                linearLayoutCompat.setVisibility(8);
                ConstraintLayout constraintLayout = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a.c.get())).f13371z0;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLF"));
                    throw null;
                }
            default:
                List list2 = (List) obj;
                kotlin.jvm.internal.j.g(list2, numX49.tnTj78("bucLS"));
                C0323a c0323a2 = this.f8583b;
                c0323a2.getClass();
                ArrayList arrayListY = C1110A.y(list2);
                ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).L1();
                MayaBillersCategoryFragment mayaBillersCategoryFragment2 = (MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get());
                mayaBillersCategoryFragment2.getClass();
                ea.j jVar = mayaBillersCategoryFragment2.f13361L0;
                String dataString = null;
                if (jVar == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLj"));
                    throw null;
                }
                jVar.submitList(arrayListY);
                FragmentActivity activity = ((MayaBillersCategoryFragment) ((InterfaceC1514a) c0323a2.c.get())).getActivity();
                if (activity != null && (intent = activity.getIntent()) != null) {
                    dataString = intent.getDataString();
                }
                c0323a2.p(dataString, arrayListY);
                return;
        }
    }
}
