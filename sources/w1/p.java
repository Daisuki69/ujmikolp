package w1;

import M8.T2;
import android.util.SparseBooleanArray;
import android.widget.ImageView;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters;
import com.paymaya.R;
import java.util.ArrayList;
import v1.C2334a;
import v1.C2335b;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f20581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t tVar) {
        super(tVar);
        this.f20581d = tVar;
    }

    @Override // w1.r, androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(o oVar, int i) {
        super.onBindViewHolder(oVar, i);
        if (i > 0) {
            oVar.f20580b.setVisibility(((q) this.f20586b.get(i + (-1))).e ? 0 : 4);
        }
    }

    @Override // w1.r
    public final void f(o oVar) {
        oVar.f20579a.setText(R.string.exo_track_selection_none);
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= this.f20586b.size()) {
                break;
            }
            if (((q) this.f20586b.get(i4)).e) {
                i = 4;
                break;
            }
            i4++;
        }
        oVar.f20580b.setVisibility(i);
        oVar.itemView.setOnClickListener(new qf.d(this, 9));
    }

    @Override // w1.r
    public final void g(String str) {
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2, T2 t22) {
        boolean z4 = false;
        int i = 0;
        while (true) {
            if (i >= arrayList2.size()) {
                break;
            }
            if (((q) arrayList2.get(i)).e) {
                z4 = true;
                break;
            }
            i++;
        }
        t tVar = this.f20581d;
        ImageView imageView = tVar.f20589B0;
        if (imageView != null) {
            imageView.setImageDrawable(z4 ? tVar.f20599S : tVar.f20600T);
            tVar.f20589B0.setContentDescription(z4 ? tVar.f20601U : tVar.f20602V);
        }
        this.f20585a = arrayList;
        this.f20586b = arrayList2;
    }

    public final void i() {
        t tVar = this.f20581d;
        C2335b c2335b = tVar.f20640x0;
        if (c2335b != null) {
            DefaultTrackSelector$Parameters defaultTrackSelector$ParametersA = c2335b.a();
            defaultTrackSelector$ParametersA.getClass();
            C2334a c2334a = new C2334a(defaultTrackSelector$ParametersA);
            for (int i = 0; i < this.f20585a.size(); i++) {
                int iIntValue = ((Integer) this.f20585a.get(i)).intValue();
                c2334a.b(iIntValue);
                SparseBooleanArray sparseBooleanArray = c2334a.f20431I;
                if (!sparseBooleanArray.get(iIntValue)) {
                    sparseBooleanArray.put(iIntValue, true);
                }
            }
            C2335b c2335b2 = tVar.f20640x0;
            c2335b2.getClass();
            c2335b2.b(c2334a);
            tVar.u0.dismiss();
        }
    }
}
