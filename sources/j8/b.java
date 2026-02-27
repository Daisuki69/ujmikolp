package J8;

import D8.C0193a;
import N5.o1;
import N5.p1;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import cj.C1132s;
import com.paymaya.R;
import com.paymaya.domain.model.KycDisabledDocumentSelection;
import com.paymaya.domain.model.KycDocument;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewBinding f2454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0193a f2455b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, ViewBinding viewBinding) {
        super(viewBinding.getRoot());
        this.c = cVar;
        this.f2454a = viewBinding;
        this.f2455b = new C0193a(this, C1132s.g("PH_NATIONAL_ID", "PHILSYS_DIGITAL", "EPHIL_ID"), cVar.f2459g);
    }

    public static void E(TextView textView, TextView textView2, TextView textView3, KycDocument kycDocument, boolean z4) {
        int i = 8;
        textView.setVisibility(z4 ? 0 : 8);
        textView.setText(kycDocument.getAdditionalDescription());
        textView2.setText(kycDocument.getDescription());
        String subDescription = kycDocument.getSubDescription();
        if (subDescription != null && subDescription.length() != 0) {
            i = 0;
        }
        textView3.setVisibility(i);
        textView3.setText(kycDocument.getSubDescription());
    }

    public final void D(KycDocument kycDocument, boolean z4) {
        ViewBinding viewBinding = this.f2454a;
        if (viewBinding instanceof o1) {
            o1 o1Var = (o1) viewBinding;
            E(o1Var.f4172d, o1Var.e, o1Var.f, kycDocument, z4);
        } else if (viewBinding instanceof p1) {
            p1 p1Var = (p1) viewBinding;
            E(p1Var.c, p1Var.f4180d, p1Var.e, kycDocument, z4);
        }
    }

    public final void F(ConstraintLayout constraintLayout, TextView textView, TextView textView2, TextView textView3) {
        constraintLayout.setBackgroundResource(R.drawable.maya_background_card_gray);
        Iterator it = C1132s.g(textView, textView2).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            KycDisabledDocumentSelection kycDisabledDocumentSelection = this.c.h;
            if (!zHasNext) {
                textView2.setText(kycDisabledDocumentSelection.getDescription());
                textView3.setText("");
                return;
            }
            ((TextView) it.next()).setTextColor(kycDisabledDocumentSelection.getDisabledColor());
        }
    }
}
