package a7;

import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.paymaya.R;
import com.paymaya.domain.model.ContactReferenceLearnMore;
import com.paymaya.mayaui.common.view.widget.MayaHtmlTextView;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileLearnMoreBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;

/* JADX INFO: renamed from: a7.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0654o extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7048b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C0654o(int i, Object obj, Object obj2) {
        this.f7047a = i;
        this.f7048b = obj;
        this.c = obj2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        Object obj = this.c;
        Object obj2 = this.f7048b;
        int i = this.f7047a;
        kotlin.jvm.internal.j.g(widget, "widget");
        switch (i) {
            case 0:
                int i4 = MayaHtmlTextView.e;
                G5.t tVar = ((MayaHtmlTextView) obj2).f11270a;
                if (tVar != null) {
                    tVar.m((String) obj, widget);
                }
                break;
            default:
                MayaProfileLearnMoreBottomSheetDialogFragment mayaProfileLearnMoreBottomSheetDialogFragment = new MayaProfileLearnMoreBottomSheetDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("LEARN_MORE_ARG", (ContactReferenceLearnMore) obj2);
                mayaProfileLearnMoreBottomSheetDialogFragment.setArguments(bundle);
                mayaProfileLearnMoreBottomSheetDialogFragment.show(((MayaUserContactReferenceFragment) obj).getChildFragmentManager(), "MayaProfileLearnMoreBottomSheetDialogFragment");
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        int i = this.f7047a;
        kotlin.jvm.internal.j.g(ds, "ds");
        switch (i) {
            case 0:
                super.updateDrawState(ds);
                int i4 = MayaHtmlTextView.e;
                ds.setUnderlineText(((MayaHtmlTextView) this.f7048b).f11271b);
                break;
            default:
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
                ds.setColor(ContextCompat.getColor(((MayaUserContactReferenceFragment) this.c).requireContext(), R.color.grown_green));
                break;
        }
    }
}
