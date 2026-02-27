package J8;

import D8.C0193a;
import N5.o1;
import N5.p1;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import cj.C1110A;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.KycDisabledDocumentSelection;
import com.paymaya.domain.model.KycDocument;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.i f2457b;
    public int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2458d;
    public final kotlin.jvm.internal.i e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2459g;
    public final KycDisabledDocumentSelection h;

    /* JADX WARN: Multi-variable type inference failed */
    public c(List acceptedIdList, Function0 function0, int i, String str, Function1 function1, boolean z4, boolean z5, KycDisabledDocumentSelection kycDisabledDocumentSelection) {
        kotlin.jvm.internal.j.g(acceptedIdList, "acceptedIdList");
        this.f2456a = acceptedIdList;
        this.f2457b = (kotlin.jvm.internal.i) function0;
        this.c = i;
        this.f2458d = str;
        this.e = (kotlin.jvm.internal.i) function1;
        this.f = z4;
        this.f2459g = z5;
        this.h = kycDisabledDocumentSelection;
    }

    public final void e() {
        this.c = -1;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f2456a.size();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.jvm.functions.Function0, kotlin.jvm.internal.i] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        b holder = (b) viewHolder;
        kotlin.jvm.internal.j.g(holder, "holder");
        KycDocument document = (KycDocument) this.f2456a.get(i);
        kotlin.jvm.internal.j.g(document, "document");
        ?? actionEnableButton = this.f2457b;
        kotlin.jvm.internal.j.g(actionEnableButton, "actionEnableButton");
        C0193a c0193a = holder.f2455b;
        c0193a.getClass();
        String additionalDescription = document.getAdditionalDescription();
        b bVar = (b) c0193a.c;
        if (additionalDescription == null || additionalDescription.length() == 0) {
            bVar.D(document, false);
        } else {
            bVar.D(document, true);
        }
        if (c0193a.f1033b && C1110A.v((List) c0193a.f1034d, document.getKey())) {
            ViewBinding viewBinding = bVar.f2454a;
            if (viewBinding instanceof p1) {
                p1 p1Var = (p1) viewBinding;
                ConstraintLayout constraintLayout = p1Var.f4179b;
                kotlin.jvm.internal.j.f(constraintLayout, "constraintLayout");
                bVar.F(constraintLayout, p1Var.f4180d, p1Var.e, p1Var.c);
            } else if (viewBinding instanceof o1) {
                o1 o1Var = (o1) viewBinding;
                ConstraintLayout constraintLayout2 = o1Var.f4171b;
                kotlin.jvm.internal.j.f(constraintLayout2, "constraintLayout");
                bVar.F(constraintLayout2, o1Var.e, o1Var.f, o1Var.f4172d);
            }
        }
        ViewBinding viewBinding2 = holder.f2454a;
        View root = viewBinding2.getRoot();
        kotlin.jvm.internal.j.f(root, "getRoot(...)");
        c cVar = holder.c;
        C.r0(root, new E8.p(cVar, holder, document, (Function0) actionEnableButton));
        if (viewBinding2 instanceof o1) {
            o1 o1Var2 = (o1) viewBinding2;
            boolean z4 = cVar.c == holder.getBindingAdapterPosition();
            o1Var2.f4171b.setBackgroundResource(z4 ? R.drawable.maya_background_selected_card_green : R.drawable.maya_background_card_gray);
            o1Var2.c.setVisibility(z4 ? 0 : 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7 A[PHI: r13
  0x00b7: PHI (r13v5 int) = (r13v4 int), (r13v7 int) binds: [B:19:0x007f, B:21:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r12, int r13) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: J8.c.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }
}
