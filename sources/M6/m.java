package M6;

import L6.ViewOnClickListenerC0318d;
import N5.F;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.widget.ItemSlideLayoutView;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaVaultedCardsFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MayaVaultedCardsFragment f3123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemSlideLayoutView f3124b;
    public final ImageView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f3125d;
    public final TextView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConstraintLayout f3126g;
    public final A7.f h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(F f, MayaVaultedCardsFragment listener) {
        super((ItemSlideLayoutView) f.f3615d);
        kotlin.jvm.internal.j.g(listener, "listener");
        this.f3123a = listener;
        ItemSlideLayoutView viewContainer = (ItemSlideLayoutView) f.i;
        kotlin.jvm.internal.j.f(viewContainer, "viewContainer");
        this.f3124b = viewContainer;
        this.c = (ImageView) f.f3616g;
        this.f3125d = (TextView) f.e;
        this.e = (TextView) f.c;
        this.f = (TextView) f.h;
        this.f3126g = (ConstraintLayout) f.f3614b;
        this.h = new A7.f(this, 14);
    }

    public static final void D(m mVar) {
        VaultedCard vaultedCard = (VaultedCard) mVar.h.c;
        kotlin.jvm.internal.j.d(vaultedCard);
        MayaVaultedCardsFragment mayaVaultedCardsFragment = mVar.f3123a;
        mayaVaultedCardsFragment.getClass();
        L6.F f = mayaVaultedCardsFragment.t0;
        if (f != null) {
            AddMoneyViaCardSettings addMoneyViaCardSettings = (AddMoneyViaCardSettings) mayaVaultedCardsFragment.P1().f;
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) f;
            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = new MayaCashInViaCardFormFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("vaultedCard", vaultedCard);
            bundle.putParcelable("settings", addMoneyViaCardSettings);
            mayaCashInViaCardFormFragment.setArguments(bundle);
            AbstractC1236z.i(mayaCashInActivity, R.id.frame_layout_container, mayaCashInViaCardFormFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
        }
    }

    public static final void E(m mVar) {
        int absoluteAdapterPosition = mVar.getAbsoluteAdapterPosition();
        VaultedCard vaultedCard = (VaultedCard) mVar.h.c;
        kotlin.jvm.internal.j.d(vaultedCard);
        MayaVaultedCardsFragment mayaVaultedCardsFragment = mVar.f3123a;
        mayaVaultedCardsFragment.getClass();
        L6.F f = mayaVaultedCardsFragment.t0;
        if (f != null) {
            String strMLastFourDigits = vaultedCard.mLastFourDigits();
            kotlin.jvm.internal.j.f(strMLastFourDigits, "mLastFourDigits(...)");
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) f;
            MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231379, mayaCashInActivity.getString(R.string.maya_label_card_pull_remove_card_title), mayaCashInActivity.getString(R.string.maya_format_card_pull_remove_card_description, strMLastFourDigits), mayaCashInActivity.getString(R.string.maya_label_unlink), mayaCashInActivity.getString(R.string.pma_label_cancel), false, null, new ViewOnClickListenerC0318d(mayaVaultedCardsFragment, absoluteAdapterPosition, vaultedCard, 2), false, 352);
            mayaErrorDialogFragmentZ.f11850c0 = mayaVaultedCardsFragment;
            mayaErrorDialogFragmentZ.show(mayaCashInActivity.getSupportFragmentManager(), "error_dialog");
        }
    }
}
