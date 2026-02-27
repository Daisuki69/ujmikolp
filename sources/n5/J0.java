package N5;

import android.view.View;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.liaoinstan.springview.widget.SpringView;

/* JADX INFO: loaded from: classes4.dex */
public final class J0 implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3692a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SpringView f3693b;
    public final View c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Group f3694d;
    public final SpringView e;
    public final RecyclerView f;

    public J0(SpringView springView, View view, Group group, SpringView springView2, RecyclerView recyclerView) {
        this.f3693b = springView;
        this.c = view;
        this.f3694d = group;
        this.e = springView2;
        this.f = recyclerView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        switch (this.f3692a) {
        }
        return this.f3693b;
    }

    public J0(SpringView springView, SpringView springView2, RecyclerView recyclerView, View view, Group group) {
        this.f3693b = springView;
        this.e = springView2;
        this.f = recyclerView;
        this.c = view;
        this.f3694d = group;
    }
}
