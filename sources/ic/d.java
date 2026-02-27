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
public final class d extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1 f2284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J5.c f2285b;
    public final Ac.c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Voucher f2286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C1 c12, A picasso, Ac.c cVar) {
        super(c12.f3571b);
        j.g(picasso, "picasso");
        this.f2284a = c12;
        this.f2285b = new J5.c(this, 16);
        this.c = cVar;
        final int i = 0;
        c12.f3574k.setOnClickListener(new View.OnClickListener(this) { // from class: Ic.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2283b;

            {
                this.f2283b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        d dVar = this.f2283b;
                        Callback.onClick_enter(view);
                        try {
                            dVar.c.f(dVar.f2286d);
                            return;
                        } finally {
                        }
                    default:
                        d dVar2 = this.f2283b;
                        Callback.onClick_enter(view);
                        try {
                            J5.c cVar2 = dVar2.f2285b;
                            Voucher voucher = dVar2.f2286d;
                            cVar2.getClass();
                            String strMExternalPartnerCode = voucher != null ? voucher.mExternalPartnerCode() : null;
                            if (strMExternalPartnerCode != null && !C2576A.H(strMExternalPartnerCode)) {
                                ((d) cVar2.f2418b).c.e(voucher);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        c12.e.setOnClickListener(new View.OnClickListener(this) { // from class: Ic.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f2283b;

            {
                this.f2283b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        d dVar = this.f2283b;
                        Callback.onClick_enter(view);
                        try {
                            dVar.c.f(dVar.f2286d);
                            return;
                        } finally {
                        }
                    default:
                        d dVar2 = this.f2283b;
                        Callback.onClick_enter(view);
                        try {
                            J5.c cVar2 = dVar2.f2285b;
                            Voucher voucher = dVar2.f2286d;
                            cVar2.getClass();
                            String strMExternalPartnerCode = voucher != null ? voucher.mExternalPartnerCode() : null;
                            if (strMExternalPartnerCode != null && !C2576A.H(strMExternalPartnerCode)) {
                                ((d) cVar2.f2418b).c.e(voucher);
                            }
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
