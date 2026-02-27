package w5;

import androidx.recyclerview.widget.DiffUtil;

/* JADX INFO: renamed from: w5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2383a extends DiffUtil.ItemCallback {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        return obj.equals(obj2);
    }
}
