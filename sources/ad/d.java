package ad;

import N5.Y0;
import Pc.e;
import Y6.o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.paymaya.domain.model.ShareSaveAppInfo;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends RecyclerView.ViewHolder implements Zc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y0 f7134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BottomSheetDialogFragment f7135b;
    public ShareSaveAppInfo c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Y0 y0, Rc.e eVar) {
        super(y0.f4038b);
        j.g(eVar, numX49.tnTj78("buQV"));
        this.f7134a = y0;
        this.f7135b = (BottomSheetDialogFragment) eVar;
        e eVar2 = new e();
        this.f7136d = eVar2;
        eVar2.h(this);
        this.itemView.setOnClickListener(new o(this, 8));
    }
}
