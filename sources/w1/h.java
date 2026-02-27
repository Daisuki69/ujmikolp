package w1;

import M8.T2;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.paymaya.R;
import java.util.ArrayList;
import v1.C2334a;
import v1.C2335b;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20568d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(t tVar) {
        super(tVar);
        this.f20568d = tVar;
    }

    @Override // w1.r
    public final void f(o oVar) {
        oVar.f20579a.setText(R.string.exo_track_selection_auto);
        C2335b c2335b = this.f20568d.f20640x0;
        c2335b.getClass();
        c2335b.a();
        if (this.f20585a.size() > 0) {
            ((Integer) this.f20585a.get(0)).intValue();
            throw null;
        }
        oVar.f20580b.setVisibility(0);
        oVar.itemView.setOnClickListener(new qf.d(this, 7));
    }

    @Override // w1.r
    public final void g(String str) {
        this.f20568d.f20633s0.f20577b[1] = str;
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2, T2 t22) {
        int size = arrayList.size();
        t tVar = this.f20568d;
        if (size > 0) {
            ((Integer) arrayList.get(0)).intValue();
            t22.getClass();
            throw null;
        }
        if (arrayList2.isEmpty()) {
            n nVar = tVar.f20633s0;
            nVar.f20577b[1] = tVar.getResources().getString(R.string.exo_track_selection_none);
        } else {
            n nVar2 = tVar.f20633s0;
            nVar2.f20577b[1] = tVar.getResources().getString(R.string.exo_track_selection_auto);
        }
        this.f20585a = arrayList;
        this.f20586b = arrayList2;
    }

    public final void i() {
        t tVar = this.f20568d;
        C2335b c2335b = tVar.f20640x0;
        if (c2335b != null) {
            DefaultTrackSelector$Parameters defaultTrackSelector$ParametersA = c2335b.a();
            defaultTrackSelector$ParametersA.getClass();
            C2334a c2334a = new C2334a(defaultTrackSelector$ParametersA);
            for (int i = 0; i < this.f20585a.size(); i++) {
                c2334a.b(((Integer) this.f20585a.get(i)).intValue());
            }
            C2335b c2335b2 = tVar.f20640x0;
            c2335b2.getClass();
            c2335b2.b(c2334a);
        }
        n nVar = tVar.f20633s0;
        nVar.f20577b[1] = tVar.getResources().getString(R.string.exo_track_selection_auto);
        tVar.u0.dismiss();
    }
}
