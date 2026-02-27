package N5;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes4.dex */
public final class G implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NestedScrollView f3625b;
    public final RecyclerView c;

    public /* synthetic */ G(NestedScrollView nestedScrollView, RecyclerView recyclerView, int i) {
        this.f3624a = i;
        this.f3625b = nestedScrollView;
        this.c = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3624a) {
        }
        return this.f3625b;
    }
}
