package N6;

import androidx.recyclerview.widget.DiffUtil;
import com.paymaya.domain.model.VaultedCard;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends DiffUtil.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4325b;

    public c(ArrayList mOldVaultedCardList, List mNewVaultedCardList) {
        j.g(mOldVaultedCardList, "mOldVaultedCardList");
        j.g(mNewVaultedCardList, "mNewVaultedCardList");
        this.f4324a = mOldVaultedCardList;
        this.f4325b = mNewVaultedCardList;
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areContentsTheSame(int i, int i4) {
        VaultedCard vaultedCard = (VaultedCard) this.f4324a.get(i);
        VaultedCard vaultedCard2 = (VaultedCard) this.f4325b.get(i4);
        return j.b(vaultedCard.getCardName(), vaultedCard2.getCardName()) && j.b(vaultedCard.mCardTokenId(), vaultedCard2.mCardTokenId());
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final boolean areItemsTheSame(int i, int i4) {
        return j.b(this.f4324a.get(i), this.f4325b.get(i4));
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getNewListSize() {
        return this.f4325b.size();
    }

    @Override // androidx.recyclerview.widget.DiffUtil.Callback
    public final int getOldListSize() {
        return this.f4324a.size();
    }
}
