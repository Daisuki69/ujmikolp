package Z;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.paymaya.R;
import defpackage.AbstractC1414e;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends RecyclerView.Adapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CTInboxListViewFragment f6853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6854b;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f6854b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        int iOrdinal = ((CTInboxMessage) this.f6854b.get(i)).f9564p.ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i4 = 1;
        if (iOrdinal != 1) {
            i4 = 2;
            if (iOrdinal != 2) {
                i4 = 3;
                if (iOrdinal != 3) {
                    return -1;
                }
            }
        }
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        ((k) viewHolder).E((CTInboxMessage) this.f6854b.get(i), this.f6853a, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new w(AbstractC1414e.e(viewGroup, R.layout.inbox_simple_message_layout, viewGroup, false));
        }
        if (i == 1) {
            return new g(AbstractC1414e.e(viewGroup, R.layout.inbox_icon_message_layout, viewGroup, false));
        }
        if (i == 2) {
            return new d(AbstractC1414e.e(viewGroup, R.layout.inbox_carousel_text_layout, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new b(AbstractC1414e.e(viewGroup, R.layout.inbox_carousel_layout, viewGroup, false));
    }
}
