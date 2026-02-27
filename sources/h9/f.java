package H9;

import E9.i;
import N5.C0462k;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.callback.Callback;
import com.paymaya.domain.model.MissionV2;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FragmentActivity f2156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f2157b;
    public final B9.e c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public MissionV2 f2158d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f2159g;
    public final ConstraintLayout h;
    public final ImageView i;
    public final ImageView j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Group f2160k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C0462k c0462k, FragmentActivity context, i iVar, com.paymaya.data.preference.a mPreference) {
        super((ConstraintLayout) c0462k.f4131b);
        j.g(context, "context");
        j.g(mPreference, "mPreference");
        this.f2156a = context;
        this.e = (TextView) c0462k.c;
        this.f = (TextView) c0462k.i;
        this.f2159g = (TextView) c0462k.e;
        ConstraintLayout notStartedItemContainerLayout = (ConstraintLayout) c0462k.f;
        j.f(notStartedItemContainerLayout, "notStartedItemContainerLayout");
        this.h = notStartedItemContainerLayout;
        TextView textView = (TextView) c0462k.f4132d;
        this.i = (ImageView) c0462k.f4134k;
        this.j = (ImageView) c0462k.f4133g;
        this.f2160k = (Group) c0462k.j;
        this.c = new B9.e(this, mPreference);
        this.f2157b = iVar;
        final int i = 0;
        notStartedItemContainerLayout.setOnClickListener(new View.OnClickListener(this) { // from class: H9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f2155b;

            {
                this.f2155b = this;
            }

            /* JADX WARN: Type inference failed for: r2v5, types: [E9.f, com.paymaya.common.base.MayaBaseLoadingFragment] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        f fVar = this.f2155b;
                        Callback.onClick_enter(view);
                        try {
                            fVar.f2157b.d(fVar.f2158d);
                            return;
                        } finally {
                        }
                    default:
                        f fVar2 = this.f2155b;
                        Callback.onClick_enter(view);
                        try {
                            i iVar2 = fVar2.f2157b;
                            iVar2.f1341a.d(fVar2.f2158d);
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: H9.e

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f2155b;

            {
                this.f2155b = this;
            }

            /* JADX WARN: Type inference failed for: r2v5, types: [E9.f, com.paymaya.common.base.MayaBaseLoadingFragment] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        f fVar = this.f2155b;
                        Callback.onClick_enter(view);
                        try {
                            fVar.f2157b.d(fVar.f2158d);
                            return;
                        } finally {
                        }
                    default:
                        f fVar2 = this.f2155b;
                        Callback.onClick_enter(view);
                        try {
                            i iVar2 = fVar2.f2157b;
                            iVar2.f1341a.d(fVar2.f2158d);
                            return;
                        } finally {
                        }
                }
            }
        });
    }
}
