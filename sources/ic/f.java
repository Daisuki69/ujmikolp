package Ic;

import N5.C1;
import We.A;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.Voucher;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f2289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V2.c f2290b;
    public final Ac.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Voucher f2291d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1 c12, A picasso, Ac.c cVar) {
        super(c12.f3571b);
        j.g(picasso, "picasso");
        this.f2289a = c12;
        this.f2290b = new V2.c(this, 15);
        this.c = cVar;
        final int i = 0;
        c12.f3574k.setOnClickListener(new View.OnClickListener(this) { // from class: Ic.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f2288b;

            {
                this.f2288b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        f fVar = this.f2288b;
                        Callback.onClick_enter(view);
                        try {
                            fVar.c.f(fVar.f2291d);
                            return;
                        } finally {
                        }
                    default:
                        f fVar2 = this.f2288b;
                        Callback.onClick_enter(view);
                        try {
                            V2.c cVar2 = fVar2.f2290b;
                            Voucher voucher = fVar2.f2291d;
                            cVar2.getClass();
                            String strMExternalPartnerCode = voucher != null ? voucher.mExternalPartnerCode() : null;
                            if (strMExternalPartnerCode != null && !C2576A.H(strMExternalPartnerCode)) {
                                ((f) cVar2.f6042b).c.e(voucher);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        c12.e.setOnClickListener(new View.OnClickListener(this) { // from class: Ic.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f2288b;

            {
                this.f2288b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        f fVar = this.f2288b;
                        Callback.onClick_enter(view);
                        try {
                            fVar.c.f(fVar.f2291d);
                            return;
                        } finally {
                        }
                    default:
                        f fVar2 = this.f2288b;
                        Callback.onClick_enter(view);
                        try {
                            V2.c cVar2 = fVar2.f2290b;
                            Voucher voucher = fVar2.f2291d;
                            cVar2.getClass();
                            String strMExternalPartnerCode = voucher != null ? voucher.mExternalPartnerCode() : null;
                            if (strMExternalPartnerCode != null && !C2576A.H(strMExternalPartnerCode)) {
                                ((f) cVar2.f6042b).c.e(voucher);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
